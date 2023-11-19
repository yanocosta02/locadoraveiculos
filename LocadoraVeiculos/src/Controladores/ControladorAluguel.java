/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import locadoraveiculos.Aluguel;

/**
 *
 * @author Yan
 */
public class ControladorAluguel {
    ArrayList <Aluguel> listaAlugueis = new ArrayList<>();
    
    public void cadastrar(Aluguel a) {
	listaAlugueis.add(a);
    }
    
    public ArrayList <Aluguel> listarClientes() {
        return listaAlugueis;
    }    
}
