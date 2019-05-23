package cn.itcast.wk;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {
	
	@Scheduled(initialDelay=1000, fixedDelay=1000)
	public void firstTask(){
		System.out.println(new Date()+": 这是第1个定时任务");
	}
	
	@Scheduled(cron="*/5 * * * * ?")
	public void secondTask(){
		System.out.println(new Date()+": 这是第2个定时任务");
	}

}
