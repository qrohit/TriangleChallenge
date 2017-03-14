/**
 * 
 */
package polygon.triangle.data;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import polygon.triangle.data.Triangle;
import polygon.triangle.data.TriangleAngularType;
import polygon.triangle.data.TriangleType;
import polygon.triangle.exception.TriangleBuilderException;

/**
 * @author rohit
 *
 */
public class TriangleBuilder {

	public static Triangle buildTriangle(List<BigDecimal> sides) throws TriangleBuilderException{
		
		validateTriangleSides(sides);
		
		TriangleType  triangleType = detectTriangleType(sides);
		TriangleAngularType triangleAngularType = detectTriangleAngularType(sides);
		
		return new Triangle(sides, triangleType, triangleAngularType);
	}
	
	
	private static TriangleType detectTriangleType(List<BigDecimal> sides){
		if(sides.get(0).equals(sides.get(1)) && sides.get(2).equals(sides.get(1)))
			return TriangleType.EQUILATERAL;
		if(
				sides.get(0).equals(sides.get(1)) || 
				sides.get(1).equals(sides.get(2)) || 
				sides.get(2).equals(sides.get(0))
		){
			return TriangleType.ISOSCELES;
		}
		
		return TriangleType.SCALENE;
	}
	
	private static TriangleAngularType detectTriangleAngularType(List<BigDecimal> sides){
		
		// Pythagorian Theorum :)
		Collections.sort(sides);
		BigDecimal largestSquared = sides.get(2).pow(2);
		BigDecimal sumOfSmallerSquared = sides.get(0).pow(2).add(sides.get(1).pow(2));
		
		int compare = sumOfSmallerSquared.compareTo(largestSquared);
		
		if(compare == 0)
			return TriangleAngularType.RIGHTANGLE;
		
		else if(compare > 0)
			return TriangleAngularType.ACUTE;
		
		else return TriangleAngularType.OBSTUSE;
		
	}
	
	private static void validateTriangleSides(List<BigDecimal> sides) throws TriangleBuilderException{
		if(sides==null || sides.size()<3)
			throw new TriangleBuilderException(TriangleBuilderException.LESS_THAN_3_SIDES);
		if(sides.size()>3)
			throw new TriangleBuilderException(TriangleBuilderException.MORE_THAN_3_SIDES);
		for(BigDecimal side : sides){
			if(side.compareTo(BigDecimal.ZERO)<=0){
				throw new TriangleBuilderException(TriangleBuilderException.ZERO_SIDE);
			}
		}
		Collections.sort(sides);
		
		BigDecimal side = sides.get(0).add(sides.get(1));
		if(side.compareTo(sides.get(2))<=0){
			throw new TriangleBuilderException(TriangleBuilderException.INVALID_TRIANGLE_SIDES);
		}
	}
}
