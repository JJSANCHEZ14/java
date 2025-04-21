/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consecionario;

/**
 *
 * @author Isabel Pallares
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String placa;
    private double valor;

    public Vehiculo(String marca, String modelo, String placa, int año, String placa1, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    
    public String getPlaca() {
        return placa;
    }
    

  
}
