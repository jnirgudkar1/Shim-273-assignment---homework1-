import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ArraysExampleTest {
	
	//public static ArraysExample arr = new ArraysExample();

	@Test
	public void testGetJukeBoxColumn() throws NumberFormatException, IOException {
		int getColumn= ArraysExample.GetJukeBoxColumn();
		assertTrue(getColumn == 0 || getColumn == 1);
	}

	@Test
	public void testGetJukeBoxRow() throws NumberFormatException, IOException {
		int getRow= ArraysExample.GetJukeBoxRow();
		assertTrue(getRow == 0 || getRow == 1 || getRow == 2);
	}

	@Test
	public void testGetCDSong() {
		int getSondId= ArraysExample.GetCDSong();
		assertTrue(getSondId == 0 || getSondId == 1 || getSondId == 2 || getSondId == 3 || getSondId == 4);
	}

	@Test
	public void testGetChoice() {
		int getChoice = ArraysExample.GetChoice();
		assertTrue(getChoice == 1 || getChoice == 2);
	}

}
