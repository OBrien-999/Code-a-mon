package decorator;

import java.util.Random;

public class World {

    public enum Weather {

        SUNNY,
        CLEAR,
        RAINY;

    }

    public enum Time {

        DAY,
        NIGHT;

    }

    public static void initiateWorld(Codeamon mon1, Codeamon mon2) {

        // Cycle and Weather requirements are met here
        int cycles = 0;
        Weather[] weather = Weather.values();
        int[] randomMon = {1, 2};
        int choice = 0;
        Random random = new Random();
        Time time = Time.DAY;
        Weather currentWeather = weather[random.nextInt(weather.length)];

        // The world runs on day/night cycles with random weather generated each cycle
        while(cycles < 10) {

            if(cycles % 2 == 0) {

                time = Time.DAY;

            }else {

                time = Time.NIGHT;

            }

            if(currentWeather == Weather.SUNNY && time == Time.NIGHT) {

                currentWeather = Weather.CLEAR;

            }

            System.out.println("\nIt's a " + currentWeather + " " + time + " in Chuckville!\n");

            // Codeamons evolve only during a clear night
            if(currentWeather == Weather.CLEAR && time == Time.NIGHT) {

                choice = randomMon[random.nextInt(randomMon.length)];

                if(choice == 1) {

                    mon1.evolve();
                    System.out.println("\nMon1 gained 10 points on each stat!");

                }else if(choice == 2) {

                    mon2.evolve();
                    System.out.println("\nMon2 gained 10 points on each stat!");

                }

            }

            currentWeather = weather[random.nextInt(weather.length)];
            cycles++;

        }

    }

}