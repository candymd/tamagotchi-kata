package org.tamagotchi;

public class Tamagotchi {
    int hunger = 4;
    int mood = 4;
    int energy = 4;


    public String eat() {
        hunger --;
        hunger --;
        energy --;
        if (energy >= 3) {
            return "(-_-)";
        }

        else {
            return ":-|";
        }
    }

    public String play() {
        mood ++;
        energy --;
        hunger ++;

        if (energy >= 3) {
            return "(-_-)";
        }

        else if (energy == 0) {
            return "(-_-) zZZ";
        }

        else if (mood >= 8) {
            return ":-)";
        }

        else if (mood < 2) {
            return "ఠ_ఠ";
        }

        else {
            return ":-|";
        }
    }

    public String sleep() {
        energy ++;
        energy ++;


        if (energy <= 5 && hunger > 5) {
            mood --;
            return "ఠ_ఠ";
        }

        else {
            return ":-|";        }



    } }
