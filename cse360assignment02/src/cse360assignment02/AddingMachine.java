package cse360assignment02;


public class AddingMachine {
	public static void main(String[] args) {
	    new AddingMachine().run();
	} 





private void run() {
	AddingMachine myCalculator = new AddingMachine();
	myCalculator.add (4); 
	myCalculator.subtract (2); 
	myCalculator.add(5);
	System.out.println(myCalculator);
	}





private int total;
StringBuffer string;
  
public AddingMachine () {
total = 0; // not needed - included for clarity
string = new StringBuffer("0");
}
  
public int getTotal () {
return total;
}
  
public void add (int value) {
total = total +value;
string.append(" + "+value);
}
  
public void subtract (int value) {
total = total -value;
string.append(" - "+value);
}
  

public String toString () {
return string.toString();
}
}

