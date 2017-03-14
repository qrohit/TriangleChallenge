/**
 * 
 */
package polygon.data.triangle;

/**
 * @author rohit
 *
 */
public enum TriangleType{
	EQUILATERAL("Equilateral"),
	ISOSCELES("Isosceles"),
	SCALENE("Scalene");
	
	String value;

	private TriangleType(String s){
		this.value = s;
	}
	
	public String displayText(){
		return this.value;
	}
}
