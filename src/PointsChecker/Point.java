package PointsChecker;

public class Point {

	private int x;
	private int y;
	private String color;

	public Point() {

	}

	public Point(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHorizontal(Point p2) {
		if (this.y == p2.y) {
			System.out.println(this.y + ":" + p2.y);
			return true;
		}
		return false;
	}

	public boolean isVertical(Point p2) {
		if (this.x == p2.x) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return color + " Point : [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
