import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class QueuesExampleTest {

	QueuesExample song = new QueuesExample();
	@Test
	public void testAddNewItem() {
		String getSong= song.AddNewItem();
		assertTrue(getSong=="Fix You"|| getSong == "Every tear is a waterfall" || getSong == "Viva la vida" || getSong== "hymm for the weekend" || getSong== "Yellow" || getSong == "Scientist" || getSong== "Us against the world");

	}

	@Test
	public void testDeleteItem() {
		String getSong= song.deleteItem();
		assertTrue(getSong=="Fix You"|| getSong == "Every tear is a waterfall" || getSong == "Viva la vida" || getSong== "hymm for the weekend" || getSong== "Yellow" || getSong == "Scientist" || getSong== "Us against the world");

	}

	@Test
	public void testEnterChoice() throws NumberFormatException, IOException {
		int choice = song.EnterChoice();
		assertTrue(choice == 1 || choice == 2 || choice == 3 || choice == 4);
	}

}
