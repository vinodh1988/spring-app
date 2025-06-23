package com.solution.process;

import org.springframework.stereotype.Component;

@Component("publish")
public class Publish implements ProjectTasks {

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
     System.out.println("Executing publish task");
	}

}
