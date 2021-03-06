package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Drone estudiante;
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Drone(objetos,0, 2, Direction.EAST,10);
            Monitor est = new Monitor(objetos, 3, 3, Direction.NORTH, 4);
            Flor flor = new Flor(objetos, 0, 3);
            Carga carga = new Carga(objetos, 0, 0);
            Planta planta1 = new Planta(14, 31, 4, objetos, 3, 0);
            Planta planta2 = new Planta(14, 31, 4, objetos, 4, 0);
            planta2.cambiarEstado();
            Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            Thing t = estudiante.examineThings(new FlorPred()).next();
            if(t instanceof Flor){
               estudiante.pickThing();
            }
            
            estudiante.move();
            semaforo.cambiarEstado();
            Thread.sleep(500);
            semaforo.cambiarEstado();  
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

