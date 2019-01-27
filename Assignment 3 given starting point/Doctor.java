/**
 * A class storing details of a doctor.
 * 
 * @author David J. Barnes
 * @version 2018.12.04
 */
public class Doctor
{
    // The doctor's title.
    private String title;
    // The doctor's name.
    private String name;

    /**
     * Set the doctor's name and title.
     * @param name The doctor's name.
     */
    public Doctor(String name)
    {
        this.title = "Dr";
        this.name = name;
    }
    
    /**
     * Return the doctor's name.
     * @return The name of this doctor.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the doctor's title.
     * @return The title of this doctor.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Return the title and name of this doctor.
     * @return The title and name of this doctor.
     */
    public String toString()
    {
        return title + " " + name;
    }
}
