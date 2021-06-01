package entities;

public class Circle extends AbstractShape{

	private Double radious;
	
	public Circle(){}
	
	public Circle(Double radious, String color) {
		this.radious = radious;
		this.setName("circle");
		this.setColor(color);
	}
	
	@Override
	public Double area() {;
		return 2 * radious * 3.14;
	}
	
}
