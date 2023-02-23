package factorydesignpattern;

import java.util.Scanner;

class Food{
	
}
class Biryani extends Food{
	@Override 
	public String toString() {
		return "Order Biryani";
	}
}
class CurdRice extends Food{
	@Override 
	public String toString() {
		return "Order CurdRice";
	}
}
class EggFrideRice extends Food{
	@Override 
	public String toString() {
		return "Order EggFrideRice";
	}
}
class Hotel{
	Food OrderFood(int choice) {
		if(choice == 1) {
			Biryani b=new Biryani();
			return b;
		}
		if(choice == 2) {
			CurdRice c =new CurdRice();
			return c;
			
		}
		if(choice == 3) {
			EggFrideRice e=new EggFrideRice();
			return e;
		}
		
	else{
		return null;
	}
		
	}
}
public class Solution {
public static void main(String[] args) {
	Hotel h1=new Hotel();
	/**
	 Generalization 
	 Food obj=new Biryani();
	 Food obj =new CurdRice();
	 Food obj=new EggFrideRice();
	 Food obj =new EggFrideRice();
	 */
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("1:Biryani \n 2:CurdRice \n 3:EggFrideRice \n");
		System.out.println("enter the choice");
		Food obj=h1.OrderFood(sc.nextInt());
		System.out.println(obj+"\n");
		
//		method returning diffrent types of objects by having generalized returntype
	}
	
	
}
}
