package com.aryak.securitydemo;

import java.util.Date;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@ConditionalOnProperty(value = "scheduling.enable", havingValue = "true")
public class HourlyJob {

	@Scheduled(fixedRate = 2000)
	public void job() {
		log.info("{}", new Date());
	}

	@Scheduled(cron = "${hourly.job}")
	private void job1() {
		log.info("1");
	}

	@Scheduled(cron = "${monthly.job}")
	private void job2() {
		log.info("2");
	}
}
