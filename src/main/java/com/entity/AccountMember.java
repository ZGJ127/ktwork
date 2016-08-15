package com.entity;

public class AccountMember {
	private String accountID;
	private String accountNameEN;
	private String accountNameCN;
	private String passwd;
	private int status;
	private int accountType;
	private int accountPerms;
	private int sexID;

	private String birthDate;
	private String phoneNum;
	private String mailAdd;
	private String homeAdd;
	private String createDate;
	private String creater;
	private String editDate;
	private String editer;
	private String ext1;
	private String ext2;

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getEditDate() {
		return editDate;
	}

	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}

	public int getAccountPerms() {
		return accountPerms;
	}

	public void setAccountPerms(int accountPerms) {
		this.accountPerms = accountPerms;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountNameEN() {
		return accountNameEN;
	}

	public void setAccountNameEN(String accountNameEN) {
		this.accountNameEN = accountNameEN;
	}

	public String getAccountNameCN() {
		return accountNameCN;
	}

	public void setAccountNameCN(String accountNameCN) {
		this.accountNameCN = accountNameCN;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public int getSexID() {
		return sexID;
	}

	public void setSexID(int sexID) {
		this.sexID = sexID;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getMailAdd() {
		return mailAdd;
	}

	public void setMailAdd(String mailAdd) {
		this.mailAdd = mailAdd;
	}

	public String getHomeAdd() {
		return homeAdd;
	}

	public void setHomeAdd(String homeAdd) {
		this.homeAdd = homeAdd;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getEditer() {
		return editer;
	}

	public void setEditer(String editer) {
		this.editer = editer;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

}
