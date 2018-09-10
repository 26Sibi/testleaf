package day3;

public class mobile {

	public static void main(String[] args) {
	iphone iph=new iphone();
	iph.model(2017);
	
	}
	public void makeCall(String network)
	{
		switch(network)
		{
			case "2g":System.out.println("Calling through 2g");
			break;
			case "3g" : System.out.println("Calling through 3g");
			break;
			case "4g" : System.out.println("Calling through 4g");
		}
	}
	

}
