package com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hpsf.Property;

public class log
{
	public static Logger log=Logger.getLogger("log");
	public static void  info(String message)
	
	{
	PropertyConfigurator.configure("Log4j.properties");
	log.info(message);
	
	}

}
