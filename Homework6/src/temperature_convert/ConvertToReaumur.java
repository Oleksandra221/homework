package temperature_convert;

public class ConvertToReaumur extends BaseConverter{
	
	@Override
	public double  convert(double celsius) {
		System.out.print( celsius + " after conversion to Reaumur is: ");
		double reaumur = celsius*0.80000;
		return reaumur;
	}
}
