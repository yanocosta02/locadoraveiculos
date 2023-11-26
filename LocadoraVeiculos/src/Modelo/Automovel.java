/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yan
 */
public class Automovel extends Veiculo {
    String placa;
    int anoFabricacao;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    
    // Construtor
    public Automovel(String modelo, String cor, String marca, Double valorDia, String placa, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.valorDia = valorDia;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }
}
