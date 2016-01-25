import java.util.Scanner;

public class Path
{
	public static void main(String[] args) 
	{
		
	Scanner scan = new Scanner(System.in);
	String file = scan.next();
	int item;
	char c = file.charAt(0);
	char n = file.charAt(file.length()-1);
	String finalPart;
	System.out.print("/itemList/");
	if(c == 'i')
	{
		item = Character.getNumericValue(n)-1;
		System.out.print("items[" + item + "]");
		System.out.print("/id");
	}
	else if( c == 'I')
	{
		item = Character.getNumericValue(n)-1;
		System.out.print("items[" + item + "]");
		System.out.print("/label");
	}
	else if( (c == 's') && ((file.length() > 10) || (file.length()< 6)))
	{
		item = Character.getNumericValue(n)-1;
		if(Character.getNumericValue(n) == 1)
		{
			System.out.print("items[5]/id/subItem1/subitems[" + item + "]/id");
		}
		else if(Character.getNumericValue(n) == 2)
		{
			System.out.print("items[8]/id/subItem2/subitems[" + item + "]/id");
		}
	}
	else if( (c == 's') && (file.length() == 8))
	{
		if(Character.getNumericValue(n) == 1)
		{
			System.out.print("items[5]/id");
		}
		else if(Character.getNumericValue(n) == 2)
		{
			System.out.print("items[8]/id");
		}
	}
	else if( (c == 'S') )
	{
		item = Character.getNumericValue(n)-1;
		if(Character.getNumericValue(n) == 1)
		{
			System.out.print("items[5]/id/subItem1/subitems[" + item + "]/label");
		}
		else if(Character.getNumericValue(n) == 2)
		{
			System.out.print("items[8]/id/subItem2/subitems[" + item + "]/label");
		}
	}

	}
}