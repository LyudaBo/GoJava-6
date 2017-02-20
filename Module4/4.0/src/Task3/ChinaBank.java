package Task3;

import Task1.Bank;
import Task2.Currency;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int limite;
        if (getCurrency() == Currency.USD) {
            limite = 100;
        } else {
            limite = 150;
        }
        return limite;
    }

    public int getLimitOfFunding() {
        int limite;
        if (getCurrency() == Currency.EUR) {
            limite = 5000;
        } else {
            limite = 10000;
        }
        return limite;
    }

    public double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.USD) {
            rate = 0.01;
        } else {
            rate = 0;
        }
        return rate;
    }

    public double getCommission(int summ) {
        double commision;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                commision = 0.03;
            } else {
                commision = 0.05;
            }
        } else {
            if (summ <= 1000) {
                commision = 0.1;
            } else {
                commision = 0.11;
            }
        }
        return commision;
    }

}
