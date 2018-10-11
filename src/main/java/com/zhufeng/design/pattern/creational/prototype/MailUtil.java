package com.zhufeng.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {

	public static void sendMail(Mail mail) {
		String oupputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2} 发送邮件";
		System.out.println(
				MessageFormat.format(oupputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
	}

	public static void saveOriginMailRecord(Mail mail) {
		System.out.println("存储OriginMail记录，originMail：" + mail.getContent());
	}
}
