package singleton;

public class Singleton 
{
	private static Singleton instance;
	
	
	//构造方法为private，这就堵死了外界利用new创建此类实例的可能
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	

}
