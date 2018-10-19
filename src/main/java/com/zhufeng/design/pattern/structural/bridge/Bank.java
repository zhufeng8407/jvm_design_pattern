package com.zhufeng.design.pattern.structural.bridge;

public abstract class Bank {

	protected Account account;

	public Bank(Account account) {
		super();
		this.account = account;
	};
	
	public abstract Account openAccount();
}
