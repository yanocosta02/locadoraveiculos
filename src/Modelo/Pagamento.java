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
public class Pagamento {
    private String forma;
    private double valor;
    private double valorMulta;
    private double total;
    private Date data;
    private String status;

    public Pagamento(String forma, double valor, double total, double multa) {
        this.forma = forma;
        this.valor = valor;
        this.total = total;
        this.valorMulta = multa; // Inicialmente, não há multa
    }
    
    public void processarPagamento(String forma, Date data) {
        // Lógica para processar o pagamento com a forma e data fornecidas
        // Você pode implementar o processamento do pagamento aqui
        // Por exemplo, atualizar o status do pagamento, registrar a transação, etc.
        this.forma = forma;
        this.data = data;
    }

    public void adicionarMulta(Date dataFim, Date data, double valor) {
        // Verifica se a data atual está após o vencimento para aplicar a multa
        if (data.after(dataFim)) {
            this.valorMulta += valor;
        }
    }

    // Getters e Setters para os atributos
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public void processarPagamento(Date data, String status) {
        this.data = data; // Atualiza a data para a data atual
        this.status = status; // Define o status como Pago
    }
}