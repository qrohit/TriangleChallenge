package polygon.triangle.consoleapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import polygon.triangle.data.Triangle;
import polygon.triangle.data.TriangleBuilder;
import polygon.triangle.exception.TriangleBuilderException;


public class TriangleDetector {
	public static void main(String[] args) throws TriangleBuilderException {
		List<BigDecimal> sides = readSidesFromConsole();
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		
		System.out.println("");
		System.out.println(triangle.toString());
	}
	
	private static List<BigDecimal> readSidesFromConsole(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		List<BigDecimal> list = new ArrayList<>();
		System.out.println("Enter sides (3):");
		list.add(sc.nextBigDecimal());
		list.add(sc.nextBigDecimal());
		list.add(sc.nextBigDecimal());
		
		sc.close();
		
		return list;
	}
}
