package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Base {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pandi\\eclipse-workspace\\AutomationTest\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		test.log(Status.PASS, "Browser has been initialised");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static String readConfig(String key) throws IOException
	{
		File file=new File("C:\\Users\\pandi\\eclipse-workspace\\AutomationTest\\src\\test\\resources\\config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	} 
	
	public static String readExcelData(String sheet,int row, int column) throws IOException
	{
		File file=new File("C:\\Users\\pandi\\Desktop\\Testing.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String value=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return value;
	}
	public static void opensApplication() throws IOException
	{
		driver.get(readConfig("URL"));
		test.log(Status.PASS, "URL Launched Success !");
	}

}
