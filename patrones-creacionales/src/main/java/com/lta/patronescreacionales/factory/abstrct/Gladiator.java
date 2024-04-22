package com.lta.patronescreacionales.factory.abstrct;

public class Gladiator extends Warrior {

    @Override
    public void introduce() {
        System.out.println("I am a fierce gladiator!");
    }

    @Override
    public void attack() {
        System.out.println("Gladiator executes powerful strikes!");
    }

    @Override
    public void defend() {
        System.out.println("Gladiator uses shield and armor!");
    }

}
