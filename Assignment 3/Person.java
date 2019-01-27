/**
 * The Person class stores basic information of a person, such as name and title
 * 
 * @author Raymond Ward
 * @version 22.12.2018
 **/
public class Person 
{
    // The person's full name
    private String name;
    // The person's title
    private String title;
    
    /**
     * 
     * @param The name of this Person
     * @param The current title of this Person
     */
    
    public Person(String name, String title)
    {
    	this.name = name;
    	this.title = title;
    }
    /**
     * Return the person's name.
     * @return The name of this person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the person's title.
     * @return The title of this person.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     *	Change the title of this Person
	 * @param New title of this Person
     */
    public void changeTitle(String title)
    {
    	this.title = title;
    }
    
    /**
     * Return the title and name of this Person.
     * @return The title and name of this Person.
     */
    public String toString()
    {
        return getTitle() + " " + getName();
    }

}
