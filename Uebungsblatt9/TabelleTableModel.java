import javax.swing.table.AbstractTableModel;

class TabelleTableModel extends AbstractTableModel {
	private Tabelle tabelle;

	TabelleTableModel(Tabelle tabelle) {
		this.tabelle = tabelle;
	}

	public int getColumnCount() {
		return 3;
	}

	public int getRowCount() {
		return this.tabelle.getSize();
	}

	public Object getValueAt(int row, int col) {
		TabellenEintrag eintrag = this.tabelle.getEintrag(row);
		switch (col) {
			case 0:
				return eintrag.getPlatz();
			case 1:
				return eintrag.getClubName();
			case 2:
				return eintrag.getPunkte();
			default:
				return null;
		}
	}

	public String getColumnName(int col) {
		switch(col) {
			case 0:
				return "Platz";
			case 1:
				return "Club";
			case 2:
				return "Punkte";
			default:
				return null;
		}
	}

	public Class<?> getColumnClass(int col) {
		switch(col) {
			case 0:
				return Integer.class;
			case 1:
				return String.class;
			case 2:
				return Integer.class;
			default:
				return null;
		}
	}

	public boolean isCellEditable(int row, int col) {
		return col == 2;
	}

	public void setValueAt(Object value, int row, int col) {
		tabelle.updatePunkte(row, (int) value);
		this.fireTableDataChanged();
	}
}
