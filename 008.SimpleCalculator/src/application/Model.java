package application;

public class Model
{
	public float Calulate(long number1, long number2, String operator)
	{
		switch (operator)
		{
			case "+":
			{
				return number1 + number2;
			}
			case "-":
			{
				return number1 - number2;
			}
			case "*":
			{
				return number1 * number2;
			}
			case "/":
			{
				if(number2==0)
				{
					return 0;
				}
				else
				{
					return ((float)number1 / (float)number2);
				}
				
			}
		}
		
		return 0;
	}
}
