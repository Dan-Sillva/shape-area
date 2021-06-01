package entities;

public abstract class AbstractShape implements Shape{

	private String color;
	private String name;

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
