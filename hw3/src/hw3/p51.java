package hw3;

public class p51 {
	public static void main(String[] args)
	{
		Carp51[] car1;
		car1 = new Carp51[3];
		for(int i=0; i<car1.length; i++) {
			car1[i] = new Carp51();
		}
		
		car1[0].setCar(1234,20.5);
		car1[1].setCar(2345,30.5);
		car1[2].setCar(3456,40.5);
		
		for(int i=0; i<car1.length; i++)
		{
			car1[i].show();
		}
	}
}
//Car類別
class Carp51
{
	int num;
	double gas;
	
	public Carp51()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產的車號為"+num+"，汽油輛違"+gas);
	}
	
	public void show()
	{
		System.out.println("車號:"+num);
		System.out.println("氣油量:"+gas);
	}
}