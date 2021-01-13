package com.example.loggen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LogGenApplication {

	private static final int NUM_LOGS = Integer.getInteger("num_logs", 20);
	private static final int NUM_MS = Integer.getInteger("num_ms", 10);

	private static final Logger log = LoggerFactory.getLogger(LogGenApplication.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			for (int i = 0; i < NUM_LOGS; i++) {
				log.info("Logger logging logs... This is a much longer log, The quick brown fox jumped over the lazy dog log ... but the dog log did not care as it was lazy and it enjoyed the excitement : " + dateFormat.format(new Date()));
			}
			Thread.sleep(NUM_MS);
		}
	}
}
