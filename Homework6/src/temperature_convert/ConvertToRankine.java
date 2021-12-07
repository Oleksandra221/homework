package temperature_convert;

public class ConvertToRankine extends BaseConverter{
	
	@Override
	public double  convert(double celsius) {
		System.out.print( celsius + " after conversion to Rankine is: ");
		double rankine = (celsius + 273.15) * 9/5;
		return rankine;
	}
}
