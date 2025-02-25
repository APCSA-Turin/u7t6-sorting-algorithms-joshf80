package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int min = 0;
        int temp = 0;
        int index = 0;
        
        for (int i = 0; i < elements.length; i++) {
            min = elements[i];
            index = i;
            for (int j = i + 1; j < elements.length; j++) {

                if (min > elements[j]) {
                    min = elements[j];
                    index = j;
                }

                if(j == elements.length - 1 && min < elements[i]) {
                    temp = elements[i];
                    elements[i] = elements[index];
                    elements[index] = temp;
                }
            }
        }
            return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        String temp;
        int index;

        for (int i = 0; i < words.size() - 1; i++) {
            index = i;

            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(index)) < 0) {
                    index = j;
                }
            }
            
            temp = words.get(i);
            words.set(i, words.get(index));
            words.set(index, temp);
        }

        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
