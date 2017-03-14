/**
 * 
 */
package polygon.data.triangle;

import java.math.BigDecimal;
import java.util.List;

import polygon.data.triangle.Triangle;
import polygon.data.triangle.TriangleAngularType;
import polygon.data.triangle.TriangleType;

/**
 * @author rohit
 *
 */
public class TriangleBuilder {

	public static Triangle buildTriangle(List<BigDecimal> sides){
		
		validateTriangleSides(sides);
		
		TriangleType  triangleType = detectTriangleType(sides);
		TriangleAngularType triangleAngularType = detectTriangleAngularType(sides);
		
		return new Triangle(sides, triangleType, triangleAngularType);
	}
	
	
	private static TriangleType detectTriangleType(List<BigDecimal> sides){
		return null;
	}
	
	private static TriangleAngularType detectTriangleAngularType(List<BigDecimal> sides){
		return null;
		
	}
	
	private static void validateTriangleSides(List<BigDecimal> sides){
		
	}
}
