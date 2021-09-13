package unit2;

public class Week1Exercise {
    public static void main(String[] args) {
        CreditCard alicesCard = new CreditCard(2000);
        CreditCard bobsCard = new CreditCard(1000);
        alicesCard.purchase(700);
        System.out.println(alicesCard);
        System.out.println(bobsCard);
    }
    
}

class CreditCard {
    double currentBalance;
    double creditLimit;

    CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    void purchase(double price) {
        this.currentBalance += price;
    }

    void pay(double payment) {
        this.currentBalance -= payment;
    }

    public String toString() {
        return "Balance: " + this.currentBalance + ", Credit limit: " + creditLimit;
    }
}