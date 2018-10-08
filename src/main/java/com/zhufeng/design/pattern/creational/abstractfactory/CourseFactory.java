package com.zhufeng.design.pattern.creational.abstractfactory;

/**
 * 这里抽象类也是可以的
 * @author zhufeng
 *
 */
public interface CourseFactory {
	Video getVideo();
	Article getArticle();
}
