package ch.bbw.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AddressViewController {
	
	@Inject
	private AddressService addressService;
	
	private final SortedSet<String> villages;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String village;
    
    private String message;
    
    public AddressViewController() {
    	message = "";
    	villages = Utils.getVillagesFromCSV();
	}

    private void clearFields() {
        firstname = "";
        lastname = "";
        phoneNumber = "";
        village = "";
    }
    public void saveAddress() {
        Address address = new Address(0, firstname, lastname, phoneNumber, village);
        addressService.registerAddress(address);
        message = "The address was saved successfully.";
        clearFields();
    }
    
    public List<String> completeText(String query) {
         ArrayList<String> searched = new ArrayList<>();
         searched.addAll(villages.subSet(query, query + Character.MAX_VALUE));
        return searched;
    }
    
    public List<Address> getAddresses() {
        return addressService.getAllAddresses();
    }
    
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}

}
