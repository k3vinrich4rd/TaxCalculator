package br.com.estudos.alura.taxacalculator.template;

/* Classe client que implementa uma ‘interface’
que cuja finalidade é setar a password
e informar o login e password do client
via uma sobrescrita e composição através
da classe Authenticated
 */
public class Client {
    private String name;
    private String cpf;
    private Address address;

    public Client() {

    }

    public Client(String name, String cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        // É necessário instanciar o objeto para manipular via referência

    }

    //Métodos assessores da classe
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
