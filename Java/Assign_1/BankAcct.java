class BankAcct {
    private String acc_num;
    private double balance;
    private static double interestRate = 4.0;

    BankAcct(final String num, final double balance) {
        setAcc_num(num);
        this.balance = balance;
    }

    public String getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }

    static void setInterest(final double rate) {
        interestRate = rate;
    }

    static double getInterest() {
        return interestRate;
    }

    public double interest() {
        return balance * interestRate / 100;
    }

    public static void main(final String[] args) {
        final BankAcct acc1 = new BankAcct("00156", 10000);
        BankAcct.setInterest(8.0);
        final double interest = acc1.interest();
            System.out.println("Interest "+interest);
            System.out.println("interstRate: "+BankAcct.getInterest());
    }
}
