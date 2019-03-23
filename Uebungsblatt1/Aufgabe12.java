public class Aufgabe12
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.err.println("Bitte uebergeben Sie eine Zahl.");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		System.out.println("Binary: " + toBinaryString(n));
	}

	static String toBinaryString(int n)
	{
		if (n == 0)
			return "0";
		else if (n == 1)
			return "1";
		else
			return toBinaryString(n / 2) + String.valueOf(n % 2);
	}
}
