/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import locadoraveiculos.Cliente;

/**
 *
 * @author Yan
 */
public class ControladorCliente {
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void cadastrar(Cliente c) {
        if (!existeCliente(c.getCpf())) {
            listaClientes.add(c);
        } else {
            System.out.println("Cliente já cadastrado.");
        }
    }

    public ArrayList<Cliente> listarClientes() {
        return listaClientes;
    }

    public Cliente buscaCliente(int cpf) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null; // Se não encontrar o cliente com o CPF especificado
    }

    private boolean existeCliente(int cpf) {
        return buscaCliente(cpf) != null;
    }
}