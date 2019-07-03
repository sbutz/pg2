class TabellenEintrag {
	private int platz;
	private String clubName;
	private int punkte;

	TabellenEintrag(int platz, String clubName, int punkte) {
		this.platz = platz;
		this.clubName = clubName;
		this.punkte = punkte;
	}

	int getPlatz() {
		return this.platz;
	}

	void setPlatz(int platz) {
		this.platz = platz;
	}

	String getClubName() {
		return this.clubName;
	}

	void setClubName(String clubName) {
		this.clubName = clubName;
	}

	int getPunkte() {
		return this.punkte;
	}

	void setPunkte(int punkte) {
		this.punkte = punkte;
	}
}
