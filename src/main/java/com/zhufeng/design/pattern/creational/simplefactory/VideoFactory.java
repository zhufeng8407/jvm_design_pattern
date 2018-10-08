package com.zhufeng.design.pattern.creational.simplefactory;

public class VideoFactory {

	public Video getVideoByClass(Class<?> clz) {
		Video video = null;
		try {
			video = (Video) Class.forName(clz.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return video;
	}

	/**
	 * 不满足开闭原则，当需要其他课程时需要修改此方法的逻辑
	 */
	public Video getVideo(String type) {
		if ("java".equals(type)) {
			return new JavaVideo();
		} else if ("python".equals(type)) {
			return new PythonVideo();
		} else {
			return null;
		}
	}
}
