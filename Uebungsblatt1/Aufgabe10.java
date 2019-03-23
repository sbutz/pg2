public class Aufgabe10
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.err.println("Bitte uebergeben Sie eine Zahl.");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		System.out.println("Fib (rekursiv): " + fib_recursive(n));
		System.out.println("Fib (iterativ): " + fib_iterative(n));
	}

	static int fib_recursive(int n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib_recursive(n-1) + fib_recursive(n-2);
	}

	static int fib_iterative(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		int a = 0, b = 1, c;
		for (int i = 1; i < n; i++)
		{
			c = b;
			b = a + b;
			a = c;
		}
		return b;
	}
}
