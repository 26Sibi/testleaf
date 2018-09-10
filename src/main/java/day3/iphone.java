package day3;

public class iphone {

	public static void main(String[] args) {

		/*mobile mob=new mobile();
		mob.makeCall("4g");
	*/
	}

	public void model(int make)
	{
		if(make<2015)
		{System.out.println("Iphone 5s");}
		else if(make<2017)
		{System.out.println("Iphone 6s");}
		else if(make<2019)
		{System.out.println("Iphone X");}
		else
		{System.out.println("Upcoming");}
	}
}
