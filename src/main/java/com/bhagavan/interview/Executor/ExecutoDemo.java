package com.bhagavan.interview.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoDemo {

	public static void main(String[] args) {
     CheckProcessorTask checks[] = {
    		 new CheckProcessorTask("ATM"),
    		 new CheckProcessorTask("bank"),
    		 new CheckProcessorTask("mobile"),
    		 new CheckProcessorTask("Web")
     };
     ExecutorService service = Executors.newFixedThreadPool(4);
     for (CheckProcessorTask checkProcessorTask : checks) {
    	 service.submit(checkProcessorTask);
	}
     service.shutdown();
	}

}
