/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;


public class Sembrador extends Drone{
    private int fertilizante;
    public Sembrador(City city, int i, int i1, Direction drctn, int i2, int i3) {
        super(city, i, i1, drctn, i2);
        this.fertilizante = i3;
    }
    
}
