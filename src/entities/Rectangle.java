package entities;

public class Rectangle extends AbstractShape{

	private Double width;
	private Double height;
	
	public Rectangle(){}
	
	public Rectangle(Double width, Double height, String color) {
		this.height = height;
		this.width = width;
		this.setName("rectangle");
		this.setColor(color);
	}
	
	@Override
	public Double area() {
		return width * height;
	}
	
}
