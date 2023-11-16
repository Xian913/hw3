package hw3;

public class p11 {
	public static void main(String[] args)
	{
		Carp11 car1;
		car1 = new Carp11();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

//Car類別
class Carp11
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號:"+this.num);
		System.out.println("氣油量:"+this.gas);
	}
}