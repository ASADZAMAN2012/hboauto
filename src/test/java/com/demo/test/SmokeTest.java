package com.demo.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest
{
	@Test
	public void clickMenuItem() throws InterruptedException
	{
		driver.findElement(By.name("menu")).click();
		Thread.sleep(5000);
	}
}
