/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import Modelo.Aluguel;

/**
 *
 * @author Yan
 */
public class ControladorAluguel {
    private static ControladorAluguel instance;
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
}
