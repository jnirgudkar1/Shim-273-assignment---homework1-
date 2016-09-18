import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CollectionsExampleTest {
	
	CollectionsExample example = new CollectionsExample();

	@Test
	public void testGetBookPosition() throws NumberFormatException, IOException {
		int getPosition= example.GetBookPosition();
		assertTrue(getPosition == 1 || getPosition == 2 || getPosition == 3 || getPosition == 4 || getPosition == 5 || getPosition == 6 );
	}

	@Test
	public void testGetAction() {
		int getPosition= example.getAction();
		assertTrue(getPosition == 1 || getPosition == 2);
	}

}
