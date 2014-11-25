package singleton_multiThread_doubleCheckLocking;
//双重锁定
//我们不用让线程每次都加锁，而只是在实例未被创建的时候再加锁处理，
//同时也能保证多线程的安全。


public class Singleton {
	
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		//先判断实体是否存在，不存在再加锁处理
		if(instance == null)
		{
			synchronized(instance)
			{
				if(instance == null)
				{
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}

}
