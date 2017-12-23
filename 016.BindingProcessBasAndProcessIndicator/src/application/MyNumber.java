package application;
import javafx.beans.property.*;
public class MyNumber
{
	private DoubleProperty number;

	public final double getNumber()
	{
		if(number != null)
		{
			return number.get();
		}
		else
		{
			return 0;
		}
		
		
	}

	public final void setNumber(double number)
	{
		this.numberProperty().set(number);
	}
	
	public final DoubleProperty numberProperty()
	{
		if(number==null)
		{
			number=new SimpleDoubleProperty(0.0);
		}
		return number;
	}
}
