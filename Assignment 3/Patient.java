import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * The Patient class represents a patient in a medical practice.
 * It holds the patient details relevant in our context.
 * 
 * @author David J. Barnes
 * @version 2018.12.04
 */



public class Patient extends Person
{

    // The patient's number as a fixed-length string.
    private String patientNumber;
    

    // A value used to generate a unique patient number for every
    // patient.
    private static int numberCounter = 0;
    
    // A formatter for turning integers into strings.
    private static NumberFormat formatter;
    static {
        // Create a formatter that will format an integer
        // as a string with leading zeros.
        formatter = new DecimalFormat("0");
        // Enforce a length of at least digits on the number string.
        formatter.setMinimumIntegerDigits(8);
    };

    /**
     * Create a new patient with a given name.
     * @param fullName The name(s) of the patient.
     */
    public Patient(String fullName)
    {
        super(fullName,"");
        numberCounter++;
        patientNumber = fiveDigitNumber(numberCounter);
    }
    
    /**
     * Return the ID of this patient using part of their name
     * and their patient number.
     * @return The ID of this patient.
     */
    public String getPatientID()
    {
        return super.getName().substring(0, Math.min(super.getName().length(), 4)) + 
                              patientNumber;
    }
    
    /**
    * Return a string in the form "Title Name (ID)"
    * if a title is present, or
    * "Name (ID)" if there is no title.
    * @return A string containing
    * the patient's title (optional), name and ID number. 
    **/
        public String toString()
        {
        	if (this.getTitle().isEmpty())
        	{
        		
        		return getName() +  " (" + getPatientID() + ")";
        	}
        	
        	else
        	{
        		return super.toString() + " (" +  getPatientID() + ")";
        	}
        	
        }

    /**
     * Return the given number formatted as a five-digit string.
     * @param number The number to be formatted.
     * @return A five-digit representation of number.
     */
    private String fiveDigitNumber(int number)
    {
        String formattedNumber = formatter.format(number);
        return formattedNumber.substring(formattedNumber.length() - 5);
    }
}
