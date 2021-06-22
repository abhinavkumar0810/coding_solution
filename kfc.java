import java.util.*;
abstract class Kfc
{
	public Kfc()
	{
		System.out.println("Kfc Constructor");
	}
	public void makeItem()
	{
		System.out.println("Start making Items");
	}
	abstract void offer();
	abstract void bill();
}
class MyKfc extends Kfc{
	

	void offer();
	{
		System.out.println("Normal Offers");
	}
	 void bill();
	{
		System.out.println("bill");
	}
	void festiveOffer()
	{
		System.out.println("Festive Offers");
	}
	
}
public class kfc
{
	public static void main(String args[])
	{
		Kfc s=new new MyKfc();
		s.makeItem();
		s.offer();
		s.festiveOffer();
		s.bill();
	}
}
		



