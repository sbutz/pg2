public class Aufgabe7
{
	public static void main(String[] args)
	{
		if (args.length < 2)
		{
			System.err.println("Bitte uebergebe zwei Zaheln.");
			System.exit(1);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("GGT: " + ggt(a, b));
	}

	static int ggt(int a, int b)
	{
		int t = 0;

		for (int i = 1; i <= Math.min(a, b); i++)
		{
			if (a % i == 0 && b % i == 0)
				t = i;
		}

		return t;
	}
}
