class LohnAbrechnung extends Abrechnung
{
	private double stundenLohn;
	private double anzahlStunden;

	LohnAbrechnung(int periode, Mitarbeiter m, double stundenLohn,
		double anzahlStunden)
	{
		super(periode, m);
		this.stundenLohn = stundenLohn;
		this.anzahlStunden = anzahlStunden;
	}

	double getVerdienst()
	{
		return this.stundenLohn * this.anzahlStunden;
	}
}
