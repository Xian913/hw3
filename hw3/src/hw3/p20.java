package hw3;

public class p20 {
	public static void main(String[] args)
	{
		Carp20 car1;
		car1 = new Carp20();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	}
}

//Car類別
class Carp20
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號:"+this.num);
		System.out.println("氣油量:"+this.gas);
	}
}