package webservice;

import java.util.Date;

public class Account {

    private int id;
    private double accountBalance;
    private Date creationDate;

    public Account() {
    }

    public Account(int id, double accountBalance, Date creationDate) {
        this.id = id;
        this.accountBalance = accountBalance;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountBalance=" + accountBalance +
                ", creationDate=" + creationDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
