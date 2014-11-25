package singleton_multiThread_doubleCheckLocking;
//˫������
//���ǲ������߳�ÿ�ζ���������ֻ����ʵ��δ��������ʱ���ټ�������
//ͬʱҲ�ܱ�֤���̵߳İ�ȫ��


public class Singleton {
	
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		//���ж�ʵ���Ƿ���ڣ��������ټ�������
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
