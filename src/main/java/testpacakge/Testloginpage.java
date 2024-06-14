package testpacakge;

import org.testng.annotations.Test;

import basepacakge.Baseclass;
import pagepacakge.Loginpage;
import utilpackge.Excelutils;

public class Testloginpage extends Baseclass{
	Loginpage loginpage;
	
	
	@Test(priority = 1)
	public void verifysignin() {
		loginpage=new Loginpage(driver);
		loginpage.register();
		
		String xl="F:\\oxygensite.xlsx";
		String sheet="Sheet1";
		
		int rowcount=Excelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++) {
			String username=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println(username);
			String password=Excelutils.getCellValue(xl, sheet, i, 1);
			System.out.println(password);
			loginpage.setvaues(username, password);
			loginpage.userlogin();
			  
		}
	}
	
	

}
