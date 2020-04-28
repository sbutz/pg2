class Kunde {
	private String vorname;
	private String nachname;
	private boolean isStammkunde;
	private double rabattSatz;

	public Kunde() {
		this("", "", false, 0);
	}

	public Kunde(String vorname, String nachname) {
		this(vorname, nachname, false, 0);
	}

	public Kunde(String vorname, String nachname, boolean isStammkunde,
			double rabattSatz) {
		setVorname(vorname);
		setNachname(nachname);
		setIsStammkunde(isStammkunde);
		setRabattSatz(rabattSatz);
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public boolean isStammkunde() {
		return this.isStammkunde;
	}

	public void setIsStammkunde(boolean isStammkunde) {
		this.isStammkunde = isStammkunde;
	}

	public double getRabattSatz() {
		return this.rabattSatz;
	}

	public void setRabattSatz(double rabattSatz) {
		this.rabattSatz = rabattSatz;
	}
}
