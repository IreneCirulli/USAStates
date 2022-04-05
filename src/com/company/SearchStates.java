package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchStates {

    public static final int listsize = 50;
    private State[] state;
    private String key;

    public SearchStates(String key) throws IOException {
        state = new State[listsize];
        this.key = key;
        this.getArray();
    }

    public void getArray() throws IOException {
        Scanner scanner = new Scanner(new File("States.txt"));
        String name = " ";
        String capital = " ";
        String nickname = " ";
        String population = " ";
        int size = 0;
        while (scanner.hasNextLine()) {
            name = scanner.nextLine();
            capital = scanner.nextLine();
            nickname = scanner.nextLine();
            population = scanner.nextLine();
            State a = new State(name, capital, nickname,population);
            state[size]= a;
            size++;
        }
        scanner.close();
    }

    public String binarySearch(String key){
        int left = 0;
        int right = listsize - 1;

        while(left<=right){
            int halfway = (left+right)/2;
            if(state[halfway].getName().equals(key))
                return state[halfway].toString();

            else if(state[halfway].getName().compareTo(key)<0)
                left = halfway + 1;
            else
                right = halfway - 1;
        }
        return "State not found";
    }

}
