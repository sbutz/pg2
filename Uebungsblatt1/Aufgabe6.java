public class Aufgabe6
{
	public static void main(String[] args)
	{
		if (args.length == 0) {
			System.err.println("Bitte Zahl uerbgeben.");
			System.exit(1);
		}

		int num = Integer.parseInt(args[0]);
		double delta = 0.000001;
		double x1 = num;
		double x2 = (num + 1) / 2;

		while (Math.abs(x1 - x2) > delta)
		{
			x1 = x2;
			x2 = 0.5 * (x2 + (num / x2));
		}

		System.out.println("Wurzel: " + x2);
	}
}
