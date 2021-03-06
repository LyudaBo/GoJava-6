package extendsBank;


import bank.Bank;
import _enum.Currency;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        }
            return 1200;
    }

    public int getLimitOfFunding() {
        int limite;
        if (getCurrency() == Currency.EUR) {
            limite = 10000;
        } else {
            limite = 0;
        }
        return limite;
    }

    public double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.USD) {
            rate = 0.01;
        } else {
            rate = 0.02;
        }
        return rate;
    }


    public double getCommission(int summ) {
        double commision;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                commision = 0.05;
            } else {
                commision = 0.07;
            }
        } else {
            if (summ <= 1000) {
                commision = 0.06;
            } else {
                commision = 0.08;
            }
        }
        return commision;
    }
}
