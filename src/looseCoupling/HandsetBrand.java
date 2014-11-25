package looseCoupling;

public abstract class HandsetBrand 
{
	protected HandsetSoft soft;
	
	//设置手机软件
	public void setHandsetSoft(HandsetSoft soft)
	{
		this.soft = soft;
	}

	public abstract void run();
}
