// SRM 160 DIV 2 - 500 points

public class Intersect {

	public int area(int[] x, int[] y) {
		if (x.length % 2 != 0) {
			return 0;
		}
		Rectangle r1 = new Rectangle(x[0], y[0], x[1], y[1]);
		if (x.length < 3) {
			return r1.findArea();
		}
		Rectangle r2 = null;
		int i = 2;
		while (i < x.length) {
			r2 = new Rectangle(x[i], y[i], x[i + 1], y[i + 1]);
			r1 = findIntersectingRectangle(r1, r2);
			if (r1 == null || r1.findArea() == 0) {
				return 0;
			}
			i += 2;
		}
		return r1.findArea();
	}

	private Rectangle findIntersectingRectangle(Rectangle r1, Rectangle r2) {
		// get intersection in x Direction
		int[] intersectionX = findIntersectingSingleDirection(r1.top.x, r1.bottom.x, r2.top.x, r2.bottom.x);
		if (intersectionX == null) {
			return null;
		}
		int xTop = intersectionX[0];
		int xBottom = intersectionX[1];

		// get intersection in y Direction
		int[] intersectionY = findIntersectingSingleDirection(r1.top.y, r1.bottom.y, r2.top.y, r2.bottom.y);
		if (intersectionY == null) {
			return null;
		}
		int yTop = intersectionY[0];
		int yBottom = intersectionY[1];
		return new Rectangle(xTop, yTop, xBottom, yBottom);
	}

	private int[] findIntersectingSingleDirection(int a1, int a2, int b1, int b2) {
		if (a2 < a1) { // swap
			int temp = a1;
			a1 = a2;
			a2 = temp;
		}
		if (b2 < b1) { // swap
			int temp = b1;
			b1 = b2;
			b2 = temp;
		}
		if (b1 < a2 && a1 < b2) { // intersection exist starting b1 and ending b2
			int[] intersection = new int[2];
			intersection[0] = (b1 < a1)? a1 : b1;
			intersection[1] = (a2 > b2)? b2 : a2;
			return intersection;
		}
		return null;
	}
	
	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public class Rectangle {
		Point top;
		Point bottom;

		public Rectangle(int xTop, int yTop, int xBottom, int yBottom) {
			top = new Point(xTop, yTop);
			bottom = new Point(xBottom, yBottom);
		}

		public int findArea() {
			int length = Math.abs(top.x - bottom.x);
			int breadth = Math.abs(top.y - bottom.y);
			return length * breadth;
		}
	}

}
