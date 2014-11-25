package singleton;

public class Singleton 
{
	private static Singleton instance;
	
	
	//���췽��Ϊprivate����Ͷ������������new��������ʵ���Ŀ���
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
