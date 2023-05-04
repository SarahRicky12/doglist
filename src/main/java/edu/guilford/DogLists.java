package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class DogLists 
{
    public static void main( String[] args )
    {
        final int NUM_DOGS = 10000;
        Random rand = new Random();
        ArrayList <Dogs> dogsArray = new ArrayList<Dogs>();
        LinkedList <Dogs> dogsLinkedList = new LinkedList<Dogs>();


        //time how long it took to create the dogs
        long startTime = System.currentTimeMillis();
        //use a loop to add 1000 dogs to the arraylist
        for (int i = 0; i < NUM_DOGS; i++) {
            Dogs dog = new Dogs();
           
            dog.setName(dog.randomName());
            dog.setBreed(dog.randomBreed());
            dog.setAge(rand.nextInt(28));
            dog.setWeight(rand.nextInt(150));
            dogsArray.add(dog);
        }
        long endTime = System.currentTimeMillis();
        //print out the time it took to create the dogs
        System.out.println("ArrayList: ");
        System.out.println("It took " + (endTime - startTime) + " milliseconds to create the dogs.");


        startTime = System.currentTimeMillis();
        //sort the list using Collections.sort
        Collections.sort(dogsArray);
        endTime = System.currentTimeMillis();
        //print out the time it took to sort the dogs
        System.out.println("It took " + (endTime - startTime) + " milliseconds to sort the dogs.");

        startTime = System.currentTimeMillis();
        //shuffle the list using Collections.shuffle
        Collections.shuffle(dogsArray);
        endTime = System.currentTimeMillis();
        //print out the time it took to shuffle the dogs
        System.out.println("It took " + (endTime - startTime) + " milliseconds to shuffle the dogs.");

        //time 1,000,000 random gets from the ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int index = (int) (Math.random() * NUM_DOGS);
            dogsArray.get(index);
        }
        endTime = System.currentTimeMillis();
        //print out the time it took to do 1,000,000 random gets
        System.out.println("It took " + (endTime - startTime) + " milliseconds to do 1,000,000 random gets.");

        //use a loop to get each element from the ArrayList sequentially 
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsArray.get(i);
        }
        endTime = System.currentTimeMillis();
        //print out the time it took to get each element sequentially
        System.out.println("It took " + (endTime - startTime) + " milliseconds to get each element sequentially.");


        //use a loop to add 1000 dogs to the linkedlist
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            Dogs dog = new Dogs();
            dog.setName(dog.randomName());
            dog.setBreed(dog.randomBreed());
            dog.setAge(rand.nextInt(28));
            dog.setWeight(rand.nextInt(150));
            dogsLinkedList.add(dog);
        }
        endTime = System.currentTimeMillis();
        //print out the time it took to create the dogs
        System.out.println("LinkedList: ");
        System.out.println("It took " + (endTime - startTime) + " milliseconds to create the dogs.");

        startTime = System.currentTimeMillis();
        //sort the list using Collections.sort
        Collections.sort(dogsLinkedList);
        endTime = System.currentTimeMillis();
        //print out the time it took to sort the dogs
        System.out.println("It took " + (endTime - startTime) + " milliseconds to sort the dogs.");

        startTime = System.currentTimeMillis();
        //shuffle the list using Collections.shuffle
        Collections.shuffle(dogsLinkedList);
        endTime = System.currentTimeMillis();
        //print out the time it took to shuffle the dogs
        System.out.println("It took " + (endTime - startTime) + " milliseconds to shuffle the dogs.");

        //time 1,000,000 random gets from the LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int index = (int) (Math.random() * NUM_DOGS);
            dogsLinkedList.get(index);
        }
        endTime = System.currentTimeMillis();
        //print out the time it took to do 1,000,000 random gets
        System.out.println("It took " + (endTime - startTime) + " milliseconds to do 1,000,000 random gets.");

        //use a loop to get each element from the LinkedList sequentially
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsLinkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        //print out the time it took to get each element sequentially
        System.out.println("It took " + (endTime - startTime) + " milliseconds to get each element sequentially.");

        








    }
}
