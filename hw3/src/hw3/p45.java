package hw3;

public class p45 {
	public static void main(String[] args)
	{
		System.out.println("宣告car1");
		Carp45 car1;
		car1 = new Carp45();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Carp45 car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(2345,30.5);
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
		car2.show();
		
	}
}

//Car類別
class Carp45
{
	private int num;
	private double gas;
	
	public Carp45()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num +"，汽油量設為" + gas);
	}
	
	public void show()
	{
		System.out.println("車號:"+num);
		System.out.println("氣油量:"+gas);
	}

}