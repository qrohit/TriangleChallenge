/**
 * 
 */
package polygon.data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author rohit
 *
 */
public class Polygon {
	private List<BigDecimal> sides;
	
	protected Polygon(List<BigDecimal> sides) {
		this.setSides(sides);
	}

	public List<BigDecimal> getSides() {
		return sides;
	}

	private void setSides(List<BigDecimal> sides) {
		this.sides = sides;
	}
	
	@Override
	public String toString(){
		String result = "Sides:";
		for(BigDecimal side : sides){
			result += "\t"+side;
		}
		return result;
	}
}
