package datenstruckturen_exercise;

import java.io.*;
import java.util.LinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lottozahlen = new ArrayList<>();

        while(lottozahlen.size() < 6) {
            int zufallszahl = (int)(Math.random() * 49 + 1);

            if(!lottozahlen.contains(zufallszahl)) {
                lottozahlen.add(zufallszahl);
            }
        }

        System.out.println(lottozahlen);
    }
}
