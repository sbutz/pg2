class PersonalVerwaltung
{
	private MitarbeiterListe mitarbeiter;
	private AbrechnungsListe abrechnungen;

	PersonalVerwaltung()
	{
		this.mitarbeiter = new MitarbeiterListe();
		this.abrechnungen = new AbrechnungsListe();
	}

	public static void main(String[] args)
	{
		PersonalVerwaltung pv = new PersonalVerwaltung();
		Mitarbeiter m1 = new Mitarbeiter("Josef Maier");
		pv.addMitarbeiter(m1);
		Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
		pv.addMitarbeiter(m2);
		Mitarbeiter m3 = new Mitarbeiter("Werner Mueller");
		pv.addMitarbeiter(m3);
		pv.listMitarbeiter();

		pv.sortMitarbeiter();
		pv.listMitarbeiter();

		pv.addAbrechnung(new LohnAbrechnung(1, m1, 10, 158));
		pv.addAbrechnung(new GehaltsAbrechnung(1, m2, 3010));
		pv.addAbrechnung(new GehaltsAbrechnung(1, m3, 2700));
		pv.addAbrechnung(new LohnAbrechnung(2, m1, 16, 158));
		pv.addAbrechnung(new GehaltsAbrechnung(2, m2, 3010));
		pv.addAbrechnung(new GehaltsAbrechnung(2, m3, 2800));
		pv.listAbrechnungen(2);
	}

	boolean addMitarbeiter(Mitarbeiter m)
	{
		return this.mitarbeiter.add(m);
	}

	boolean removeMitarbeiter(Mitarbeiter m)
	{
		return this.mitarbeiter.remove(m);
	}

	void listMitarbeiter()
	{
		for (int i = 0; i < this.mitarbeiter.getSize(); i++)
			System.out.println(this.mitarbeiter.get(i));
	}

	void sortMitarbeiter()
	{
		for (int n = this.mitarbeiter.getSize(); n > 0; --n)
		{
			for (int i = 0; i < n - 1; ++i)
			{
				Mitarbeiter a, b;
				a = this.mitarbeiter.get(i);
				b = this.mitarbeiter.get(i+1);

				if (b.istKleiner(a))
				{
					this.mitarbeiter.set(i, b);
					this.mitarbeiter.set(i+1, a);
				}
			}
		}
	}

	boolean addAbrechnung(Abrechnung a)
	{
		return this.abrechnungen.add(a);
	}

	void listAbrechnungen(int periode)
	{
		for (int i = 0; i < this.abrechnungen.getSize(); i++)
		{
			Abrechnung a = this.abrechnungen.get(i);
			if (a.getPeriode() == periode)
				System.out.println(this.abrechnungen.get(i));
		}
	}
}
