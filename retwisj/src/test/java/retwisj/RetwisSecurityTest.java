package retwisj;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.RetwisSecurity;

public class RetwisSecurityTest {

	@Before
	public void initConnexion() {
		RetwisSecurity.setUser("John", "Do");
	}
	
	@Test
	public void testConnexion() {
		assertEquals(RetwisSecurity.getName(), "John");
		assertEquals(RetwisSecurity.getUid(), "Do");  
	}
	
	@Test
	public void testUserSignedIn() {
		assert RetwisSecurity.isUserSignedIn(RetwisSecurity.getName());
	}
	
	@Test
	public void testUserIsSigned() {
		assert RetwisSecurity.isSignedIn();  
	}
	
	@Test
	public void testUseClean() {
		RetwisSecurity.clean();
		assertEquals(null,RetwisSecurity.getName());
	}

}
