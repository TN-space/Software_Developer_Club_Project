package com.perscholas.cafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {

    public SoftwareDeveloperClub() {
        List<String[]> list = new LinkedList<>();
        File file = new File("members.txt");
        try {
            Scanner line = new Scanner(file);
            while(line.hasNextLine()) {
                list.add(line.nextLine().split("[**]"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < list.size(); i++) {
//            System.out.println(Arrays.toString(list.get(i)));
//            System.out.println(list.get(i).length);
            System.out.println("Name: " + list.get(i)[0]);
            System.out.println("City: " + list.get(i)[2]);
            System.out.println("State: " + list.get(i)[4]);
            System.out.println("Favourite Programming Language: " + list.get(i)[6]);
            System.out.println();
        }
    }
}
