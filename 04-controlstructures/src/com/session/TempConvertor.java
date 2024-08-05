package com.session;
import java.util.Scanner;
public class TempConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
       
        int choice = sc.nextInt();
        double result;
        switch(choice){
        case 1: result = (temperature * 9/5) + 32;
        System.out.println("The converted temperature is:"+result);
        break;
        
        case 2: result = (temperature - 32) * 5/9;
        System.out.println("The converted temperature is:"+result);
        break;
        
        case 3: result = (temperature + 273.15);
        System.out.println("The converted temperature is:"+result);
        break;
        
        case 4: result = (temperature- 273.15);
        System.out.println("The converted temperature is:"+result);
        break;
        
        case 5: result = (5/9)*(temperature + 459.67);
        System.out.println("The converted temperature is:"+result);
        break;
        
        case 6: result = (9/5)*(temperature - 273.15)+32;
        System.out.println("The converted temperature is:"+result);
        break;
        }

	}

}
