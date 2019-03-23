public class Aufgabe13
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Bitte uebergeben Sie eine Zahl.");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		int len = n;
		for (int num = 2; num <= len / 50; num++) {
			if (isPrime(num))
				len -= (len / num);
		}

		int[] primes = new int[len];
		int c = 0;
		for (int num = 2; num <= n; num++) {
			if (isPrime(num))
			{
				primes[c] = num;
				c++;
			}
		}

		for (int i = 0; i < c; i++)
			System.out.println(primes[i]);
	}

	public static boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
