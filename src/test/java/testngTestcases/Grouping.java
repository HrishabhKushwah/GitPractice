package testngTestcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"smoke"})
	public void first() {
		System.out.println("first testcase");
	}
	@Test(groups= {"regression"})
	public void second() {
		System.out.println("second testcase");
		String str = null;
		System.out.println("some value");
		//assertEquals(false, null);
	}
	@Test(groups= {"smoke"})
	public void third() {
		System.out.println("third testcase");
	}
}
/*
<suite name="Suite">
	<test thread-count="5" name="Test">
		<groups>
			<run>
				<include name="regression"></include>
			</run>
		</groups>
		<classes>
			<class name="testngTestcases.Grouping" />
		</classes>
	</test> 
</suite> 
*/

