package Address_Book;

import java.io.IOException;
import java.util.*;

public class MainIO {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Address Book System");

        Scanner input = new Scanner(System.in);
        int exit = 0;
        int answer;
        //we will loop until user wants to exit the application
        do {
            System.out.println("--------Welcome to Address Book---------");
            System.out.println("Enter '1' to Add contact");
            System.out.println("Enter '2' to Read contacts");
            System.out.println("Enter '3' to Count contacts");
            System.out.println("Enter '0' to Exit");
            System.out.println("Do you want to add contact or Print contacts ?");
            System.out.println("Answer with '1', '2', '3' or '0' to exit application.");
            try {//we handle the input of the user
                answer = input.nextInt();
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                answer = -1;
            }
            if(answer == 1) //according to user's input we go to each class
                AddIO.add_contact();
            else if(answer == 2)
                ReadIO.readContacts();
            else if(answer == 3)
                ReadIO.countContacts();

        }while(answer != exit);
        System.out.println("Application terminating...");

    }
}