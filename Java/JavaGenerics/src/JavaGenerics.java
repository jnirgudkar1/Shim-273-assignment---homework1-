import java.util.*;

class Guitar
{
    public String Name;
    public int Cost;

    Guitar(String name,int cost)
    {
         this.Name=name;
         this.Cost=cost;
    }
}


class Music
{
	public String Singer;
	public String BandName;
	
	Music(String name,String band)
    {
         this.Singer=name;
         this.BandName=band;
    }
}

class ListClass
{
    public static void main(String args[])
    {
          List<Guitar> list = new ArrayList<Guitar>();
          list.add(new Guitar("Yamaha",500));
          list.add(new Guitar("Les Paul",1200));
          list.add(new Guitar("B.C Rich",150));

          

          Iterator<Guitar> guitar=list.iterator();
          while (guitar.hasNext()) {
        	  Guitar g = guitar.next();
            System.out.println(g.Name + " " + g.Cost);
          }
          
          System.out.println("\n\n");
          
          List<Music> music = new ArrayList<Music>();
          music.add(new Music("Chris Martin", "Coldplay"));
          music.add(new Music("James Hetfield", "Metallica"));
          music.add(new Music("Freddie Mercury", "Queen"));
          
          Iterator<Music> M = music.iterator();
          while(M.hasNext())
          {
        	  Music s = M.next();
        	  System.out.println(s.Singer + " " + s.BandName);
          }
    }
}