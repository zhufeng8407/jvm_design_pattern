package com.zhufeng.design.pattern.structural.adapter.example2;

import java.util.List;

public interface LogDbOperateApi {

	List<LogModel> readDbLogFile();
	
	void writeDbLogFile(List<LogModel> list);
}
