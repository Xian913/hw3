package hw3;

public class p6 {
	public static void main(String[] args)
	{
		Carp6 car1;
		car1 = new Carp6();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車號:"+car1.num);
		System.out.println("氣油量:"+car1.gas);
	}
}

//Car類別
class Carp6
{
	int num;
	double gas;
}
