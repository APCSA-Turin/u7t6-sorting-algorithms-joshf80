package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int k = elements[i];
            int j = i - 1;
    
            while (j >= 0 && elements[j] > k) {
                count += 1;
                elements[j + 1] = elements[j];
                j--;
            }
            
            elements[j + 1] = k;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }
    

   
    public static void selectionSort(int[] elements) {
        int min = 0;
        int temp = 0;
        int index = 0;

        int count = 0;
        
        for (int i = 0; i < elements.length; i++) {
            min = elements[i];
            index = i;
            for (int j = i + 1; j < elements.length; j++) {
                count += 1;

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

        System.out.println("SELECTION SORT: Number of loop iterations: " + count);

    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            String k = words.get(i);
            int j = i - 1;
    
            while (j >= 0 && words.get(j).compareTo(k) > 0) {
                count += 1;
                words.set(j+1, words.get(j));
                j--;
            }
            words.set(j+1, k);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);

        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        String temp;
        int index;

        int count = 0;

        for (int i = 0; i < words.size() - 1; i++) {
            index = i;

            for (int j = i + 1; j < words.size(); j++) {
                count += 1;
                if (words.get(j).compareTo(words.get(index)) < 0) {
                    index = j;
                }
            }
            
            temp = words.get(i);
            words.set(i, words.get(index));
            words.set(index, temp);
            System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        }
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}