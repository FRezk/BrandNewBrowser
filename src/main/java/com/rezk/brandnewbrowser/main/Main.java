package com.rezk.brandnewbrowser.main;

import java.io.File;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Simple application to open a new and empty browser.
 * Brand New Browser .
 *
 *
 * @author Fernando Rezk (fernandorezk@outlook.com)
 * @since 06.2019
 */
public class Main {

	public static void main(String[] args) throws URISyntaxException {
			// Setting property
		String path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
		path = path.substring(0, path.lastIndexOf("/"));
		System.setProperty("webdriver.chrome.driver", path + "/driver/chromedriver.exe");
		
			// Preparing WebDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
			// Open and Maximize
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
