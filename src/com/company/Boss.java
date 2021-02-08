package com.company;

public class Boss {
     private int health = 100;
     private int damage = 200;
     private String Protection = "100";


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtection() {
        return Protection;
    }

    public void setProtection(String protection) {
        Protection = protection;
    }
    public void printInfo() {
        System.out.print(" health:" + health + " damage: " + damage + " Protection: " + Protection);
        }
    }
