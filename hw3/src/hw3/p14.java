package hw3;

public class p14 {
	public static void main(String[] args)
	{
		Carp14 car1;
		car1 = new Carp14();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}

//Car類別
class Carp14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("車號:"+this.num);
		
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("氣油量:"+this.gas);
		//System.out.println("開始顯示車子資料");
	}
}