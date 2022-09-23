/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

/**
 *
 * @author ferna
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona roy = new Persona("roy", 19);
        Cliente joan = new Cliente("Joan", 18, 10.0, 12345, 1);
        Asesor edwin = new Asesor("Edwin", 18, 1, 15.0, "Sonido");
        Gerente pablo = new Gerente("Pablo", 40, 5, 1, 50.0);
        System.out.println(roy.getNombre() + " es una persona.");
        System.out.println(joan.getNombre() + " es un cliente.");
        System.out.println("y tiene $" + joan.getDinero());
        joan.setDinero(5);
        System.out.println("Pero gastó y ahora tiene $" + joan.getDinero());
        System.out.println(edwin.getNombre() + " es el asesor.");
        System.out.println("Está en el área de " + edwin.getArea());
        System.out.println(pablo.getNombre() + " es el gerente.");
        System.out.println("Y tiene " + pablo.getNumSubalternos() + "subalternos.");


    }
    
}

class Persona {
    private String nombre;
    private int  edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    } 
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}

class Cliente extends Persona{
    private double dinero;
    private int rfc;
    private int numCliente;
    
    public Cliente(String nombre, int edad, double dinero, int rfc, int numCliente){
        super(nombre, edad);
        this.dinero = dinero;
        this.rfc = rfc;
        this.numCliente = numCliente;
        
    }
    
    public double getDinero(){
        return dinero;
    }
    
    public void setDinero(double dinero){
       this.dinero = dinero;
    }
    
     public int getRfc(){
        return rfc;
    }
    
    public void setRfc(int rfc){
       this.rfc = rfc;
    }
    
     public double getNumCliente(){
        return numCliente;
    }
    
    public void setNumCliente(int numCliente){
       this.numCliente = numCliente;
    }
}

class Asesor extends Persona{
    private int numTrabajador;
    private double sueldo;
    private String area;
    
    public Asesor(String nombre, int edad, int numTrabajador, double sueldo, String area){
        super(nombre, edad);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
        this.area = area;
    }
    
     public int getNumTrabajador(){
        return numTrabajador;
    }
    
    public void setNumTrabajador(int numTrabajador){
       this.numTrabajador = numTrabajador;
    }
    
     public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
       this.sueldo = sueldo;
    }
    
     public String getArea(){
        return area;
    }
    
    public void setArea(String area){
       this.area = area;
    }
}

class Gerente extends Persona{
    private int numSubalternos;
    private int sucursal;
    private double sueldoGere;
    
    public Gerente(String nombre, int edad, int numSubalternos, int sucursal, double sueldoGere){
        super(nombre, edad);
        this.numSubalternos = numSubalternos;
        this.sucursal = sucursal;
        this.sueldoGere = sueldoGere;
        
    }
    
     public int getNumSubalternos(){
        return numSubalternos;
    }
    
    public void setNumSubalternos(int numSubalternos){
       this.numSubalternos = numSubalternos;
    }
    
     public int getSucursal(){
        return sucursal;
    }
    
    public void setSucursal(int sucursal){
       this.sucursal = sucursal;
    }
    
     public double getSueldoGere(){
        return sueldoGere;
    }
    
    public void setSueldoGere(int sueldoGere){
       this.sueldoGere = sueldoGere;
    }
}
