public class Aufgabe9
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.err.println("Bitte uebergebe eine Zahl.");
			System.exit(1);
		}

		int a = Integer.parseInt(args[0]);

		System.out.println("Quersummer: " + quersumme(a));
	}

	static int quersumme(int a)
	{
		int sum = 0;

		for (int i = 10; a > 0;)
		{
			sum += a % i;
			a /= 10;
		}

		return sum;
	}
}
