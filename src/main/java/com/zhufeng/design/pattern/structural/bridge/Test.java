package com.zhufeng.design.pattern.structural.bridge;

public class Test {

	public static void main(String[] args) {
		Bank icbcBank = new ICBCBank(new DepositAccount());
		icbcBank.openAccount();
	}

}
