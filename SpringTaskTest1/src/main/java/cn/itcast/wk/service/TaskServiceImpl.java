package cn.itcast.wk.service;

import java.util.Date;

import org.springframework.stereotype.Service;

public class TaskServiceImpl implements TaskService{

	public void firstTask() {
		System.out.println(new Date() +": 这是第1个定时任务");
	}

	public void secondTask() {
		System.out.println(new Date() +": 这是第2个定时任务");
	}

}
