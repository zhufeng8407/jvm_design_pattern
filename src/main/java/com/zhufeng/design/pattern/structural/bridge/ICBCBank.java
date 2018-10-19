package com.zhufeng.design.pattern.structural.bridge;

public class ICBCBank extends Bank {

	public ICBCBank(Account account) {
		super(account);
	}

	@Override
	public Account openAccount() {
		return account.openAccount();
	}

}
