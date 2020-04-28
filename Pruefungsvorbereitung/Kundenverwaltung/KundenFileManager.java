import java.util.*;
import java.io.*;

class KundenFileManager {
	private static final String FILENAME = "./kunden.csv";

	KundenFileManager() {
	}

	public List<Kunde> load() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		StreamTokenizer st = new StreamTokenizer(br);
		st.whitespaceChars(',', ',');

		ArrayList<Kunde> kunden = new ArrayList<>();

		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			Kunde kunde = new Kunde();

			kunde.setVorname(st.sval);
			st.nextToken();
			kunde.setNachname(st.sval);

			kunden.add(kunde);
		}

		return kunden;
	}

	public static void save(List<Kunde> kunden) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
		PrintWriter pw = new PrintWriter(bw);

		for (Kunde kunde : kunden) {
			pw.print(kunde.getVorname());
			pw.print(',');
			pw.println(kunde.getNachname());
		}

		pw.close();
	}
}
