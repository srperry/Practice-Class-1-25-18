package actor;

public class actor {
	String firstname;
	String lastname;
	public actor(String first, String last) {
		firstname = first;
		 lastname=last;
	}
	public static void main(String[] args) {
		actor actor = new actor ("Arnold","Schwarzenegger");
		System.out.print(actor.firstname);
}
}