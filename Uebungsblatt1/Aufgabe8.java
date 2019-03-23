public class Aufgabe8
{
	public static void main(String[] args)
	{
		if (args.length < 2)
		{
			System.err.println("Bitte uebergebe zwei Zahlen.");
			System.exit(1);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("KGV: " + kgv(a, b));
	}

	static int kgv(int a, int b) {
		for (int i = Math.max(a, b); i < a * b; i++)
		{
			if ((i % a == 0) && (i % b == 0))
				return i;
		}

		return a * b;
	}
}
