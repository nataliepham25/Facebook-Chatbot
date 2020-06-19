public class Name
{

	private String first; // First name
	private String last; // Last name


	public Name () //Empty constructor
	{

	}

	//Constructor to set the name
	
	public Name (String firstName, String lastName) 

	{
		first = firstName;
		last = lastName;
	}


	public void setName (String firstName, String lastName) //Method to set name or to change name

	{
		first = firstName;
		last = lastName;
	}

	public String getName () //returns both first and last name in form of a string

	{
		String name;
		name = first + " " + last;
		return name;

	}

	public void setFirst (String firstName) //Sets or changes only the first name

	{
		first = firstName;

	}

	public String getFirst () //Returns only the first name
	{
		return first;

	}

	public void setLast (String lastName) //Sets only the last name;

	{
		last = lastName;

	}

	public String getLast () //returns only the last name

	{
		return last;

	}

	public void giveLastNameTo (Name aName) //Not sure about this method. Am assuming it sets

	{ // the last name of the current name to aName

		aName.setLast(last);

	}

	public String toString() //Returns all the useful information of the class in a string
	{
		String ans;
		return ans = "Name: " + first + " " + last;
	}

