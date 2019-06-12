abstract class Abrechnung
{
	private int periode;
	private Mitarbeiter mitarbeiter;

	Abrechnung(int periode, Mitarbeiter m)
	{
		this.periode = periode;
		this.mitarbeiter = m;
	}

	int getPeriode()
	{
		return this.periode;
	}

	Mitarbeiter getMitarbeiter()
	{
		return this.mitarbeiter;
	}

	abstract double getVerdienst();

	public String toString()
	{
		return String.valueOf(this.periode) + ", " +
			this.mitarbeiter.getName() + ", " +
			String.valueOf(this.getVerdienst());
	}
}
