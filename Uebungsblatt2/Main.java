public class Main
{

	public static void main(String[] args)
	{
		BereichsUmsatz[] umsaetze = {
			new BereichsUmsatz("Bremen", 5000.00),
			new BereichsUmsatz("Dresden", 9000.00),
			new BereichsUmsatz("Frankfurt", 12000.00),
			new BereichsUmsatz("Hamburg", 1000.00),
			new BereichsUmsatz("Hannover", 8000.00),
			new BereichsUmsatz("Koeln", 3000.00),
			new BereichsUmsatz("Leipzig", 3000.00),
			new BereichsUmsatz("Muenchen", 4000.00),
			new BereichsUmsatz("Potsdam", 5000.00),
			new BereichsUmsatz("Stuttgart", 8000.00)
		};

		for (int i = 0; i < umsaetze.length; i++)
			System.out.println(umsaetze[i]);
		System.out.printf("\n");

		System.out.println("Durchschnittlicher Umsatz: " + avgUmsatz(umsaetze));
		System.out.printf("\n");

		setFlop(umsaetze);
		System.out.println("Letzter: " + umsaetze[umsaetze.length - 1]);
		System.out.printf("\n");

		for (int i = 1, len = set3Tops(umsaetze); i <= len; i++)
			System.out.println((i > 3 ? 3 : i) + ". " + umsaetze[i-1]);
		System.out.printf("\n");

		System.out.println("Durch setFlop wird Stuttgart auf die Position " +
			"von Hamburg (4) gesetzt und ist somit nun vor Hannover.");
			
	}

	public static double avgUmsatz(BereichsUmsatz[] umsaetze)
	{
		double avg = 0;

		for (int i = 0; i < umsaetze.length; i++)
			avg += umsaetze[i].getUmsatz();
		avg /= umsaetze.length;

		return avg;
	}

	public static void switchPosition(BereichsUmsatz[] umsaetze,  int pos1,
		int pos2)
	{
		BereichsUmsatz tmp;

		tmp = umsaetze[pos1];
		umsaetze[pos1] = umsaetze[pos2];
		umsaetze[pos2] = tmp;
	}

	public static int indexOfMinUmsatz(BereichsUmsatz[] umsaetze)
	{
		int min = 0;

		for (int i = 0; i < umsaetze.length; i++)
		{
			if (umsaetze[i].getUmsatz() < umsaetze[min].getUmsatz())
				min = i;
		}

		return min;
	}

	public static int indexOfMaxUmsatz(BereichsUmsatz[] umsaetze, int von,
		int bis)
	{
		int max = von;

		for (int i = von; i < bis; i++)
		{
			if (umsaetze[i].getUmsatz() > umsaetze[max].getUmsatz())
				max = i;
		}

		return max;
	}

	public static void setFlop(BereichsUmsatz[] umsaetze)
	{
		int pos1 = indexOfMinUmsatz(umsaetze);
		int pos2 = umsaetze.length - 1;

		switchPosition(umsaetze, pos1, pos2);
	}

	public static int set3Tops(BereichsUmsatz[] umsaetze)
	{
		/*
		int max, min, count = 0;
		for (int max = indexOfMaxUmsatz(umsaetze, count, umsaetze.length);
			count < 3 || umsaetze[max].getUmsatz() == umsaetze[count-1].getUmsatz();
			max = indexOfMaxUmsatz(umsaetze, count, umsaetze.length))
		{
			switchPosition(umsaetze, max, count);
			count++;
		}
		*/

		int max = indexOfMaxUmsatz(umsaetze, 0, umsaetze.length);
		int count = 0;
		do {
			switchPosition(umsaetze, max, count);
			count++;
			max = indexOfMaxUmsatz(umsaetze, count, umsaetze.length);
		} while (count < 3 ||
			umsaetze[max].getUmsatz() == umsaetze[count - 1].getUmsatz());

		return count;
	}
}
