/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import Controladores.ControladorAluguel;

public class Aluguel {
    private int idAluguel;
    private Date dataIni;
    private Date dataFim;
    private Seguro seguro;
    private Veiculo veiculo;
    private Cliente cliente;
    private Pagamento pag;
    ControladorAluguel controladorAluguel = ControladorAluguel.getInstance();
    
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

    public Aluguel(int idAluguel, Date dataIni, Date dataFim, Veiculo veiculo, Cliente cliente) {
        this.idAluguel = idAluguel;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.veiculo = veiculo;
        this.cliente = cliente;
        
    }

    public void adicionarSeguro(Seguro seguro) {
        this.seguro = seguro;
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
    public void criarPagamento(String forma, double valor, double multa, double total) {
        Pagamento pagamento = new Pagamento(forma, valor, multa, total); 
        this.pag = pagamento; 
    }

    public Pagamento getPag() {
        return pag;
    }

    public void setPag(Pagamento pag) {
        this.pag = pag;
    }
    
    public double calculaMulta(int idAluguel, double valor) {
        Aluguel aluguel = controladorAluguel.buscaAluguelid(idAluguel);
        Date aluguelDataFim = aluguel.getDataFim();
        
        // Formatando a data do aluguelDataFim para o formato desejado
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(aluguelDataFim);
        
        // Convertendo a String formatada para LocalDate
        LocalDate DataFim = LocalDate.parse(formattedDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        
        // Calculando a diferença entre datas
        Period periodo = DataFim.until(dataAtual);
        int diferenca = periodo.getDays();
        double multa = 0.0;
        if(diferenca>0){
            multa = 0.05 * valor * diferenca;
        }
            return multa;
    }

    public double calculaValor(int idAluguel) {
        Aluguel aluguel = controladorAluguel.buscaAluguelid(idAluguel);
        Date aluguelDataIni = aluguel.getDataIni();
        Date aluguelDataFim = aluguel.getDataFim();
        
        // Formatando as datas para o formato desejado
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDateIni = formatter.format(aluguelDataIni);
        String formattedDateFim = formatter.format(aluguelDataFim);
        
        // Convertendo as Strings formatadas para LocalDate
        LocalDate DataIni = LocalDate.parse(formattedDateIni, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate DataFim = LocalDate.parse(formattedDateFim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period periodo = DataIni.until(DataFim); // calcula a diferença
        int dias = periodo.getDays();
        Veiculo veiculo1 = aluguel.getVeiculo();
        double valor = (1+dias) * veiculo1.getValorDia();
        return valor;
    }
    
    public double calculaSeguro(int idAluguel){
        Aluguel aluguel = controladorAluguel.buscaAluguelid( idAluguel);
        Seguro seguro1 = aluguel.getSeguro();
        if(seguro1 == null){
            return 0.0;
        }else{
            return seguro.getPreco();
        }
        
    }
    
    public double calculaTotal(double seguro, double multa, double valor){
        double total = seguro + multa + valor;
        return total;
    }

}
