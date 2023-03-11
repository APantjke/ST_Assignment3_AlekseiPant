package com.example.Jacoco_example;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene Triangle", Triangle.checkTriangle(8, 7, 9));
        assertEquals("Scalene Triangle", Triangle.checkTriangle(3, 4, 5));
        assertEquals("Scalene Triangle", Triangle.checkTriangle(100, 101, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles Triangle", Triangle.checkTriangle(5, 5, 8));
        assertEquals("Isosceles Triangle", Triangle.checkTriangle(5, 8, 8));
        assertEquals("Isosceles Triangle", Triangle.checkTriangle(3, 2, 2));
    }

    @Test
    public void testEquilateralTriangle() {
    	assertEquals("Equilateral Triangle", Triangle.checkTriangle(5, 5, 5));
    	assertEquals("Equilateral Triangle", Triangle.checkTriangle(1, 1, 1));
    	assertEquals("Equilateral Triangle", Triangle.checkTriangle(6, 6, 6));
    }

    @Test
    public void testInvalidTriangle() {
        assertEquals("Not a Triangle", Triangle.checkTriangle(3, 4, 7));
    }

    @Test
    public void testNegativeSides() {
        assertEquals("Not a Triangle", Triangle.checkTriangle(-1, 2, 3));
        assertEquals("Not a Triangle", Triangle.checkTriangle(-3, -4, -5));
        assertEquals("Not a Triangle", Triangle.checkTriangle(-0.1, 2, 2));
    }

    @Test
    public void testZeroSides() {
        assertEquals("Not a Triangle", Triangle.checkTriangle(0, 2, 3));
        assertEquals("Not a Triangle", Triangle.checkTriangle(0, 0, 0));
        assertEquals("Not a Triangle", Triangle.checkTriangle(0, 2, 2));
    }

    @Test
    public void testInfinitySides() {
        assertEquals("Not a Triangle", Triangle.checkTriangle(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
    }
    
    @Test
    public void testDecimalSides() {
        assertEquals("Isosceles Triangle", Triangle.checkTriangle(1.5, 1.5, 2.5));
        assertEquals("Scalene Triangle", Triangle.checkTriangle(1.9, 1.5, 2.5));
        assertEquals("Equilateral Triangle", Triangle.checkTriangle(2.5, 2.5, 2.5));
    }
    
}