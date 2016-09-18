import java.io.*;
import java.util.Arrays;

public class QueuesExample 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String items[] = new String[7];
	String randomData[] = {"Fix You", "Every tear is a waterfall", "Viva la vida", "hymm for the weekend", "Yellow", "Scientist", "Us against the world"};
	int i, front = 0, rear = 0, NoItems, count = 0;
	String item;
	void GetData()
	{
		for(int i=0; i < 5; i++)
		{
			if(!Arrays.asList(items).contains(randomData[i]))
			{
				items[rear] = randomData[i];
				rear++;
				count++;
			}
		}
	}

	public String AddNewItem()
	{
		String AddedStringName = ""; 
		for(int i=0; i < 7 ; i++)
		{
			if(!Arrays.asList(items).contains(randomData[i]))
			{
				items[rear] = randomData[i];
				System.out.println("Added Item :" + randomData[i]);
				AddedStringName = randomData[i];
				rear++;
				count++;
				break;
			}
		}
		
		return AddedStringName;
	}

	public String deleteItem()
	{
		String DeletedItem = "";
		try
		{
			if (count != 0) {
				System.out.println("Deleted Item :" + items[front]);
				DeletedItem = items[front];
				front++;
				count--;
			} 
			else
			{
				System.out.println("Queue IS Empty");
			}
			if (rear == front)
			{
				rear = 0;
				front = 0;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return DeletedItem;
	}

	void display()
	{
		int m = 0;
		if (count == 0)
		{
			System.out.println("Queue IS Empty");
		}
		else
		{
			for (i = front; m < count; i++, m++)
			{
				System.out.println(" " + items[i]);
			}
		}
	}
	
	public int EnterChoice() throws NumberFormatException, IOException
	{
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Add a Coldplay song to list. \n2.Dequeue\n3.Display\n4.Exit\n");
		System.out.println("Enter the Choice : ");
		choice = Integer.parseInt(br.readLine());
			
		return choice;
	}
}

class QueueProgram {

	public static void main(String arg[]) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		String name = "";
		QueuesExample queue = new QueuesExample();
		//queue.GetData();
		System.out.println("Queue\n\n");
		try
		{
			do
			{
				choice = queue.EnterChoice();
				switch (choice) 
				{
				case 1:
						 name = queue.AddNewItem();
					break;
				case 2:
					 	 name = queue.deleteItem();
					break;
				case 3:
						 queue.display();
					break;
				}
			} while (choice != 4);
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
