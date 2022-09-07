package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class demo1 extends AppTest {
	@Parameters({"hello"})
	@Test
	public void test4(String input) {
		System.out.println("demo1 testsdfdsf11111"+input);
	}
	@Test(dataProvider="getData")
	public void test5(String data){
		System.out.println(data);
		//System.out.println(data1);
	System.out.println("demo1 test2222\"");	
	Assert.assertTrue(true);
	}
	@DataProvider
	public Object[] getData(){
		Object[] obj =new Object[2];
		obj[0]="h";
		obj[1]="2";
		
		return obj;
		
	}

}
