package com.service;

import java.util.HashMap;
import java.util.List;

import com.entity.AccountMember;

public interface AccountMemService {
	public AccountMember findByAccountId(String accountID);

	public int validLogin(HashMap<String, String> map);

	public void insertAccount(AccountMember accountMem);

	public void updatePasswd(AccountMember accountMem);

	public List<AccountMember> selectAccounts(AccountMember accountMem);

	public void updateAccountStatus(String accountID);

	public void updateAccountInfo(AccountMember accountMem);

	public void updateAccountPasswd(String accountID);
}
