class GehaltsAbrechnung extends Abrechnung
{
	private double gehalt;

	GehaltsAbrechnung(int periode, Mitarbeiter m, double gehalt)
	{
		super(periode, m);
		this.gehalt = gehalt;
	}

	double getVerdienst()
	{
		return this.gehalt;
	}
}
