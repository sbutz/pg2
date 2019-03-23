public class BereichsUmsatz
{
	private String bereich;
	private double umsatz;

	public BereichsUmsatz()
	{
	}

	public BereichsUmsatz(String bereich, double umsatz)
	{
		this.setBereich(bereich);
		this.setUmsatz(umsatz);
	}

	public String getBereich()
	{
		return this.bereich;
	}

	public void setBereich(String bereich)
	{
		this.bereich = bereich;
	}

	public double getUmsatz()
	{
		return this.umsatz;
	}

	public void setUmsatz(double umsatz)
	{
		if (umsatz >= 0)
			this.umsatz = umsatz;
	}

	public String toString()
	{
		return this.bereich + " (" + this.umsatz + ")";
	}
}
