package com.zhufeng.design.pattern.structural.bridge;

public class SavingAccount implements Account {

	@Override
	public Account openAccount() {
		System.out.println("打开活期银行账户");
		return new DepositAccount();
	}

	@Override
	public void showAccountType() {
		System.out.println("这是一个活期账户");
	}

}
