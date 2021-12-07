package temperature_convert;

public class ConvertToKalvin extends BaseConverter{
	
	@Override
	public double  convert(double celsius) {
		System.out.print( celsius + " after conversion to Kalvin is: ");
		double kalvin = celsius + 273.15;
		return kalvin;
	}
}
