class Mitarbeiter
{
	private static int counter = 1;

	private int id;
	private String name;

	Mitarbeiter()
	{
		this("");
	}

	Mitarbeiter(String name)
	{
		this.id = counter;
		counter++;
		this.name = name;
	}

	int getId()
	{
		return this.id;
	}

	String getName()
	{
		return this.name;
	}

	void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return String.valueOf(this.id) + ", " + this.name;
	}

	boolean istKleiner(Mitarbeiter m)
	{
		return this.name.compareTo(m.getName()) < 0;
	}
}
