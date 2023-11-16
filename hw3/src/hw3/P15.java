package hw3;

public class P15 {
	public static void main(String[] args)
	{
		Carp15 car1;
		car1 = new Carp15();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
	}
}

//Car類別
class Carp15
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+num+" , 汽油量設為:"+gas);
		
	}
	
	void show()
	{
		System.out.println("車號:"+this.num);
		System.out.println("氣油量:"+this.gas);
		//System.out.println("開始顯示車子資料");
	}
}