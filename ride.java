/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;
import java.util.Scanner;
/**
 *
 * @author mukis
 */
public class ride {
   //field
    int speed;
    String color;
    String model;
    
    //method
    void accelerate(){
        speed+=55;
    }
    void brake(){
        speed=-10;
    }
    void managePotholes(){
        model="M2022";
    }
    public static void main(String[]args){
        ride toyotaV8=new ride();
        toyotaV8.color="grey";
        toyotaV8.speed=60;
        toyotaV8.model="2022";
        toyotaV8.accelerate();
        
        //declaring 2nd object ride s
        
     ride Subaru = new ride();
Subaru.color = "blue";
Subaru.speed = 40;
Subaru.model = "2018";
Subaru.brake();
System.out.println("my toyota V8 model"+toyotaV8.model+"accelerates at a speed of"+toyotaV8.speed);
System.out.println("there is a subaru of model"+ subaru.model+"and brakes at + subaru.speed");




    }
    
}
