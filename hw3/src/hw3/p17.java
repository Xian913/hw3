package hw3;

public class p17 {
	public static void main(String[] args)
	{
		Carp17 car1;
		car1 = new Carp17();
		
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("調查樣品車時得知:");
		System.out.println("車號="+number+" , 氣油量="+gasoline);
	}
}

//Car類別
class Carp17
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油輛");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+num+" , 汽油量設為:"+gas);
	}
}