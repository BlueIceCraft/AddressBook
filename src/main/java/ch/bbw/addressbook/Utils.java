package ch.bbw.addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.faces.context.FacesContext;

public class Utils {
	
	private static final String PLZ_FILE = "plz.csv";
	
	private Utils() {
		
	}
	
	public static SortedSet<String> getVillagesFromCSV() {
		SortedSet<String> villages = null;
		BufferedReader br = null;
		String line;
		String filename = FacesContext.getCurrentInstance().getExternalContext().getRealPath("\\") + "\\resources\\" + PLZ_FILE;
		try {
			villages = new TreeSet<>();
			br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
            	String[] villArr = line.substring(1, line.length() - 1).split("\",\"");
            	villages.add(villArr[1]);
            }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return villages;
	}
}