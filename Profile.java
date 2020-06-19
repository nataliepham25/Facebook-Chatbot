import java.awt.image.*;

/* Natalie Pham
 * Midterm Project (Attempt to do the extra credit
 * This class prints a profile on a simple social network.
 * 05/26/2020
 */

public class Profile{
	
//parameters
	private BufferedImage profilePicture;
	private Name profileName;
	private String status;
	AList < Profile > friends;


	/*
	 * Constructor for an instance of a profile.
	 */

	public Profile (){

		/*
		 * Constructor for an instance of a profile.
		 */

		profilePicture =
				new BufferedImage (150, 150, BufferedImage.TYPE_INT_RGB);
		profileName = new Name ("", "");
		status = "";
		friends = new AList <> ();

	}
//getters
	public BufferedImage getProfilePicture () //This would return data type buffered picture

	{
		return profilePicture;
	}

	public void setProfilePicture (BufferedImage newPicture) //Would set or change the profile pic

	{

		profilePicture = newPicture;  

	}

	public Name getName ()//Returns the name on the profile
	{
		return profileName;

	}

	/*
	 * Sets the name associated with the profile
	 * to the given first and last name.
	 */

	public void setName (String first, String last)//Sets to the name profileName

	{
		profileName.setName(first,last);
	}

	/*
	 * Sets the name associated with the profile
	 * to the given name.
	 */

	public void setName (Name name) //Sets the profile Name by taking in the actual name

	{
		profileName.setName(name.getFirst(), name.getLast());
	}

	/*
	 * Sets the current status of the profile
	 * to the given string.
	 */

	public void setStatus (String stat) //Sets status of the string
	{
		status = stat;  
	}

	/*
	 * Returns the status associated with the profile.
	 */

	public String getStatus () //Gets the string which contain the status
	{
		return status;
	}

	/*
	 * Returns a list of all the profile's friends
	 */

	public AList < Profile > getFriends () //Gets all the friends list
	{
		return friends;
	}

	/*
	 * Adds a friend to the profile's list of friends.
	 */

	public void addFriend (Profile p)
	{
		friends.add(p);
	}

	/*
	 * Removes a friend from the profile's list of friends.
	 */

	public void removeFriend (Profile p) 
	
	//For this I had like to modify the contain method of file 2
	{ s
		//so that it returns the index if found. It makes implementing this easy   

		int index = -1;   

		index = friends.contains(p);

		if(index!=-1){
			friends.remove(index);
		}
	}

	public String toString () //Gives the imp info in form of a string
	{
		String ans;
		ans = "Name: "+ profileName.getFirst() + " " + profileName.getLast() +"\n";
		ans = ans + "Status: " + status +"\n";
		ans = ans + "Picture: " + BufferedImage.getId() + "\n"; //getId is not implemented here but it should return the id
		ans = ans + "# of friends: " + friends.getLength() + "\n";
		ans = ans + "Friends: " + "\n";

		for(int i =0;i<friends.getLength();i++){

	ans = ans + friends.getEntry(i) + "\n";

		}

	}

	/*
	 * Displays the profile's information and friends
	 */

	public void display (){
		//Dont have any display method to show to the system. Therefore using println
		
		String result = toString();
		System.out.println(result);

	}

} // end Profile

