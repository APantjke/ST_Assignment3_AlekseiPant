package com.example.Jacoco_example;

public class Triangle {
    
    public static String checkTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) 
            return "Not a Triangle";

        else if (a + b <= c || b + c <= a || c + a <= b) 
            return "Not a Triangle";

        else if (a == b && b == c)
        	return "Equilateral Triangle";
        
        else if (a == b || b == c || c == a)
        	return "Isosceles Triangle";
        
        else
        	return "Scalene Triangle";
    }
}