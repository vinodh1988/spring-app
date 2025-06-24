package com.solution.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Integration {
  @Autowired
  private ProjectTasks task;
  
  public void task() {
	System.out.println("Executing integration task");
	task.executeTask();
  }
}
