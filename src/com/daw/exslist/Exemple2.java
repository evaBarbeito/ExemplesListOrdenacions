package com.daw.exslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exemple2 {
    public static void main(String[] args) {
        String[] fruits = new String[] { "Pineapple", "Apple", "Orange","Banana" };

        Arrays.sort(fruits);

        System.out.println("--------Array---------------------");
        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }
        /**
         * SORTIDA
         * fruits 1 : Apple 
         * fruits 2 : Banana 
         * fruits 3 : Orange 
         * fruits 4 : Pineapple
         */


        System.out.println("--------ArrayList-----------------");
        
        List<String> fruitsList = new ArrayList<String>();
        
        fruitsList.add("Pineapple");
        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Banana");

        Collections.sort(fruitsList);

      
        i=0;
        for(String temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp);
        }
        /**
         * SORTIDA
         * fruits 1 : Apple 
         * fruits 2 : Banana 
         * fruits 3 : Orange 
         * fruits 4 : Pineapple
         */
        
        
        List<String> fruitsListLinked_typeList = new LinkedList<String>();
        LinkedList<String> fruitsListLinked_typeLinkedList = new LinkedList<String>();
        
        fruitsListLinked_typeList.add("aaa");
        fruitsListLinked_typeLinkedList.addFirst("aaa");
        
        long tempsInicial = System.nanoTime();        
        ArrayList<String> arrLst = new ArrayList<String>();
        LinkedList<String> lnkLst = new LinkedList<String>();
        
        System.out.println("---------------Temps insercions arraylist vs linklist--------------------------");
        
        for(int ii=0;i<10000;i++){
            arrLst.add(ii,String.valueOf(ii));            
         }
        long tempsF = System.nanoTime();
        System.out.println("Temps inserció arraylist:");
        System.out.println(tempsInicial + ", " + tempsF);
        System.out.println( tempsF - tempsInicial);
       
        System.out.println("Temps inserció LinkedList:");
        
        tempsInicial = System.nanoTime();
        for(int ii=0;i<10000;i++){
            lnkLst.add(ii,String.valueOf(ii));            
         }
        long tempsFL = System.nanoTime();
        System.out.println(tempsInicial + ", " + tempsFL);
        System.out.println(tempsFL - tempsInicial);
        
        // fruitsListLinked_typeList és un objecte LinkedList de tipus List i té el mètodes de List i per
        // això no té el mètode addFirst().
        // fruitsListLinked_typeLinkedList és un objecte LinkedList de tipus LinkedList i té el mètodes de 
        // LinkedList i per això té el mètode addFirst().

        
        
    }

}