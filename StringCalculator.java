import java.util.*;
public class StringCalculator
{
	static int Add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		else if(numbers.contains(","))
		{
			String[] nums = numbers.split(",|\n");
			int sum=0;
			for(int i=0;i<nums.length;i++)
			{
				sum+=Integer.parseInt(nums[i]);
			}
			return sum;
		}
		else
		{
			return Integer.parseInt(numbers);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = "1,2\n3";
		System.out.print(Add(a));


	}

}
