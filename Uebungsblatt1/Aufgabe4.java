public class Aufgabe4
{
	public static void main(String[] args)
	{
		for (int num = 2; num <= 1000; num++) {
			if (isPrime(num))
				System.out.println(num);
		}
	}

	public static boolean isPrime(int num)
	{
		if (num < 2)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
