// Open Closed Principle 
interface BankNotification {
    public void sendOtp();
}

class SendToEmail implements BankNotification {
    public void sendOtp() {
        System.out.println("OTP sent to registered email");
    }
}

class SendToMobile implements BankNotification {
    public void sendOtp() {
        System.out.println("OTP sent to registred mobile");
    }
}

interface BankLoan {
    public void getLoan();
}

class HomeLoan implements BankLoan {
    public void getLoan(){
        System.out.println("Home Loan");
    }
}

class EducationLoan implements BankLoan {
    public void getLoan(){
        System.out.println("Education Loan");
    }
}
public class OpenClosed {
    public static void main(String ...args){
        BankService bs = new BankService();
        bs.deposit(4000);
        BankNotification bn = new SendToEmail();
        bn.sendOtp();
        BankNotification bn1 = new SendToMobile();
        bn1.sendOtp();
        BankLoan bl = new HomeLoan();
        bl.getLoan();
    }
}
