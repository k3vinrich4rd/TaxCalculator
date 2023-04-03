package br.com.estudos.alura.taxacalculator.template;

//Na herança, não se herda construtores
//somente atributos e métodos
public class AccountCurrent extends Account implements Taxable {

    //Com um super(referencia a super classe, que no caso é a classe mãe)
    //Podemos chamar um construtor padrão, mas também podemos chamar um constructor específico
    public AccountCurrent() {

    }

    @Override
    public void depositInAccount(double value) {
        super.balance += value;
        System.out.println("Deposit successful");
    }


    @Override
    public double getValue() {
        return super.balance * 0.01;
    }
}