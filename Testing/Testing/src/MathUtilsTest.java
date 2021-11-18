import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils MU;//declaring it for whole class
	
	@BeforeEach // below code will execute before every method
	void hookAnno() {
		 MU = new MathUtils();
		}
	
	@Nested // nesting class and grouping the methods together.
	@Tag("MATH")
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(2, MU.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-8, MU.add(-7, -1), 
					"Add method should return the sum of two numbers");
		}
	}

	@Test
	@Tag("MATH")
	void test() {
		
		
		 
		 int expected = 2;
		 int actual =  MU.add(1, 1);
		 
		 //Assertion class provides a bunch of assertion methods useful in writing 
		 //a test case.
		 assertEquals(expected, actual,"note/clue/msg about the test case ");
		 
	}
	// test driven development
	
	@DisplayName("Calulating area of the circle")
	@RepeatedTest(2)
	@Tag("MATH")
	void CircleArea() {
		
		assertEquals(314.1592653589793, MU.CircleArea(10),"Should return correct area.");
	}
	
	//Asserting exceptions with assertThrows
	@Test 
	@Tag("MATH")
	void TestDiv() {
		
		//MU.div(1, 0);
		assertThrows(ArithmeticException.class, ()-> MU.div(1, 0),"devide by zero throws exeption.");
		}
	@Test
	@Disabled // this Annotation skips the test. 
	@DisplayName("Testing Disable Annotation.")
	void TestDisable() {
		fail("Learnig Disable Annotation");
		}
	
	@Test
	@DisplayName("Multiply Method")
	void testMulti() {
	    //Assert all helps to pass multiple assertion in one shot.
		assertAll(
	    		()->assertEquals(2, MU.multi(2, 1)),
	    		()->assertEquals(4, MU.multi(2, 2)),
	    		()->assertEquals(-6, MU.multi(2, -3))
	    		
	    		);
	    
	}
	

}

/*    Things To avoid while testing.
 * 1. ordering the test(1,2,3,..)as the the test case execute randomly  we can do it using @order annotation 
 * 2. making tests cases dependent on each other.
 * 
 * hook annotations - `@BeforeAll`, `@BeforeEach`, `@AfterEach` and `@AfterAll`.
 * `@BeforeAll` and `@AfterAll` annotations work. And they need to be annotated on static methods only.as they
 *  execute even before the initialization of class , However the static method dose not have any dependency 
 *  on a instance we can run a static method even before the instance is get created
 *
 * @Tag annotation is used to sort the test in to different groups and run them.
 */
