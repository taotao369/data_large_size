package cn.itcast.wk.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

	//@Scheduled(initialDelay=1000, fixedDelay=1000)
	@Scheduled(cron="*/5 * * * * ?")
	public void firstTask() {
		System.out.println(new Date() +": 这是第1个定时任务");
	}
	
	//@Scheduled(initialDelay=2000, fixedDelay=3000)
	@Scheduled(cron="0 17 16 * * ?")
	public void secondTask() {
		System.out.println(new Date() +": 这是第2个定时任务");
	}

}
