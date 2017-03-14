/**
 * 
 */
package polygon.triangle.exception;

/**
 * @author rohit
 *
 */
public class TriangleBuilderException extends Exception {

	public TriangleBuilderException(String message) {
		super(message);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3242859412731662166L;
	
	public static String MORE_THAN_3_SIDES = "More than 3 sides provided";
	public static String LESS_THAN_3_SIDES = "Less than 3 sides provided";
	public static String ZERO_SIDE = "All sides must be non zero";
	public static String INVALID_TRIANGLE_SIDES = "Sides provided aren't valid for a triangle";

}
