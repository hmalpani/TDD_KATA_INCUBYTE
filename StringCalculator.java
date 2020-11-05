import java.util.*;
public class StringCalculator
{
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

			String[] nums = numbers.split(delimiter);
			int sum=0;
			for(int i=0;i<nums.length;i++)
			{
				sum+=Integer.parseInt(nums[i]);
			}
			return sum;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = "//;\n1;2;3";
		System.out.print(Add(a));


	}

}
