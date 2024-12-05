import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
     int choice;
     double temperature;
     try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Temperature Converter");
      System.out.println("1. Celsius to Fahrenheit");
      System.out.println("2. Fahrenheit to Celsius");
      System.out.print("Enter your choice: ");

      choice = scanner.nextInt();
      if (choice != 1 && choice != 2) {
       System.out.println("Invalid choice. Please enter 1 or 2.");
       return;

      }
      System.out.print("Enter the temperature: ");
      temperature = scanner.nextDouble();
     }
     double convertedTemperature;

        if (choice == 1) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " degrees Celsius is " + convertedTemperature + " degrees Fahrenheit.");
        }

        else {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " degrees Fahrenheit is " + convertedTemperature + " degrees Celsius.");
        }
    }
}