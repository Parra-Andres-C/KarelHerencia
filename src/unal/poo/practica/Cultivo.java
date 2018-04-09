/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Thing;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Cultivo extends City{
    private int x, y;
    private ArrayList<Thing> things;
    private ArrayList<Drone> Drones;

    public Cultivo(int x, int y, ArrayList<Thing> things, ArrayList<Drone> Drones) {
        this.x = x;
        this.y = y;
        this.things = things;
        this.Drones = Drones;
    }
public boolean cambiarHumedad( int x, int y){
    return true;
}
public boolean cambiarTemperatura( int x, int y){
        return false;
}
public boolean Sembrar( int x, int y){
    return true;
}
}
