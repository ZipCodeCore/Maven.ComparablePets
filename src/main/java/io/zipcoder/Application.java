package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Application
{

    public static void main(String [] args)
    {

        //ArrayList Declaration
        ArrayList<Pets> pets = new ArrayList<Pets>();

        Scanner sn = new Scanner(System.in);
        System.out.print("How many pets do you own?: ");
        String nAsAString = sn.nextLine();
        int n = Integer.parseInt(nAsAString);

        //Iterate through number of pets
        for (int i = 0; i < n; i++)
        {
            System.out.println("What type of pet is this? ");
            String reply = sn.nextLine();

            if (reply.equalsIgnoreCase("dog"))
            {
                System.out.println("Cool! What is this dog's name? ");
                String replyName = sn.nextLine();

                Dog dog = new Dog(replyName);

                pets.add(dog);

            }

            else if (reply.equalsIgnoreCase("cat"))
            {
                System.out.println("Cool! What is this cat's name? ");
                String replyName = sn.nextLine();

                Cat cat = new Cat(replyName);

                pets.add(cat);
            }

            else if (reply.equalsIgnoreCase("bird"))
            {
                System.out.println("Cool! What is this bird's name? ");
                String replyName = sn.nextLine();

                Bird bird = new Bird(replyName);

                pets.add(bird);

            }

            else if (reply.equalsIgnoreCase("snake"))
            {
                System.out.println("Cool! What is this snake's name? ");
                String replyName = sn.nextLine();

                Snake snake = new Snake(replyName);

                pets.add(snake);
            }


        }

        System.out.println(printList(pets));






    }


    public static String printList(ArrayList<Pets> pets)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < pets.size(); i++)
        {
            sb.append(pets.get(i).getName());
            sb.append(" is a ");
            sb.append(pets.get(i).getClass().getSimpleName()+"\n");
        }

        return sb.toString();
    }

    //TODO:
    //Implementing Comparator Interface and Comparabale Interface


}
