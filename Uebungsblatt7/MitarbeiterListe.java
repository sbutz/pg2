class MitarbeiterListe
{
	private static final int DEFAULT_SIZE = 10;

	private Mitarbeiter[] mitarbeiter;

	MitarbeiterListe()
	{
		this(DEFAULT_SIZE);
	}

	MitarbeiterListe(int size)
	{
		this.mitarbeiter = new Mitarbeiter[size];
	}

	int getSize()
	{
		int i = 0;
		while (i < this.mitarbeiter.length && this.mitarbeiter[i] != null)
		{
			i++;
		}
		return i;
	}

	boolean add(Mitarbeiter m)
	{
		int i = 0, length = this.mitarbeiter.length;
		Mitarbeiter[] neueListe;

		while (i < length && this.mitarbeiter[i] != null)
		{
			i++;
		}


		if (i >= length) {
			neueListe = new Mitarbeiter[length * 2];
			System.arraycopy(this.mitarbeiter, 0, neueListe, 0, length);
			this.mitarbeiter = neueListe;
		}

		this.mitarbeiter[i] = m;
		return true;
	}

	Mitarbeiter get(int index)
	{
		if (index < 0 || index >= this.mitarbeiter.length)
			return null;

		return this.mitarbeiter[index];
	}

	Mitarbeiter set(int index, Mitarbeiter m)
	{
		Mitarbeiter tmp = null;

		if (index < 0 || index >= this.mitarbeiter.length)
			return null;

		tmp = this.mitarbeiter[index];
		this.mitarbeiter[index] = m;
		return tmp;
	}

	boolean remove(Mitarbeiter m)
	{
		for (int i = 0; i < this.mitarbeiter.length; i++)
		{
			if (this.mitarbeiter[i] == m)
			{
				this.mitarbeiter[i] = null;
				return true;
			}
		}
		return false;
	}
}
