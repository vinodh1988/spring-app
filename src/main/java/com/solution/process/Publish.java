package com.solution.process;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("publish")
@Primary
public class Publish implements ProjectTasks {

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
     System.out.println("Executing publish task");
	}

}
