package main;

import bank.Bank;
import _enum.Currency;
import extendsBank.ChinaBank;
import extendsBank.EUBank;
import extendsBank.USBank;
import user.User;
import bankSystem.BankSystemImpl;

public class Main {
    public static void main(String[] args) {
        Bank bankUS1 = new USBank(232344, "US", Currency.USD, 5, 678, 799, 79800);
        Bank bankUS2 = new USBank(68990, "US", Currency.EUR, 4, 78, 9, 8906);

        Bank bankEU1 = new EUBank(2344, "EU", Currency.USD, 5, 678, 799, 79800);
        Bank bankEU2 = new EUBank(689786890, "EU", Currency.EUR, 4, 78, 9, 8666606);

        Bank bankChina1 = new ChinaBank(23236644, "Chins", Currency.USD, 50, 678, 799, 79800);
        Bank bankChina2 = new ChinaBank(789990, "China", Currency.EUR, 40, 78, 9, 8906);

        User user1 = new User(bankUS1.getId(), "Buk", bankUS1.getTotalCapital(), 3, "Buka", bankUS1.getAvrSalaryOfEmployee(), bankUS1);
        User user2 = new User(bankUS2.getId(), "Nor", bankUS2.getTotalCapital(), 1, "Nora", bankUS2.getAvrSalaryOfEmployee(), bankUS2);

        User user3 = new User(bankEU1.getId(), "Tor", bankEU1.getTotalCapital(), 5, "Tora", bankEU1.getAvrSalaryOfEmployee(), bankEU1);
        User user4 = new User(bankEU2.getId(), "Tag", bankEU2.getTotalCapital(), 2, "Taga", bankEU2.getAvrSalaryOfEmployee(), bankEU2);

        User user5 = new User(bankChina1.getId(), "Bag", bankChina1.getTotalCapital(), 9, "Baga", bankChina1.getAvrSalaryOfEmployee(), bankChina1);
        User user6 = new User(bankChina2.getId(), "Dag", bankChina2.getTotalCapital(), 11, "Daga", bankChina2.getAvrSalaryOfEmployee(), bankChina2);

        BankSystemImpl bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1, 100);
        bankSystem.withdrawOfUser(user2, 200);
        bankSystem.withdrawOfUser(user3, 300);
        bankSystem.withdrawOfUser(user4, 400);
        bankSystem.withdrawOfUser(user5, 500);
        bankSystem.withdrawOfUser(user6, 600);

        bankSystem.fundUser(user1, 1000);
        bankSystem.fundUser(user2, 1000);
        bankSystem.fundUser(user3, 3000);
        bankSystem.fundUser(user4, 400);
        bankSystem.fundUser(user5, 5000);
        bankSystem.fundUser(user6, 9000);

        bankSystem.transferMoney(user1, user3, 500);
        bankSystem.transferMoney(user2, user4, 100);
        bankSystem.transferMoney(user3, user5, 300);
        bankSystem.transferMoney(user4, user6, 4000);
        bankSystem.transferMoney(user5, user1, 5000);
        bankSystem.transferMoney(user6, user2, 10000);

        bankSystem.paySalary(user1);
        bankSystem.paySalary(user2);
        bankSystem.paySalary(user3);
        bankSystem.paySalary(user4);
        bankSystem.paySalary(user5);
        bankSystem.paySalary(user6);

    }

}

