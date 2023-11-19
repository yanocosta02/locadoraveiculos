/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import locadoraveiculos.Funcionario;
import locadoraveiculos.Veiculo;

/**
 *
 * @author Yan
 */
public class Locadora {
    private static Locadora instance;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Locadora(){
        
    }
    
    //padrão singleton para ficar a mesma classe para guardar as informações
    public static Locadora getInstance() {
        if (instance == null) {
            instance = new Locadora();
            // Inicialize outros atributos, se necessário
        }
        return instance;
    }
    
    public void cadastrarFuncionario(Funcionario novoFuncionario) {
        if (!buscaFuncionario(novoFuncionario.getUsuario())) {
            funcionarios.add(novoFuncionario);
        } else {
            // Aqui você pode adicionar uma mensagem de erro ou lidar de outra forma
            System.out.println("Funcionário já existe!");
        }
    }

    public void cadastrarVeiculo(Veiculo novoVeiculo) {
        veiculos.add(novoVeiculo);
    }

    public Funcionario realizarLogin(String usuario, String senha) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.verificarCredenciais(usuario, senha)) {
                return funcionario;
            }
        }
        return null; // Se não encontrar funcionário com essas credenciais
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public boolean buscaFuncionario(String usuario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getUsuario().equals(usuario)) {
                return true; // Já existe um funcionário com este usuário
            }
        }
        return false; // Não existe funcionário com este usuário
    }
    
    public Veiculo pesquisaItem(String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        return null; // Se não encontrar veículo com o modelo especificado
    }
}

