package edu.guilford;

import java.util.Random;

public class Dogs implements Comparable<Dogs>{
    // attributes
    private String name;
    private String breed;
    private int age;
    private int weight;

    private Random rand = new Random();

    // getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //create a switch statement to create 50 random names
    public String randomName() {
        int index = rand.nextInt(50);
        switch (index) {
            case 0:
                return "Fido";
            case 1:
                return "Rover";
            case 2:
                return "Spot";
            case 3:
                return "Buddy";
            case 4:
                return "Max";
            case 5:
                return "Sam";
            case 6:
                return "Rocky";
            case 7:
                return "Buster";
            case 8:
                return "Zeus";
            case 9:
                return "Duke";
            case 10:
                return "Bear";
            case 11:
                return "Lucky";
            case 12:
                return "Jack";
            case 13:
                return "Apollo";
            case 14:
                return "Oscar";
            case 15:
                return "Toby";
            case 16:
                return "Oreo";
            case 17:
                return "Gus";
            case 18:
                return "Thor";
            case 19:
                return "Shadow";
            case 20:
                return "Bandit";
            case 21:
                return "Scout";
            case 22:
                return "Teddy";
            case 23:
                return "Riley";
            case 24:
                return "Beau";
            case 25:
                return "Blue";
            case 26:
                return "Harley";
            case 27:
                return "Murphy";
            case 28:
                return "Jackson";
            case 29:
                return "Henry";
            case 30:
                return "Bruno";
            case 31:
                return "Gunner";
            case 32:
                return "Diesel";
            case 33:
                return "Jasper";
            case 34:
                return "Ace";
            case 35:
                return "Jake";
            case 36:
                return "Hank";
            case 37:
                return "Bentley";
            case 38:
                return "Bo";
            case 39:
                return "Luke";
            case 40:
                return "Rex";
            case 41:
                return "Joey";
            case 42:
                return "Odin";
            case 43:
                return "Marley";
            case 44:
                return "Winston";
            case 45:
                return "George";
            case 46:
                return "Baxter";
            case 47:
                return "Thor";
            case 48:
                return "Sammy";
            case 49:
                return "Cody";
            default: 
                return "Benny";
        }
    }
   
    //create a switch statement to create 50 random breeds
    public String randomBreed() {
        int index = rand.nextInt(50);
        switch (index) {
            case 1: 
                return "Labrador Retriever";
            case 2:
                return "German Shepherd";
            case 3:
                return "Golden Retriever";
            case 4:
                return "French Bulldog";
            case 5:
                return "Bulldog";
            case 6:
                return "Beagle";
            case 7:
                return "Poodle";
            case 8:
                return "Rottweiler";
            case 9:
                return "Yorkshire Terrier";
            case 10:
                return "German Shorthaired Pointer";
            case 11:
                return "Boxer";
            case 12:
                return "Siberian Husky";
            case 13:
                return "Dachshund";
            case 14:
                return "Great Dane";
            case 15:
                return "Doberman Pinscher";
            case 16:
                return "Australian Shepherd";
            case 17:
                return "Miniature Schnauzer";
            case 18:
                return "Pembroke Welsh Corgi";
            case 19:
                return "Cavalier King Charles Spaniel";
            case 20:
                return "Shih Tzu";
            case 21:
                return "Boston Terrier";
            case 22:
                return "Pomeranian";
            case 23:
                return "Havanese";
            case 24:
                return "Shetland Sheepdog";
            case 25:
                return "Brittany";
            case 26:
                return "English Springer Spaniel";
            case 27:
                return "Bernese Mountain Dog";
            case 28:
                return "Lhasa Apso";
            case 29:
                return "Cocker Spaniel";
            case 30:
                return "Border Collie";
            case 31:
                return "Basset Hound";
            case 32:
                return "Chihuahua";
            case 33:
                return "Pug";
            case 34:
                return "Maltese";
            case 35:
                return "Vizsla";
            case 36:
                return "Newfoundland";
            case 37:
                return "Mastiff";
            case 38:
                return "Collie";
            case 39:
                return "Bichon Frise";
            case 40:
                return "West Highland White Terrier";
            case 41:
                return "Papillon";
            case 42:
                return "Bullmastiff";
            case 43:
                return "Havanese";
            case 44:
                return "Weimaraner";
            case 45:
                return "Bloodhound";
            case 46:
                return "Bull Terrier";
            case 47:
                return "Chinese Shar-Pei";
            case 48:
                return "Yorkshire Terrier";
            case 49:
                return "Chesapeake Bay Retriever";
            default:
                return "Shiba Inu";
        }
    }

    //create a constructor that selects a random name, breed, age, and weight
    public Dogs() {
        name = randomName();
        breed = randomBreed();
        age = rand.nextInt(28);
        weight = rand.nextInt(150);
    }
    
    // methods
    public void bark() {
        System.out.println("Woof!");
    }

    // toString method
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age + " Weight: " + weight;
    }

    // helper method

    public void liklihoodOfDeath() {
        if (age > 10 && weight > 80) {
            System.out.println("Your dog is likely to die soon.");
        } else {
            System.out.println("Your dog is likely to live a long life.");
        }
    }

    // Analyze the dogs weight to determine if it is over or underweight
    public void weightAnalysis() {
        if (weight < 50) {
            System.out.println("Your dog is underweight.");
        } else if (weight > 100) {
            System.out.println("Your dog is overweight.");
        } else {
            System.out.println("Your dog is at a healthy weight.");
        }
    }

    //make the dogs class implement the comparable interface
    public int compareTo(Dogs other) {
        if (this.age > other.age) {
            return 1;
        } else if (this.age < other.age) {
            return -1;
        } else {
            return 0;
        }
    }

}
