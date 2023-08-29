import java.util.ArrayList;
public class Main {
   public static void main(String[] args) {
        System.out.println("\n\n Array list Pratice\n\n");


ArrayList<String> myFriendsList = new ArrayList<>();
   // Add five friends to my list
   myFriendsList.add("John");
   myFriendsList.add("Sam");
   myFriendsList.add("Brook");
   myFriendsList.add("Kevin");
   myFriendsList.add("Willie");

   System.out.println("\n my fifth friend is " + myFriendsList.get(4));

   System.out.println("\n the size (number of elements) " + myFriendsList.size());


   // Set change the data in an element
       myFriendsList.set(0,"Tayvion");
       System.out.println("\n my first friend is " + myFriendsList.get(0));

     // Remove the third element
        myFriendsList.remove( 2);
        System.out.println(myFriendsList);
   }

}