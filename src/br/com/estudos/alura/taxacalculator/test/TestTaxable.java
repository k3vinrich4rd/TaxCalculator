package br.com.estudos.alura.taxacalculator.test;

import br.com.estudos.alura.taxacalculator.template.AccountCurrent;
import br.com.estudos.alura.taxacalculator.template.LifeInsurance;
import br.com.estudos.alura.taxacalculator.template.TaxCalculator;

public class TestTaxable {
    public static void main(String[] args) {

        AccountCurrent accountCurrent = new AccountCurrent();
        accountCurrent.depositInAccount(100);

        LifeInsurance lifeInsurance = new LifeInsurance();
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.registerTaxable(accountCurrent);
        taxCalculator.registerTaxable(lifeInsurance);
        System.out.println(taxCalculator.getTotalTaxLevied());

    }
}