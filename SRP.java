// S -> SRP Single Reponsibility Principle

// Code which voilates the Single Responsibility Principle
class BankService {
    public void deposit(double amount){
        System.out.println("Depositing amount " + amount);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing amount " + amount);
    }
    // public void printTransactions(){
    //     System.out.println("Printing all transactions");
    // }
    // public void getLoan(String type){
    //     if(type == "home"){
    //         System.out.println("Home Loan");
    //     }else if(type == "education"){
    //         System.out.println("Education Loan");
    //     }
    // }
    // public void sendOtp(String medium){
    //     if(medium == "email"){
    //         System.out.println("Sending OTP to registered email");
    //     }else if(medium == "mobile"){
    //         System.out.println("Sending OTP to registered mobile");
    //     }
    // }
}

// Code with Single Responsibility Principle

class BankTransaction {
    public void printTransactions(){
        System.out.println("Printing all transactions");
    }
}

// violates Open Closed principle
class BankLoan {
    public void getLoan(String type){
        if(type == "home"){
            System.out.println("Home Loan");
        }else if(type == "education"){
            System.out.println("Education Loan");
        }
    }
}

// Violates Open Closed Principle
class BankNotification {
    public void sendOtp(String medium){
        if(medium == "email"){
            System.out.println("Sending OTP to registered email");
        }else if(medium == "mobile"){
            System.out.println("Sending OTP to registered mobile");
        }
    }
}

public class SRP {
    public static void main(String ...args){
        BankService bankService = new BankService();
        bankService.deposit(5000);
        bankService.withDraw(2000);
        // bankService.printTransactions();
        // bankService.getLoan("education");
        // bankService.sendOtp("mobile");
    }
}