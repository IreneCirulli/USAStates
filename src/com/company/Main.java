package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("=====================\n     Searching     \n=====================\n\nEnter State--> ");
        Scanner a = new Scanner(System.in);
        String states = a.nextLine();

        SearchStates state = new SearchStates(states);
        System.out.println(state.binarySearch(states));

        String yn = " ";
        System.out.println("Search Again[Y/N]?");
        Scanner b = new Scanner(System.in);
        yn = b.nextLine();

        while(yn.equals("y")){
            System.out.println("Enter State--> ");
            Scanner c = new Scanner(System.in);
            String states1 = c.nextLine();
            SearchStates state1 = new SearchStates(states1);
            System.out.println(state1.binarySearch(states1));
            System.out.println("Search Again[Y/N]?");
            Scanner d = new Scanner(System.in);
            yn = d.nextLine();
        }
    }
}
