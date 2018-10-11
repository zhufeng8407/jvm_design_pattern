package com.zhufeng.design.pattern.creational.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail = new Mail();
		mail.setContent("初始化模版");

		for (int i = 10; i < 10; i++) {
			Mail mailTemp = (Mail) mail.clone();
			mailTemp.setName("姓名" + i);
			mailTemp.setName("姓名" + i + "@163.com");
			mailTemp.setContent("恭喜你中奖了");
			MailUtil.sendMail(mailTemp);
		}

		MailUtil.saveOriginMailRecord(mail);
	}

}
