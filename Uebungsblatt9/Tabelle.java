import java.util.*;

class Tabelle {
	private List<TabellenEintrag> eintraege;

	Tabelle() {
		this.eintraege = new LinkedList<>();
	}

	void addEintrag(String clubName, int punkte) {
		TabellenEintrag eintrag = new TabellenEintrag(0, clubName, punkte);
		this.eintraege.add(eintrag);

		for (int i = 0; i < eintraege.size(); i++) {
			TabellenEintrag a = eintraege.get(i);
			for (int j = i+1; j < eintraege.size(); j++) {
				TabellenEintrag b = eintraege.get(j);

				if (a.getPunkte() < b.getPunkte())
					Collections.swap(this.eintraege, i, j);
			}
		}

		for (int i = 0; i < eintraege.size(); i++) {
			eintrag = eintraege.get(i);
			eintrag.setPlatz(i + 1);
		}
	}

	TabellenEintrag getEintrag(int index) {
		return this.eintraege.get(index);
	}

	int getSize() {
		return this.eintraege.size();
	}

	void updatePunkte(int index, int punkte) {
		TabellenEintrag eintrag = this.getEintrag(index);
		eintrag.setPunkte(punkte);

		for (int i = 0; i < eintraege.size(); i++) {
			TabellenEintrag a = eintraege.get(i);
			for (int j = i+1; j < eintraege.size(); j++) {
				TabellenEintrag b = eintraege.get(j);

				if (a.getPunkte() < b.getPunkte())
					Collections.swap(this.eintraege, i, j);
			}
		}

		for (int i = 0; i < eintraege.size(); i++) {
			eintrag = eintraege.get(i);
			eintrag.setPlatz(i + 1);
		}
	}
}
