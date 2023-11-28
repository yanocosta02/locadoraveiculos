/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


public class Aluguel {
    private int idAluguel;
    private Date dataIni;
    private Date dataFim;
    private Seguro seguro;
    private Veiculo veiculo;
    private Cliente cliente;

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

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

    public Aluguel(int idAluguel, Date dataIni, Date dataFim, Veiculo veiculo, Cliente cliente, Seguro seguro) {
        this.idAluguel = idAluguel;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
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
    
    public void adicionarCliente(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}
