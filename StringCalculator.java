import java.util.*;
import java.io.*;
public class StringCalculator
{
	public static String[] nums;
	static int Add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		else
		{
			String delimiter = ",|\n";
			if(numbers.startsWith("//"))
			{
				delimiter+="|"+numbers.charAt(2);
				numbers = numbers.substring(4,numbers.length());
			}

			//String[] nums = numbers.split(delimiter);
			nums = numbers.split(delimiter);
			int sum=0;
			
			for(int i=0;i<nums.length;i++)
			{	
				if(nums[i].charAt(0)=='-')
					throw new RuntimeException();
				sum+=Integer.parseInt(nums[i]);
			}
			return sum;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = "//;\n1;2;3;4;5";
		try{
			System.out.print(Add(a));
		}
		catch(RuntimeException e)
		{
			System.out.print("Negatives not allowed\n");
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i].contains("-"))
				{
					for(int j=0;j<nums[i].length();j++)
					{
						System.out.print(nums[i].charAt(j));
					}
					System.out.println();
				}
			}
		}

	}

}
