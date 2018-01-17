package com.alec;

public class CashRegister {


    private Double cashThisRegister;
    private Integer countThisRegister;

    private static Double cashAllRegisters = 0.00;
    private static Integer countAllRegisters = 0;


    public CashRegister(double cashThisRegister, int countThisRegister) { // constructor tells register how much money it starts with
        this.cashThisRegister = cashThisRegister;
        this.cashAllRegisters += cashThisRegister;
        this.countThisRegister = countThisRegister;
        this.countAllRegisters += countThisRegister;
    }

    public double getTotalCash() {
        return cashThisRegister;
    }

    public int getItems( ) {
        return countThisRegister;
    }

    public double getAveragePricePerItem( ) {
    return cashThisRegister / countThisRegister;
}

    public String toString() {
        String print = "CONTENT \n";
        print = print + "money= " + cashThisRegister.toString() + "\n";
        print = print + "countThisRegister=" + countThisRegister.toString()+ "\n";
        print = print + "cashAllRegisters" + cashAllRegisters .toString() + "\n";
        print = print + "countAllRegisters" + countAllRegisters .toString() + "\n";
        print = print + "average price per item" + getAveragePricePerItem( );
        return print;
    }

//    public boolean isUSA(){
//        return 1==countrycode;
//    }
//
//    public String getcityname(){
//        return location;
//    }
}
