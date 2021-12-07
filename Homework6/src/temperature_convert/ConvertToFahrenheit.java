package temperature_convert;

public class ConvertToFahrenheit extends BaseConverter{
	
	@Override
	public double convert(double celsius) {
		System.out.print( celsius + " after conversion to Fahrenheit is: ");
		double fahrenheit = (celsius*1.8) + 32;
		return fahrenheit;
	}
}
