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
    private Date vencimento;
    private Date data;

    public Pagamento(String forma, double valor, Date vencimento) {
        this.forma = forma;
        this.valor = valor;
        this.vencimento = vencimento;
        this.valorMulta = 0.0; // Inicialmente, não há multa
        this.data = new Date(); // Data atual como padrão
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

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }   
}
