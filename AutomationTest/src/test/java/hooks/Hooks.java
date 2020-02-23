package hooks;

import Base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import reports.ReportUtility;

public class Hooks extends Base {
	
	@Before
	public void setUp()
	{
		System.out.println("This is the before method");
		ReportUtility obj=new ReportUtility();
		obj.initiateReport();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("This is the tearDpown method");
		ReportUtility obj=new ReportUtility();
		obj.closeTheReport();
		driver.close();
		driver.quit();
	}

}
