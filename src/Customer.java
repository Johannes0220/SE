
import java.lang.*;
import java.util.*;

class Customer {
	private String name;
	private Vector rentals = new Vector();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration enum_rentals = rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		while (enum_rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) enum_rentals.nextElement();			
			FrequentRenterPoints+=each.getFrequentRenterPoints();
			
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(getTotalCahrge()) + "\n";
			totalAmount += each.getCharge();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
	
	 public String htmlStatement() {
		 Enumeration rentals = _rentals.elements();
		 String result = "<H1>Rentals for <EM>" + getName() + "</EM></
		H1><P>\n";
		 while (rentals.hasMoreElements()) {
		 Rental each = (Rental) rentals.nextElement();
		35
		 //show figures for each rental
		 result += each.getMovie().getTitle()+ ": " +
		 String.valueOf(each.getCharge()) + "<BR>\n";
		 }
		 //add footer lines
		 result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) +
		"</EM><P>\n";
		 result += "On this rental you earned <EM>" +
		 String.valueOf(getTotalFrequentRenterPoints()) +
		 "</EM> frequent renter points<P>";
		 return result;
		 }

	 private double getTotalCharge() {
		 double result = 0;
		 Enumeration rentals = _rentals.elements();
		 while (rentals.hasMoreElements()) {
		 Rental each = (Rental) rentals.nextElement();
		 result += each.getCharge();
		 }
		 return result;
		 }
	 
	 private int getTotalFrequentRenterPoints(){
		 int result = 0;
		 Enumeration rentals = _rentals.elements();
		 while (rentals.hasMoreElements()) {
		 Rental each = (Rental) rentals.nextElement();
		 result += each.getFrequentRenterPoints();
		 }
		 return result;
		 }






}
