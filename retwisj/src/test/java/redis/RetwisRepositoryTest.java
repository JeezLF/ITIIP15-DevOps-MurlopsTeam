package redis;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.redis.RetwisRepository;

public class RetwisRepositoryTest {

	@Before
	public void init() {
		//RetwisRepository retwisRepository = new RetwisRepository("");
	}
	
	@Test
	public void test() {
		assert true;
	}
	
	@Test
	public void addUserTest() {
		String name = "admin";
		String password = "password";
		System.out.println(name + " " + password);
		
		
	}
	
	

}
