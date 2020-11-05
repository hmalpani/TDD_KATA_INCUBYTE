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
			String[] nums = numbers.split(",");
			return Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
		}
		else
		{
			return Integer.parseInt(numbers);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.nextLine();
		System.out.print(Add(a));


	}

}
