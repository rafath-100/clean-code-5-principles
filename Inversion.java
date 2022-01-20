// Dependency Inversion Principle

// The below class is tightly coupled with above two classes
class Purchase {
    //DebitCard d;
    // CreditCard c
    BankCard b;
    Purchase(BankCard b){
        this.b = b;
    }
    public void itemPuchased(){
        b.performTransaction();
    }
}

class CreditCard {
    public void performTransaction(){
        System.out.println("Transaction through Credit Card");
    }
}

class DebitCard {
    public void performTransaction(){
        System.out.println("Transaction through Debit Card");
    }
}

// Dependency Inversion Principle
interface BankCard {
    void performTransaction();
}

class CreditCardOne implements BankCard{
    public void performTransaction(){
        System.out.println("Transaction through Credit Card");
    }
}

class DebitCardOne implements BankCard{
    public void performTransaction(){
        System.out.println("Transaction through Debit Card");
    }
}
public class Inversion {
    public static void main(String ...args){
        //DebitCard d = new DebitCard();
        //CreditCard c = new CreditCard();

        // Now we can decided the card at runtime
        BankCard b = new CreditCardOne();
        Purchase p = new Purchase(b);
        p.itemPuchased();
    }
}