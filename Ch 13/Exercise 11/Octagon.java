package octagon;

import java.lang.Comparable;
import java.lang.Cloneable;
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side = 1;
	private double area;
	
	public Octagon() {
		super();
		
	}
	public Octagon(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double getArea() {
		double area = (2 * (1 + Math.sqrt(2))) * Math.pow(side, 2);
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = side * 8;
		return perimeter;
	}
	@Override
	public int compareTo(Octagon o) {
		if(area > o.area) {
			return 1;
		}
		else if (area == o.area) {
			return 0;
		}
		else {
			return -1;
		}
	}
	@Override
	public Octagon clone() throws CloneNotSupportedException {
		return (Octagon)super.clone();
	}
}
