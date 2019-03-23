public class Aufgabe2
{
	public static void main(String[] args)
	{
		int x = 1, y = 2;

		System.out.println("x: " + x + ", y: " + y);

		x = x ^ y;
		y = y ^ x;
		x = x ^ y;

		System.out.println("x: " + x + ", y: " + y);
	}
}
