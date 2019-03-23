public class Aufgabe14
{
	public static void main(String[] args)
	{
		boolean a;

		a = true;
		if (a)
			System.out.println("If -> true");

		a = true;
		while (a)
		{
			System.out.println("While -> true");
			a = !a;
		}

		a = true;
		do
		{
			System.out.println("Do-While -> true");
			a = !a;
		} while (a);
	}
}
