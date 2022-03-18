package com.company;

import java.util.Scanner;

public class Main {

    public Hotel provideFood(int amount) {
//write the logic if the supplied amount is more than 1000
        if(amount>1000) {
            return (new TajHotel());
        }
        else if(amount>200 && amount<1000){
            return (new RoadSideHotel());
        }
        else
            return null;
//then return the object of TajHotel class
//if the supplied amount is greater than 200 and less than 1000
//then return the object of RoadSideHotel class
//otherwise return the null value
    }

    public static void main(String[] args) {
	// write your code here
        //creat the object of the Main class
//Create the Scanner class object to take the amount from the user
//prompt the user to take the amount from the user
//call the provideFood method on the Main class object by supplying the amount
//Based on the returned Hotel object call the methods:
//if the returned object is RoadSideHotel then call the following methods:
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int x=sc.nextInt();
        if(x>200 && x<1000) {
            obj.provideFood(x).chickenBiryani();
            obj.provideFood(x).masalaDosa();

        }
        else if(x>1000)  {
            obj.provideFood(x).chickenBiryani();
            obj.provideFood(x).masalaDosa();
            TajHotel y = (TajHotel) obj.provideFood(x);
            y.welcomeDrink();
        }
        else if(obj.provideFood(x)==null)
            System.out.println("Please Enter a valid amount.");
//if the returned object is TajHotel then call the following methods:

//if the returned value is null then show the following message:

    }
}

interface Hotel {
    void chickenBiryani();
    void masalaDosa();



}

class TajHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }
    public void welcomeDrink() {
        System.out.println("Welcome Drink from the TajHotel");
    }



}

class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");
    }
}