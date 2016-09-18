import java.util.*;
import java.io.*;

public class CollectionsExample 
{
	public int GetBookPosition() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int position = Integer.parseInt(br.readLine());
		return position;
	}

	public  String GetBookName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the book you want to put on the shelf:- ");
		String book = br.readLine();
		return book;
	}

	public  int getAction() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		try
		{
			System.out.println("Do you want to add or remove a book from the shelf?\n 1. Add a book. \n 2.Remove a book.");
			choice = Integer.parseInt(br.readLine());
			if(choice != 1 && choice !=2)
			{
				getAction();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return choice;
	}
	
}

class CollectionProgram {

	public static void main(String args [])
	{
		try
		{
			CollectionsExample eg = new CollectionsExample();
			new BufferedReader(new InputStreamReader(System.in));
			int position, action;
			LinkedList<String> shelf = new LinkedList<String>();
			
			shelf.add("Bone collector");
			shelf.add("Every tear is a waterfall");
			shelf.add("Hiding in the city");
			shelf.add("Hyde the mystery");
			shelf.add("New years theme party");
			shelf.add("Yellow blue moon");
			
			System.out.println("The books on the shelf are:- "+shelf);
			
			action = eg.getAction();
			
			switch(action)
			{
				case 1:
					String BookName = eg.GetBookName();
					
					System.out.println("At what position would you like to put the book?");
					int pos = eg.GetBookPosition();
					pos = pos - 1;
					if(pos > shelf.size())
					{
						position = shelf.size() + 1;
					}
					shelf.add(pos, BookName);
					
					System.out.println("The books on the shelf are:- "+shelf);
					break;
				case 2:
					System.out.println("Enter the position of the book you want to remove");
					position = eg.GetBookPosition();
					position = position - 1;
					if(position > shelf.size())
					{
						position = shelf.size() + 1;
					}
					shelf.remove(position);
					System.out.println("The books on the shelf are:- "+shelf);
					break;
			}
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
	}
}
