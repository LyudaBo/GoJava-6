package extendsBank;

import bank.Bank;
import _enum.Currency;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int limite;
        if (getCurrency() == Currency.USD) {
            limite = 2000;
        } else {
            limite = 2200;
        }
        return limite;
    }

    public int getLimitOfFunding() {
        int limite;
        if (getCurrency() == Currency.EUR) {
            limite = 20000;
        } else {
            limite = 10000;
        }
        return limite;
    }

    public double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.USD) {
            rate = 0;
        } else {
            rate = 0.1;
        }
        return rate;
    }

    public double getCommission(int sum) {
        double commision;
        if (getCurrency() == Currency.USD) {
            if (sum <= 1000) {
                commision = 0.05;
            } else {
                commision = 0.07;
            }
        } else {
            if (sum <= 1000) {
                commision = 0.02;
            } else {
                commision = 0.04;
            }
        }
        return commision;
    }
}
