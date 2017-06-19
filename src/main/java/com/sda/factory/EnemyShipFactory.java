package com.sda.factory;


public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipName) {
        EnemyShip newShip = null;
        if ("U".equals(newShipName)) {
            newShip = new UFOEnemyShip();
        } else if ("R".equals(newShipName)) {
            newShip = new RocketEnemyShip();
        } else if ("B".equals(newShipName)) {
            newShip = new BigUFOEnemyShip();
        }
        return newShip;
    }
}
