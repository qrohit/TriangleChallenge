package polygon.triangle.data;

public enum TriangleAngularType {
	RIGHTANGLE ("Right Angle"),
	ACUTE ("Actue"),
	OBTUSE ("Obtuse");
	
	String value;
	
	private TriangleAngularType(String s){
		this.value = s;
	}
	
	public String displayText(){
		return this.value;
	}
}
