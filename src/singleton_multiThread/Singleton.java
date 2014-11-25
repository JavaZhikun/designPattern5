package singleton_multiThread;

public class Singleton 
{
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	private static Singleton getInstance()
	{
		synchronized(instance)
		{
			
				if(instance == null)
				{
					instance = new Singleton();
				}
				
			
		}
		
		return instance;
	}

}
