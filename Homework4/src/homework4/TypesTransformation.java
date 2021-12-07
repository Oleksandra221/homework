package homework4;

public class TypesTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*long x = 1234569999;
		int ch = (int)x;
		System.out.println(ch);*/
		
		String[][] array = new String[9][9];
		array[0][1] = "byte";
		array[0][2] = "short";
		array[0][3] = "char";
		array[0][4] = "int";
		array[0][5] = "long";
		array[0][6] = "float";
		array[0][7] = "double";
		array[0][8] = "boolean";
		
		array[1][0] = "byte";
		array[2][0] = "short";
		array[3][0] = "char";
		array[4][0] = "int";
		array[5][0] = "long";
		array[6][0] = "float";
		array[7][0] = "double";
		array[8][0] = "boolean";
		
		
		
		
			for (int i = 1, j = 1; i < 9 && j < 9; i++, j++) {
				String tmp = array[0][i-1];
				if ((tmp!=null)&&(tmp.equals(array[i-1][0]))){
					array[i-1][i-1] = "*";
				}
				if (i == 8) {
					array[i][i] = "*";
				}
			}
			
			for (int j = 1; j < 8; j++) {		
				for (int i = 2; i < 9; i++) {
					if(array[j][i-1]!="*") {
						array[j][i-1] = "na";
					} else if (array[j][i-1].equals("*")){
						array[j+1][i-1+1] = "a";
					}
						
				}
			}
			
			
		
			for (int j = 0; j < 9; j++) {
				for (int i = 0; i < 9; i++) {
					System.out.print(array[j][i] + " ");
				}
				System.out.println();
			}
		
	}

}
