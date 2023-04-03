package br.com.estudos.alura.taxacalculator.template;

public interface Taxable {

    //‘Interface’ utilizada para pegar os valores e fazendo o polimorfismo
    // para cada objeto implementando esse "Contrato"
    double getValue();
}