/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author macbookair
 */
public class Account {
    private String BankName;
    private String RoutingNumber;
    private String AccountNumber;
    private int Balance;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getRoutingNumber() {
        return RoutingNumber;
    }

    public void setRoutingNumber(String RoutingNumber) {
        this.RoutingNumber = RoutingNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    
   
   @Override
   public String toString(){
       return BankName;
   }
    
    
}
