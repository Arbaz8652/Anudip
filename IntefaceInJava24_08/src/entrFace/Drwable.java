package entrFace;

public interface Drwable {
	
	abstract void draw();
	abstract double getArea();
	abstract String toString();
	default int getPerimeter(int... sides) {
		int perimeter = 0;
		for (int side : sides) {
			perimeter+=side;
		}
		return perimeter;
	}
}
