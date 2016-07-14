package com.vp.adpautomation;

import org.openqa.selenium.TimeoutException;


public class AppBootstrap {

	public static void main(String[] args) 
	{
		System.out.println("Starting Process...");
		try 
		{
			new ADPAutomation().Start();
		} 
		catch (TimeoutException e)
		{
			System.out.println("The application timed out trying to reach an element. Please try again later.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedClassVersionError e)
		{
			System.out.println("Please update your Java version!");
		}

		
		System.out.println("Finish!");
		
		 
	}


	

}
