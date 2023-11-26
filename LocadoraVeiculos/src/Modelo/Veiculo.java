/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yan
 */
public class Veiculo {
    int idVeiculo;
    String modelo;
    String cor;
    String marca;
    Double valorDia;

    public Veiculo(int idVeiculo, String modelo, String cor, String marca, Double valorDia) {
        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.valorDia = valorDia;
    }

    public Veiculo(){
        
    }
    
    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public void setValorDia(Double valorDia) {
        this.valorDia = valorDia;
    }
    
    
}
