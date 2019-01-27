import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * The Patient class represents a patient in a medical practice.
 * It holds the patient details relevant in our context.
 * 
 * @author David J. Barnes
 * @version 2018.12.04
 */
public class Patient
{
    // The patient's full name
    private String name;
    // The patient's title
    private String title;
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
        title = "";
        name = fullName;
        // Allocate a unique patient number.
        numberCounter++;
        patientNumber = fiveDigitNumber(numberCounter);
    }

    /**
     * Return the full name of this patient.
     * @return The full name of this patient.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the patient's title.
     * @return The title of this patient.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the ID of this patient using part of their name
     * and their patient number.
     * @return The ID of this patient.
     */
    public String getPatientID()
    {
        return name.substring(0, Math.min(name.length(), 4)) + 
                              patientNumber;
    }
    
    /**
     * Print the patient's title, name and ID to the output.
     */
    public void print()
    {
        if(title != null && title.length() > 0) {
            System.out.print(title + " ");
        }
        System.out.println(name + " (" + getPatientID() + ")");
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
