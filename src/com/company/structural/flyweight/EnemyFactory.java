package com.company.structural.flyweight;

import java.util.HashMap;

/**
 * Created by albertopalomarrobledo on 4/8/19.
 */
public class EnemyFactory {

    private static HashMap<String, Enemy> enemigos = new HashMap<>();

    public static Enemy getEnemy(String type){
        Enemy enemy = null;
        if(enemigos.containsKey(type)){
            enemy = enemigos.get(type);
        }else {
            switch (type){
                case "Private":
                    System.out.println("Soldado ha sido creado");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Detective ha sido creado");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            enemigos.put(type, enemy);
        }
        return enemy;
    }
}
