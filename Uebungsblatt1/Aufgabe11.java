public class Aufgabe11
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.err.println("Bitte uebergeben Sie eine Zahl.");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <= row; col++)
				System.out.printf("%8d", pascal(row, col));
			System.out.printf("\n");
		}
	}

	static int pascal(int row, int col)
	{
		if (row == 1 || col == 1 || col == row)
			return 1;
		else
			return pascal(row - 1, col - 1) + pascal(row - 1, col);
	}
}
