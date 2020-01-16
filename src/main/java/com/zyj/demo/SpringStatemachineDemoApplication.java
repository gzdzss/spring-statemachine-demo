package com.zyj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class SpringStatemachineDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringStatemachineDemoApplication.class, args);
	}

	@Autowired
	private StateMachine<States, Events> stateMachine;


	@Override
	public void run(String... args) throws Exception {
		stateMachine.sendEvent(Events.E1);
		stateMachine.sendEvent(Events.E2);
	}
}
