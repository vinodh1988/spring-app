package com.solution.process;

import org.springframework.stereotype.Service;

@Service("design")
public class Design implements ProjectTasks {

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
          		System.out.println("Executing design task");
	}

}
