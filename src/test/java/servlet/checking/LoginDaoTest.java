package servlet.checking;

import org.junit.Test;

import junit.framework.Assert;

public class LoginDaoTest {

	@Test
	public void validate() {
		LoginDao ld = new LoginDao();
		String u1 = "sravan";
		String p1 = "sravan";
		

		boolean t1 = ld.validate(u1, p1);
		

		Assert.assertEquals("It passed with sravan and sravan", true, t1);
		
	}
	
	@Test
	public void validate2() {
		LoginDao ld = new LoginDao();
		String u2 = "username";
		String p2 = "password";

		boolean t2 = ld.validate(u2, p2);

		Assert.assertNotEquals("It is passed with worng credentials", true, t2);
	}
	
}
