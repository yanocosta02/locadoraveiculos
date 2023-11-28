/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoraveiculos;

/**
 *
 * @author Yan
 */
public class Bicicleta extends Veiculo {
    String tipoBicicleta;

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    // Construtor
    public Bicicleta(String modelo, String cor, String marca, double valorDia, String tipoBicicleta) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.valorDia = valorDia;
        this.tipoBicicleta = tipoBicicleta;
    }
}
