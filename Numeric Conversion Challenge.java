package q22545;

import java.util.Scanner;

public class FloatToInt {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        float floatValue = scanner.nextFloat();

		int intValue = (int) floatValue;

		System.out.println(intValue);
       
		scanner.close();
    }
}
