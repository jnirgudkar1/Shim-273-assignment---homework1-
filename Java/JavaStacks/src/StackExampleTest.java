import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class StackExampleTest {

	StackExample stack = new StackExample();
	@Test
	public void testAddNewItem() {
		String getSong= stack.AddNewItem();
		assertTrue(getSong=="Fix You"|| getSong == "Every tear is a waterfall" || getSong == "Viva la vida" || getSong== "hymm for the weekend" || getSong== "Yellow" || getSong == "Scientist" || getSong== "Us against the world");
	}

	@Test
	public void testDeleteItem() {
		String getSong= stack.AddNewItem();
		assertTrue(getSong=="Fix You"|| getSong == "Every tear is a waterfall" || getSong == "Viva la vida" || getSong== "hymm for the weekend" || getSong== "Yellow" || getSong == "Scientist" || getSong== "Us against the world");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertTrue(stack.isFull());
	}

	@Test
	public void testEnterChoice() throws NumberFormatException, IOException {
		int getChoice= stack.EnterChoice();
		assertTrue(getChoice==1 || getChoice == 2);
	}

}
