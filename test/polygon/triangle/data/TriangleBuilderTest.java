/**
 * 
 */

package polygon.triangle.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import polygon.triangle.data.Triangle;
import polygon.triangle.data.TriangleAngularType;
import polygon.triangle.data.TriangleBuilder;
import polygon.triangle.data.TriangleType;
import polygon.triangle.exception.TriangleBuilderException;

/**
 * @author rohit
 *
 */
public class TriangleBuilderTest  {
	
	@Test(expected=TriangleBuilderException.class)
	public void testTriangleInvalid() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("20"));
		sides.add(new BigDecimal("5"));
		sides.add(new BigDecimal("10"));
		
		try {
			TriangleBuilder.buildTriangle(sides);
		} catch(TriangleBuilderException e){
			Assert.assertEquals(e.getMessage(), TriangleBuilderException.INVALID_TRIANGLE_SIDES);
			throw e;
		}
		
	}
	
	@Test(expected=TriangleBuilderException.class)
	public void testTriangleLessThan3Sides() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("20"));
		sides.add(new BigDecimal("5"));
		
		try {
			TriangleBuilder.buildTriangle(sides);
		} catch(TriangleBuilderException e){
			Assert.assertEquals(e.getMessage(), TriangleBuilderException.LESS_THAN_3_SIDES);
			throw e;
		}
	}
	
	@Test(expected=TriangleBuilderException.class)
	public void testTriangleNullInput() throws TriangleBuilderException{
		List<BigDecimal> sides = null;

		try {
			TriangleBuilder.buildTriangle(sides);
		} catch(TriangleBuilderException e){
			Assert.assertEquals(e.getMessage(), TriangleBuilderException.LESS_THAN_3_SIDES);
			throw e;
		}
	}

	@Test(expected=TriangleBuilderException.class)
	public void testTriangleMoreThan3Sides() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("20"));
		sides.add(new BigDecimal("15"));
		sides.add(new BigDecimal("25"));
		sides.add(new BigDecimal("10"));
		
		try {
			TriangleBuilder.buildTriangle(sides);
		} catch(TriangleBuilderException e){
			Assert.assertEquals(e.getMessage(), TriangleBuilderException.MORE_THAN_3_SIDES);
			throw e;
		}
	}
	
	
	@Test
	public void testTriangleEquilateral() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("10"));
		sides.add(new BigDecimal("10"));
		sides.add(new BigDecimal("10"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleType(), TriangleType.EQUILATERAL);
	}
	
	@Test
	public void testTriangleIsoceles() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("15"));
		sides.add(new BigDecimal("10"));
		sides.add(new BigDecimal("10"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleType(), TriangleType.ISOSCELES);
	}
	
	@Test
	public void testTriangleScalene() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("15"));
		sides.add(new BigDecimal("9"));
		sides.add(new BigDecimal("10"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleType(), TriangleType.SCALENE);
	}
	
	@Test
	public void testTriangleRightAngle() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("3"));
		sides.add(new BigDecimal("4"));
		sides.add(new BigDecimal("5"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleAngularType(), TriangleAngularType.RIGHTANGLE);
	}
	
	@Test
	public void testTriangleAcute() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("4"));
		sides.add(new BigDecimal("5"));
		sides.add(new BigDecimal("6"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleAngularType(), TriangleAngularType.ACUTE);

	}
	
	@Test
	public void testTriangleObstuse() throws TriangleBuilderException{
		List<BigDecimal> sides = new ArrayList<>();
		sides.add(new BigDecimal("3"));
		sides.add(new BigDecimal("4"));
		sides.add(new BigDecimal("6"));
		
		Triangle triangle = TriangleBuilder.buildTriangle(sides);
		Assert.assertEquals(triangle.getTriangleAngularType(), TriangleAngularType.OBSTUSE);

	}
	
	
}
