package com.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.AccountMember;
import com.service.AccountMemService;

@Service("accountMemService")
public class AccountMemServiceImpl implements AccountMemService {

	@Override
	public AccountMember findByAccountId(String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validLogin(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertAccount(AccountMember accountMem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePasswd(AccountMember accountMem) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<AccountMember> selectAccounts(AccountMember accountMem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAccountStatus(String accountID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccountInfo(AccountMember accountMem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccountPasswd(String accountID) {
		// TODO Auto-generated method stub

	}

}
