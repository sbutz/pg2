public class Aufgabe3
{
	public static void main(String[] args)
	{
		double a = 1, b = -2, c = 0, det, x1, x2;

		det = Math.sqrt((b * b) - (4 * a * c));
		x1 = (-b + det) / (2 * a);
		x2 = (-b - det) / (2 * a);

		System.out.println("x1: " + x1 + ", x2: " + x2);
	}
}
