import java.io.*;
import java.util.Arrays;

public class StackExample {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String items[] = new String[7];
	String randomData[] = {"Fix You", "Every tear is a waterfall", "Viva la vida", "hymm for the weekend", "Yellow", "Scientist", "Us against the world"};
	
	int i, top = 0, NoItems, count = 0;
	String item;
	
	void GetData()
	{
		
	}
	
	public String AddNewItem()
	{
		String name = "";
		for(int i=0; i < 7; i++)
		{
			if(!Arrays.asList(items).contains(randomData[i]))
			{
				System.out.println("Added Item :" + randomData[i]);
				items[++top] = randomData[i];
				name = randomData[i];
				count++;
				break;
			}
		}
		//System.out.println("Added item is " + name);
		return name;
	}
	
	public String deleteItem()
	{
		String name = "";
		try
		{
			if (count != 0) {
	            System.out.println("Deleted Item :" + items[top]);
	            name = items[top];
	            top--;
	            count--;
	        } 
			else
			{
	            System.out.println("Queue IS Empty");
	        }  
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//System.out.println("Deleted item is " + name);
		return name;
	}
	
	public boolean isEmpty() 
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
	    return (top == NoItems - 1);
	}
	
	void display()
	{
		int m = top;
        if (count == 0)
        {
            System.out.println("Stack IS Empty");
        }
        else
        {
    		while(top>0)
    		{
    			System.out.println(items[top]);
    			top--;
    		}
        }
        top = m;
	}
	
	public int EnterChoice() throws NumberFormatException, IOException
	{
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Add song to play next \n2.Remove next play song. \n3.Display\n 4.Exit\n");
		System.out.println("Enter the Choice : ");
		choice = Integer.parseInt(br.readLine());
			
		return choice;
	}
}

class StackProgram {

    public static void main(String arg[]) 
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        StackExample stack = new StackExample();
        stack.GetData();
        System.out.println("Stack\n\n");
        try
        {
            do
            {
                choice = stack.EnterChoice();
                switch (choice) 
                {
                    case 1:
                    	String song = stack.AddNewItem();
                        break;
                    case 2:
                    	String name = stack.deleteItem();
                        break;
                    case 3:
                    	stack.display();
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
