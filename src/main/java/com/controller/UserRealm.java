package com.controller;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.AccountMember;
import com.service.AccountMemService;

public class UserRealm extends AuthorizingRealm {

	@Autowired
	private AccountMemService accountMemService;

	// 授权操作
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String accountID = (String) principals.getPrimaryPrincipal();
		AccountMember acc = accountMemService.findByAccountId(accountID);

		String roleStrings = acc.getExt2();
		// 权限名的集合
		Set<String> roles = new HashSet<String>();

		if (roleStrings != null && !"".equals(roleStrings)) {
			if (roleStrings.indexOf(",") != -1) {
				String[] roleStrs = roleStrings.split(",");
				int len = roleStrs.length;
				for (int i = 0; i < len; i++) {
					roles.add(roleStrs[i]);
				}
			} else {
				roles.add(roleStrings);
			}
		}

		// // Iterator<Role> it = roleSet.iterator();
		// // while(it.hasNext()){
		// // roles.add(it.next().getName());
		// // for(Permission per:it.next().getPermissionSet()){
		// // permissions.add(per.getName());
		// // }
		// // }
		//
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.addRoles(roles);
		// authorizationInfo.addStringPermissions(permissions);
		return authorizationInfo;
	}

	// 认证操作
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String accountID = (String) token.getPrincipal();
		AccountMember acc = accountMemService.findByAccountId(accountID);

		if (acc == null) {
			// 木有找到用户
			throw new UnknownAccountException("没有找到该账号");
		}

		/**
		 *
		 * 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
		 */
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(acc.getAccountID(), acc.getPasswd(), getName());
		return info;
	}

	@Override
	public String getName() {
		return getClass().getName();
	}
}
