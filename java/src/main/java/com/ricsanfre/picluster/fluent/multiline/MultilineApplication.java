package com.ricsanfre.picluster.fluent.multiline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class MultilineApplication {
  private static Logger log= LoggerFactory.getLogger(MultilineApplication.class);

  public static void main(String[] args) {
	try {
		while(true) {

			log.info("This is an info level log message!");

			log.info("This is a multiline log message\nLine2\nLine3");

			generateLogStack();
			
			Thread.sleep(5000);
		}
	} catch (InterruptedException e) { 
             // Restore the interrupted status
             Thread.currentThread().interrupt();
    }

  }

  private static void generateLogStack()  {
	try {
		// Trying to open an non-existing file
		FileWriter fw = new FileWriter(new File("/home/loggly/WriterClass/myFile.txt"));
		fw.write("Testing\n");
		fw.close();
		}
	catch (IOException e) {
		log.error("Unable to open file.", e);
	}
  }
}
