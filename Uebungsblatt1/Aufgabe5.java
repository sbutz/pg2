public class Aufgabe5
{
	public static void main(String[] args)
	{
		if (args.length < 2) {
			System.err.println("Bitte zwei Zahlen uerbgeben.");
			System.exit(1);
		}

		int sum = 0;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		for (; a <= b; a++)
			sum += a;

		System.out.println("Sum: " + sum);
		
	}
}
