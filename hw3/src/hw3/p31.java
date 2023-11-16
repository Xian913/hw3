package hw3;

public class p31 {
	public static void main(String[] args)
	{
		Carp31.showSum();
		
		Carp31 car1;
		car1 = new Carp31();
		car1.setCar(1234,20.5);
		
		Carp31 car2;
		car2 = new Carp31();
		car2.setCar(4567,30.5);
	}
}

//Car類別
class Carp31
{
	private static int sum = 0;
	
	private static int num;
	private double gas;
	
	public Carp31()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有"+num+"台");
	}
	
	public void show()
	{
		System.out.println("車號:"+num);
		System.out.println("氣油量:"+gas);
	}
}