import java.io.*;

public class InterfaceImplementation implements PlayInterface {
	
	public void playBird(int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Chirp \n");
		}
	}
	
	public void playSong(int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Sa Re Ga Ma Pa \n");
		}
	}
	
	public void playMusic(int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.print("F#   C   G#   A   B \n");
		}
	}
	
	public static void main(String [] arg)
	{
		int ans = 1, times;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InterfaceImplementation imple = new InterfaceImplementation();
		try
		{
			do
			{
				System.out.println("Which type of music would you like to hear?\n");
				System.out.print("1.Birds chirping.\n 2.Singing. \n 3. Music playing. \n 4.Quit\n");
				ans = Integer.parseInt(br.readLine());
				if(ans==4)
				{
					break;
				}
				System.out.println("How many times would you like to hear it?\n");
				times = Integer.parseInt(br.readLine());
				switch(ans)
				{
					case 1:
							imple.playBird(times);
						break;
					case 2:
							imple.playSong(times);
						break;
					case 3:
							imple.playMusic(times);
						break;
					default:
						System.out.println("You chose,..., poorly!");
						break;
				}
			}while(ans!=4);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
