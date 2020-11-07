package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);

        Case theCase = new Case("221A", "Dell", 240, dimensions);
        Motherboard motherboard = new Motherboard("200-JB", "Asus", 4, 6, "V1.2.1" );

        Resolution nativeResolution = new Resolution(2450, 1440);
        Monitor monitor = new Monitor("27inch Beast" , "Samtel", 27, nativeResolution);

        PC thePC = new PC(motherboard, monitor, theCase);
        thePC.powerUp();


    }
}
