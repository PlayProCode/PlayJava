package com.sumit.playjava;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling //to enable scheduling in class
public class MySchedulerJob {
	
	//annotate with scheduler
	@Scheduled(cron="*/2 * * * * *")//for 2 sec
	public void showDate() {
		System.out.println("the date now is = "+new Date());
	}

}
