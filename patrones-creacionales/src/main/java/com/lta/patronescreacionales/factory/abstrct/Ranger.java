package com.lta.patronescreacionales.factory.abstrct;

public class Ranger extends Archer {

    @Override
    public void introduce() {
        System.out.println("I am a stealthy ranger!");
    }

    @Override
    public void attack() {
        System.out.println("Ranger ambushes enemies from the shadows!");
    }

    @Override
    public void defend() {
        System.out.println("Ranger uses camouflage to hide!");
    }

}
