package com.paymentStimulator.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExecutorApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ExecutorApplication.class, args);
		// Executor.initExecutor(args);
	}
}