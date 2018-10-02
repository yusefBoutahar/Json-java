package jsonjava;

import java.util.List;

 public class Agenda {
    private String firstName;
    private String lastName;
    private long age;
    private String streetAdress;
    private String city;
    private String state;
    private String postalCode;
    private PhoneNumbers[] phoneNumbers;
    private List<String> phoneNumbers2;

    
    
    
    public Agenda(String firstName, String lastName, long age, String streetAdress, String city, String state,
			String postalCode, List<String> phoneNumbers2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.streetAdress = streetAdress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.phoneNumbers2 = phoneNumbers2;
	}

     public String getFirstName() {
        return firstName;
    }
     public long getAge() {
        return age;
    }
     public String getStreetAdress() {
        return streetAdress;
    }
     public String getCity() {
        return city;
    }
     public String getState() {
        return state;
    }
     public String getPostalCode() {
        return postalCode;
    }
     public String getLastName() {
        return lastName;
    }
    
    public PhoneNumbers[] getPhoneNumbers() {
        return phoneNumbers;
    }
    
    public List<String> getPhoneNumbers2() {
        return phoneNumbers2;
    }
    
     public class PhoneNumbers {
        private long mobile;
        private long home;
         public long getMobile() {
            return mobile;
        }
         public long getHome() {
            return home;
        }
    }
}