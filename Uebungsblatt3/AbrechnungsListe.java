class AbrechnungsListe
{
	private static final int DEFAULT_SIZE = 10;

	private Abrechnung[] abrechnungen;

	AbrechnungsListe()
	{
		this(DEFAULT_SIZE);
	}

	AbrechnungsListe(int size)
	{
		this.abrechnungen = new Abrechnung[size];
	}

	int getSize()
	{
		int i = 0;
		while (i < this.abrechnungen.length && this.abrechnungen[i] != null)
		{
			i++;
		}
		return i;
	}

	boolean add(Abrechnung a)
	{
		int i = 0;
		while (i < this.abrechnungen.length && this.abrechnungen[i] != null)
		{
			i++;
		}

		if (i < this.abrechnungen.length)
		{
			this.abrechnungen[i] = a;
			return true;
		}
		return false;
	}

	Abrechnung get(int index)
	{
		if (index < 0 || index >= this.abrechnungen.length)
			return null;

		return this.abrechnungen[index];
	}

	Abrechnung set(int index, Abrechnung a)
	{
		Abrechnung tmp = null;

		if (index < 0 || index >= this.abrechnungen.length)
			return null;

		tmp = this.abrechnungen[index];
		this.abrechnungen[index] = a;
		return tmp;
	}

	boolean remove(Abrechnung a)
	{
		for (int i = 0; i < this.abrechnungen.length; i++)
		{
			if (this.abrechnungen[i] == a)
			{
				this.abrechnungen[i] = null;
				return true;
			}
		}
		return false;
	}
}
