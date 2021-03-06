package polygon.triangle.data;

import java.math.BigDecimal;
import java.util.List;

import polygon.data.Polygon;

public class Triangle extends Polygon{
	private TriangleType triangleType;
	private TriangleAngularType triangleAngularType;

	protected Triangle(List<BigDecimal> sides, TriangleType triangleType, TriangleAngularType triangleAngularType){
		super(sides);
		this.triangleAngularType = triangleAngularType;
		this.triangleType = triangleType;
	}

	public TriangleType getTriangleType() {
		return triangleType;
	}


	public TriangleAngularType getTriangleAngularType() {
		return triangleAngularType;
	}
	
	@Override
	public String toString(){
		String result = super.toString();
		result += "\nTriangle type: " + this.triangleType.displayText();
		result += "\nTriangle angular type: " + this.triangleAngularType.displayText();
		return result;
	}
}
