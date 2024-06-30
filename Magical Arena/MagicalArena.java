package com.chai;

import java.util.Random;


public class MagicalArena {

    private static final Random random = new Random();

    private static int rollDie() {
        return random.nextInt(6) + 1;
    }

    private static void attack(Player attacker, Player defender) {
        int attackRoll = rollDie();
        int defenseRoll = rollDie();

        int attackDamage = attacker.attack * attackRoll;
        int defensePower = defender.strength * defenseRoll;

        int damageInflicted = Math.max(0, attackDamage - defensePower);
        defender.health -= damageInflicted;

        System.out.println(attacker + " attacks and rolls " + attackRoll + ". " + defender + " defends and rolls " + defenseRoll + ".");
        System.out.println("Attack damage: " + attackDamage + ", Defense power: " + defensePower + ", Damage inflicted: " + damageInflicted);
        System.out.println(defender + "'s health is now " + defender.health + "\n");
    }

    private static void simulateMatch(Player playerA, Player playerB) {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.health < playerB.health) {
                attack(playerA, playerB);
                if (playerB.isAlive()) {
                    attack(playerB, playerA);
                }
            } else {
                attack(playerB, playerA);
                if (playerA.isAlive()) {
                    attack(playerA, playerB);
                }
            }
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        simulateMatch(playerA, playerB);
    }
}
