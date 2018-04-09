/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Thing;

/**
 *
 * @author Estudiante
 */
public class Planta extends Thing{
    private String[] images = {"wheat.png","leaf.png","christian-grave.png"};
    private int humedad, temperatura, cantFertilizante, state;

    public Planta(int humedad, int temperatura, int cantFertilizante, City city, int i, int i1) {
        super(city, i, i1);
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.cantFertilizante = cantFertilizante;
        this.state = 0;
        setIcon(new Bicon(this.images[this.state]));
    }
    public int getHumedad() {
        return humedad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getCantFertilizante() {
        return cantFertilizante;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setCantFertilizante(int cantFertilizante) {
        this.cantFertilizante = cantFertilizante;
    }
    
        public void cambiarEstado(){
            this.state = ((this.state + 1) % 3);
            setIcon(new Bicon(this.images[this.state]));
    }
}
