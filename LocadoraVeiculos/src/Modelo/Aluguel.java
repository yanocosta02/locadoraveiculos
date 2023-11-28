/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


public class Aluguel {
    private Date dataIni;
    private Date dataFim;
    private Seguro seguro;
    private Veiculo veiculo;
    private Cliente cliente;

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void Aluguel(Date dataFim, Date dataIni, Veiculo veiculo, Cliente cliente, Seguro seguro) {
        this.dataFim = dataFim;
        this.dataIni = dataIni;
        this.seguro = seguro;
        this.veiculo = veiculo;
        this.cliente = cliente;
        
    }

    public void adicionarSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
