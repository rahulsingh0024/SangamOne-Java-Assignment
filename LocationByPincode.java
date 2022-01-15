package locationByPincode;

import java.util.Scanner;

public class LocationByPincode {
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pincode =");
		int a=sc.nextInt();
		
		if(a==762104)
		{
			String name="Daringbadi, orissa";
			System.out.println("The location name=  "+name);
		}
	}
}
