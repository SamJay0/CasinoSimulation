
package casinosimulator;

/**
 *
 * @author SamJay
 */
public class Player {
    private String name;
    private double deposit;
    private double losingAmount;
    private double winningAmount;
    private double accountBalance;

    //getters
    public double getAccountBalance() {
        return accountBalance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getLosingamount() {
        return losingAmount;
    }

    public String getName() {
        return name;
    }

    public double getWinningamount() {
        return winningAmount;
    }
    
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setLosingamount(double losingAmount) {
        this.losingAmount = losingAmount;
    }

    public void setWinningamount(double winningAmount) {
        this.winningAmount = winningAmount;
    }
    
    
    
    
}
