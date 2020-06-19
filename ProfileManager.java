/* Natalie Pham
 * 22C
 * This class is a profile manager on a simple social network.
 * 05/26/2020
 */


public class ProfileManager

{

	private final AList < Profile > allProfiles;

	/*
	 * Constructor for an instance of a profile manager.
	 */

	public ProfileManager ()
	{
	
		allProfiles = new AList <> ();
	}

	
	//CRUD IMPLEMENTATIONS
	
	/*
	 * C: CREATE= ADD ACCOUNT
	 * Adds a profile onto the social network
	 */

	public void addProfile (Profile p)
	{
		allProfiles.add(p);
	}

	
	/*
	 * Removes a profile from the social network.
	 */

	//D: DELETE- REMOVE AN AN ACCOUNT
	
	public void removeProfile (Profile p) 
	//Again using the modified contain which returns the index of the found element

	{ int index = -1;   

	index = allProfiles.contains(p);

	if(index !=-1){

		allProfiles.remove(p);

	}

	}

	/* 
	 * U- UPDATE: UPDATE FRIEND'S LIST
	 * Created a friendship between two profiles on the social network.
	 */

	public void createFriendship (Profile a, Profile b)//To create this, both the profiles should have each

	{ // other's name in their list of friends.
		a.friends.addFriend(b);
		b.friends.addFriend(a);
	}

	/**
	 * Ends a friendship between two profiles on the social network.
	 */

	public void endFriendship (Profile a, Profile b)
	//For this remove the names from each others profile

	{
		a.friends.removeFriend(b);
		b.friends.removeFriend(a);
	}

	/* R- READ: SEARCH FOR OTHER PROFILES
	 * Displays each profile's information and friends.
	 */

	public void display ()
	{

		for(int i=0;i<allProfiles.getLength();i++){

			allProfiles[i].display;

		}

	}

}
