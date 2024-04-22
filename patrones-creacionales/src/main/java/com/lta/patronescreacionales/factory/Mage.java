package com.lta.patronescreacionales.factory;

class Mage implements Character {
    @Override
    public void introduce() {
        System.out.println("I am a wise mage!");
    }

    @Override
    public void attack() {
        System.out.println("Mage casts a powerful spell!");
    }

    @Override
    public void defend() {
        System.out.println("Mage uses magic barrier to defend!");
    }
}
