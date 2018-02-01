package ch.bbw.addressbook;

import java.util.Comparator;

public class LastnameFirstnameRegistrationDatecomparator implements Comparator<Address> {

	// Einfache Variante
//	@Override
//	public int compare(Address a1, Address a2) {
//		return a1.getLastname().compareTo(a2.getLastname());
//	}
	
	// Schwierige Variante
	@Override
	public int compare(Address a1, Address a2) {
		int evalLastname = a1.getLastname().compareTo(a2.getLastname());
		if (evalLastname==0) {
			int evalFirstname = a1.getFirstname().compareTo(a2.getFirstname());
			if (evalFirstname==0) {
				return a1.getRegistrationDate().compareTo(a2.getRegistrationDate())*-1;
			} else {
				return evalFirstname;
			}
		} else {
			return evalLastname;
		}
	}

}
