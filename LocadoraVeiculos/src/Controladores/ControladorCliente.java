/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import Modelo.Cliente;

/**
 *
 * @author Yan
 */
public class ControladorCliente {
    private static ControladorCliente instance;
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    
    //padrão singleton para ficar a mesma classe para guardar as informações
    public static ControladorCliente getInstance() {
        if (instance == null) {
            instance = new ControladorCliente();
            // Inicialize outros atributos, se necessário
        }
        return instance;
    }
    
    public void Cadastrar(Cliente c) {
        if (!existeCliente(c.getCpf())) {
            listaClientes.add(c);
        } else {
            System.out.println("Cliente já cadastrado.");
        }
    }

    public ArrayList<Cliente> listarClientes() {
        return listaClientes;
    }

    public Cliente buscaCliente(long cpf) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null; // Se não encontrar o cliente com o CPF especificado
    }
    

    public boolean existeCliente(long cpf) {
        return buscaCliente(cpf) != null;
    }
}