package hw3;

public class p27 {
	public static void main(String[] args)
	{
		Carp27 car1;
		car1 = new Carp27();
		car1.show();
		
		Carp27 car2;
		car2 = new Carp27(1234,25.0);
		car2.show();
	}
}

//Car類別
class Carp27
{
	private int num;
	private double gas;
	
	public Carp27()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Carp27(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產的車號為"+num+"，汽油輛違"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號:"+num);
		System.out.println("氣油量:"+gas);
	}

}