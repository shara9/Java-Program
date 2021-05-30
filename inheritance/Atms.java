class Start
{
static int balance=10;
	void starts()
	{
		
	}
}
class Diposite extends Start
{
	void diposited()
	{
	int diposite=40;
	balance=balance+diposite;
	System.out.println(balance);
	}
}
class Atms
{
	public static void main(String[] agrs)
	{
	Diposite a=new Diposite();
	a.diposited();
	a.starts();
	}
}