import javax.swing.table.AbstractTableModel;
import java.util.List;

class KundenTableModel extends AbstractTableModel {
	private List<Kunde> kunden;

	public KundenTableModel(List<Kunde> kunden) {
		this.kunden = kunden;
	}

	public String getColumnName(int col) {
		switch(col) {
			case 0:
				return "Nachname";
			case 1:
				return "Vorname";
			default:
				return null;
		}
	}

	public Object getValueAt(int row, int col) {
		Kunde kunde = this.kunden.get(row);
		switch(col) {
			case 0:
				return kunde.getNachname();
			case 1:
				return kunde.getVorname();
			default:
				return null;
		}
	}

	public int getColumnCount() {
		return 2;
	}

	public int getRowCount() {
		return this.kunden.size();
	}

	public Kunde getKunde(int row) {
		return this.kunden.get(row);
	}
}
