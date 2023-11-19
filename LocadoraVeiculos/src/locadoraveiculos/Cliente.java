/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoraveiculos;

/**
 *
 * @author Yan
 */
public class Cliente {
    String nome;
    int cpf;
    String endereco;
    int telefone;
    String email;

    // Construtor
    public Cliente(String nome, int cpf, String endereco, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }   

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}