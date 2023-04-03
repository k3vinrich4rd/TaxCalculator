package br.com.estudos.alura.taxacalculator.template;

//Classe que implementa o contrato estabelecido pela interface
public class LifeInsurance implements Taxable {
    @Override
    public double getValue() {
        return 33;
    }


}