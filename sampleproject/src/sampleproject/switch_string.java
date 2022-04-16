package sampleproject;

public class switch_string {

		public static void main(String[] args)
		{
			String name = "te";

			switch (name.toLowerCase()) 
			{
			case "author":
				System.out.println("Vismay");
				break;
			case "team":
				System.out.println("CT2C");
				break;
			case "editor":
				System.out.println("Program is Nice");
				break;
			default:
				System.out.println("Invalid entry");
				break;
		}
	}



}
