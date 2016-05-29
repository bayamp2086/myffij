package com.hpe.training.utils;

import java.text.SimpleDateFormat;

import org.testng.Reporter;

public class PrintUtils {
	
	/*
	 * Arguement of type String.
	 */
	public static void printToConsole(String msg,boolean printToTestNGReports){
		java.util.Date today = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
		String stringDate = dateFormat.format(today);

		System.out.println("******** " + stringDate+ ":"+ msg +" ********");
		if(printToTestNGReports){
			Reporter.log("******** " + stringDate+ ":"+ msg +" ********");
		}
	}
	
	public static void printToLog(String msg){
		//Write code to write to a log file
		//Log4J
	}
	
	public static void printToFile(String msg){
		//append all the message to a file under c:\tmp
		//results.txt
		
	}
	public static void printToDataBase(String msg){
		//Write code to write to a some database table
	}

}
