package com.zhufeng.design.pattern.behavioral.observer;

public class Question {

	private String userName;

	public Question(String userName, String questionContent) {
		super();
		this.userName = userName;
		this.questionContent = questionContent;
	}

	private String questionContent;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

}
