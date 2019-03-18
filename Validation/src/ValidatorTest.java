import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
class ValidatorTest {

	@Test
	void test() {
		
		
		assertEquals(null,Validator.validatePhoneNumber("018521 53044"));
		assertEquals(null,Validator.validateEmail("minhaz"));
		
		//fail("Not yet implemented");
	}

}
