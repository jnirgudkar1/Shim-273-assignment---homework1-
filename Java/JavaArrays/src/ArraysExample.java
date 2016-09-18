//import java.util.*;
import java.io.*;

//consider the example of a jukebox
public class ArraysExample {

	public String[][] jukebox = new String[][]{
		 	{"Unforgiven","Ride the Lightning"},
		    {"Nothing else matters","Fuel"},
		    {"Whisky in the jar","Master of puppets"}
	};
	
	public String [] CD = new String[]
			{
					"Why Georgia","Neon","Body is a wonderland","3x5","Gravity" 	
			} ;
	
	void printCDList()
	{
		for(int i = 0;i<CD.length;i++)
		{
			System.out.println(CD[i]);
		}
	}
	
	void printCDSong(int i)
	{
		System.out.println("You chose to play:- " + CD[i]);
	}
	
	void printJukeBoxSong(int i, int j)
	{
		System.out.println("You chose to play:- " + jukebox[i][j]);
	}
	
	void printJukeBox()
	{
		for(int i=0;i<3;i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(jukebox[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	public static int GetJukeBoxColumn() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		System.out.println("Enter the Column number");
		
		do
		{
			choice = Integer.parseInt(br.readLine());
		}while(choice == 1 && choice == 2);
		
		return choice-1;
	}
	
	public static int GetJukeBoxRow() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		System.out.println("Enter the row number");
		
		do
		{
			choice = Integer.parseInt(br.readLine());
		}while(choice == 1 && choice == 2 && choice == 3);
		
		return choice-1;
	}
	
	public static int GetCDSong() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		try
		{
			do
			{
				
				System.out.println("Which song do you want to listen to?");
				choice = Integer.parseInt(br.readLine());
			}while(choice==1 && choice ==2 && choice ==3 && choice ==4 && choice ==5);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return choice-1;
	}

	public static int GetChoice() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		try
		{
			do
			{
				System.out.println("Do you want to listen to a CD or a Jukebox? \n1.) CD. \n2.) Jukebox.");
				choice = Integer.parseInt(br.readLine());
			}while(choice !=1 && choice !=2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return choice;
	}
	
}
 
class play
{
	static ArraysExample play = new ArraysExample();
	public static void main(String[] arg) throws NumberFormatException, IOException
	{
		
		//play.printCDList();
		System.out.println("\n");
		
		int choice = ArraysExample.GetChoice();
		switch(choice)
		{
			case 1:
				play.printCDList();
				int Song = ArraysExample.GetCDSong();
				play.printCDSong(Song);
				break;
			case 2:
				play.printJukeBox();
				int i = ArraysExample.GetJukeBoxRow();
				int j = ArraysExample.GetJukeBoxColumn();
				play.printJukeBoxSong(i, j);
				break;
		}
	}
}
