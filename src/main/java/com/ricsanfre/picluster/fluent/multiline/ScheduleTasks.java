package com.example.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Scheduled(fixedRate = 5000)
	public void logMultiline() {
		log.info("This is a multiline log: \nLine 2\nLine3\nLine4");
	}

	@Scheduled(fixedRate = 10000)
	public void logException() {
		try {
			applicationContext.getBean("test");
		} catch (Exception e) {
			throw new RuntimeException("Error happened", e);
		}
	}
}