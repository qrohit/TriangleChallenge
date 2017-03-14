package polygon.data.triangle;

public enum TriangleAngularType {
	RIGHTANGLE ("Right Angle"),
	ACUTE ("Actue"),
	OBSTUSE ("Obstuse");
	
	String value;
	
	private TriangleAngularType(String s){
		this.value = s;
	}
	
	public String displayText(){
		return this.value;
	}
}
