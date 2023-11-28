/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import Modelo.Aluguel;
import Modelo.Veiculo;
import java.util.Date;

/**
 *
 * @author Yan
 */
public class ControladorAluguel {
    private static ControladorAluguel instance;
    private static int ultimoIdAluguel = 0;
    ArrayList <Aluguel> listaAlugueis = new ArrayList<>();
    
   
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
            Date aluguelDataInicio = aluguel.getDataIni();
            Date aluguelDataFim = aluguel.getDataFim();

            // Verifica se há alguma sobreposição nas datas
            if ((dataInicio.before(aluguelDataFim) || dataInicio.equals(aluguelDataFim)) &&
                (dataFim.after(aluguelDataInicio) || dataFim.equals(aluguelDataInicio))) {
                return false; // Há sobreposição de datas, o veículo não está disponível
            }
        }

        return true; // O veículo está disponível para locação nessas datas
    }
    public int getNextIdAluguel() {
        return ++ultimoIdAluguel;
    }
    public void exibirReservas() {
        System.out.println("Alugueis encontrados:");
        for (Aluguel aluguel : listaAlugueis) {
            System.out.println("dataini: " + aluguel.getDataIni() + ", Placa: " + aluguel.getDataFim());
        }
    }
    
}
