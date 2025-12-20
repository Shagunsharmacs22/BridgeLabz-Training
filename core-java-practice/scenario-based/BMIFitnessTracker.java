package ScenerioBased;

import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (kg) and height (cm):");
        double weight =sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0; 
        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);  
        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");    
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}