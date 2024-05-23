package com.webtablecity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstColumnCityNames extends  basetest 
{
	@Test(priority=1,description="Captuing First Column City Names from the WebTable")
	public void capturingFirstColumnCityNames()
	{

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]


	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]





	String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpressionPart2="]/td[1]";

	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	//By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");
	                     // OR
	By cityNameProperty=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2);

	WebElement cityName=driver.findElement(cityNameProperty);

	String cityNameText=cityName.getText();
	System.out.println(cityNameText);
	}
	}

	}


