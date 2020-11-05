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
				delimiter+="|";
				int temp=2;
				for(temp=2;!(numbers.charAt(temp)=='\n');temp++)
					delimiter+=numbers.charAt(temp);
				numbers = numbers.substring(++temp,numbers.length());
			}

			//String[] nums = numbers.split(delimiter);
			nums = numbers.split(delimiter);
			int sum=0;
			
			for(int i=0;i<nums.length;i++)
			{	
				if(nums[i].charAt(0)=='-')
					throw new RuntimeException();
				else if(Integer.parseInt(nums[i])<=1000)
					sum+=Integer.parseInt(nums[i]);
			}
			return sum;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = "//;;;\n2;;;1001;;;3,4";
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
