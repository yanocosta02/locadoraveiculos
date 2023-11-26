/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Yan
 */
public class Aluguel {
    private Date dataIni;
    private Date dataFim;
    private String status;
    private String modelo;
    private Seguro seguro;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void novoAluguel(Date dataFim, Date dataIni, String status, String modelo) {
        this.dataFim = dataFim;
        this.dataIni = dataIni;
        this.status = status;
        this.modelo = modelo;
    }

    public void adicionarSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
}
