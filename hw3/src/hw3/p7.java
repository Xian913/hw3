package hw3;

public class p7 {
	public static void main(String[] args)
	{
		Carp7 car1;
		car1 = new Carp7();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Carp7 car2;
		car2 = new Carp7();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車號:"+car1.num);
		System.out.println("氣油量:"+car1.gas);
		
		System.out.println("車號:"+car2.num);
		System.out.println("氣油量:"+car2.gas);
	}
}

//Car類別
class Carp7
{
	int num;
	double gas;
}