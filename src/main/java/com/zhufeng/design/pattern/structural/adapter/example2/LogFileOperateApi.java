package com.zhufeng.design.pattern.structural.adapter.example2;

import java.util.List;

public interface LogFileOperateApi {

	List<LogModel> readLogFile();
	
	void writeLogFile(List<LogModel> list);
}
