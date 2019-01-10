
public class Circle {

	private double radius;//instance variable/field
	
	public Circle() {
		setRadius(1.0);
		this.radius = 1.0;
	}//end empty-argument constructor
	
	public Circle(double r) {
		
	}//end preferred constructor
	
	public double calculateArea() {
		double area = Math.PI * Math.pow(radius, 2.0);
		return area;
	
	}//end calculateArea

	public double getRadius() {
		return radius;
	}//end getRadius
	
	public void setRadius(double radius) {
		
		if(radius <1.0)
			this.radius = 1.0;
		else
			this.radius = radius;
	}//end setRadius
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//end string
}
	