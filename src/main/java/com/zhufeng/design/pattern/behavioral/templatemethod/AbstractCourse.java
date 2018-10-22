package com.zhufeng.design.pattern.behavioral.templatemethod;

public abstract class AbstractCourse {

	protected final void makeCourse() {
		makePPT();
		makeVideo();
		if (needWriteArticle()) {
			writeArticle();
		}
		packageCourse();
	}
	
	final void makePPT() {
		System.out.println("制作PPT");
	}
	
	final void makeVideo() {
		System.out.println("制作视频");
	}
	
	final void writeArticle() {
		System.out.println("编写手记");
	}
	
	// 钩子方法
	protected boolean needWriteArticle() {
		return false;
	}
	
	abstract void packageCourse();
	
}
