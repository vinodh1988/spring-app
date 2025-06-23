package com.solution.process;

import org.springframework.beans.factory.annotation.Autowired;

public class Integration {
  @Autowired
  private ProjectTasks publish;
  
  public void task() {
	System.out.println("Executing integration task");
	publish.executeTask();
  }
}
