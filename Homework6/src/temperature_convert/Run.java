package temperature_convert;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseConverter fahr = new ConvertToFahrenheit();
		BaseConverter kalvin = new ConvertToKalvin();
		BaseConverter reaumur = new ConvertToReaumur();
		BaseConverter rankine = new ConvertToRankine();
		
		BaseConverter[] arr = new BaseConverter[4];
		arr[0] = new ConvertToFahrenheit();
		arr[1] = new ConvertToKalvin();
		arr[2] = new ConvertToReaumur();
		arr[3] = new ConvertToRankine();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Write down in Celsius");
		double celsius = in.nextDouble();
		
		for (BaseConverter bc : arr) {
			System.out.println(bc.convert(celsius));
		}
		
	}

}
