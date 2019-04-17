import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
class CalculatorTest {

	@Test
	void test() {
		Calculator calculation=new Calculator();
		double result2=calculation.add(10,20);
		double result3=calculation.add(10, 20,30);
		double result4=calculation.add(1,10.2);
				assertEquals(30,result2);
				assertEquals(60,result3);
	}

}
