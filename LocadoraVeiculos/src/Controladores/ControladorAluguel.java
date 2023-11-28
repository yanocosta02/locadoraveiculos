/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import Modelo.Aluguel;
import Modelo.Cliente;
import Modelo.Seguro;
import Modelo.Veiculo;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Yan
 */
public class ControladorAluguel {
    private static ControladorAluguel instance;
    private static int ultimoIdAluguel = 0;
    ArrayList <Aluguel> listaAlugueis = new ArrayList<>();
    ControladorCliente controladorCliente = ControladorCliente.getInstance();
   
    //padrão singleton para ficar a mesma classe para guardar as informações
    public static ControladorAluguel getInstance() {
        if (instance == null) {
            instance = new ControladorAluguel();
            // Inicialize outros atributos, se necessário
        }
        return instance;
    }
    
    public void CriarAluguel(Aluguel a) {
	listaAlugueis.add(a);
    }
    
    public ArrayList <Aluguel> listarAluguel() {
        return listaAlugueis;
    }    

public boolean verificarDisponibilidadeVeiculo(Veiculo veiculo, Date dataInicio, Date dataFim) {
    if (dataFim.before(dataInicio)) {
        return false; // A data de fim é antes da data de início
    }

    for (Aluguel aluguel : listaAlugueis) {
        Veiculo veiculoAlugado = aluguel.getVeiculo();
        Date aluguelDataInicio = aluguel.getDataIni();
        Date aluguelDataFim = aluguel.getDataFim();

        // Verifica se o veículo é o mesmo e se há sobreposição nas datas
        if (veiculoAlugado.equals(veiculo) &&
                ((dataInicio.before(aluguelDataFim) || dataInicio.equals(aluguelDataFim)) &&
                (dataFim.after(aluguelDataInicio) || dataFim.equals(aluguelDataInicio)))) {
            return false; // Há sobreposição de datas, o veículo não está disponível
        }
    }

    return true; // O veículo está disponível para locação nessas datas
}
    public int getNextIdAluguel() {
        return ++ultimoIdAluguel;
    }
    
    public Aluguel buscaAluguelid(int id){
        Aluguel saida = null;
        for (Aluguel aluguel : listaAlugueis) {
            if (aluguel.getIdAluguel() == id) {
                 saida = aluguel;
            }
        }
        return saida;
    }
    public double calculaMulta(int idAluguel, double valor){
        Aluguel aluguel = buscaAluguelid( idAluguel);
        Date aluguelDataFim = aluguel.getDataFim();
        LocalDate dataAtual = LocalDate.now();
        LocalDate DataFim = LocalDate.parse(aluguelDataFim.toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodo = dataAtual.until(DataFim);
        int diferenca = periodo.getDays();

        double multa = 0.07 * valor * diferenca;
        return multa;
    }
    public double calculaSeguro(int idAluguel){
        Aluguel aluguel = buscaAluguelid( idAluguel);
        Seguro seguro = aluguel.getSeguro();
        if(seguro == null){
            return 0.0;
        }else{
            return seguro.getPreco();
        }
        
    }
    
    public double calculaValor(int idAluguel){
        Aluguel aluguel = buscaAluguelid( idAluguel);
        Date aluguelDataIni = aluguel.getDataIni();
        Date aluguelDataFim = aluguel.getDataFim();
        LocalDate DataIni = LocalDate.parse(aluguelDataIni.toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate DataFim = LocalDate.parse(aluguelDataFim.toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodo = DataFim.until(DataIni); //calcula a diferença 
        int dias = periodo.getDays();
        Veiculo veiculo = aluguel.getVeiculo();
        double valor = dias * veiculo.getValorDia();
        return valor;
    }
    
    public double calculaTotal(double seguro, double multa, double valor){
        double total = seguro + multa + valor;
        return total;
    }
    
    public ArrayList<Aluguel> buscaAluguel(int cpf) {
        ArrayList <Aluguel> alugueisEncontrados = new ArrayList<>();
        Cliente cliente = controladorCliente.buscaCliente(cpf);
        for (Aluguel aluguel : listaAlugueis) {
            if (aluguel.getCliente().equals(cliente)) {
                 alugueisEncontrados.add(aluguel);
            }
        }
        return alugueisEncontrados;
    }
    
}
