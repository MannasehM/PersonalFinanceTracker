package model;

import java.util.List;

/**
 * Represents a user's financial account that holds a list of transactions.
 * Provides methods to add transactions, compute the balance, and filter transactions by category.
 */
public class Account {
    private List<Transaction> transactions;

    /**
     * Adds a transaction to the account.
     *
     * @param t the transaction to be added
     */
    public void addTransaction(Transaction t) {
        //
    }

    /**
     * Calculates and returns the current balance.
     * Incomes add to the balance, expenses subtract from it.
     *
     * @return the current balance
     */
    public double getBalance() {
        return 0;
    }

    /**
     * Retrieves a list of transactions that belong to the specified category.
     *
     * @param categoryName the name of the category to filter by
     * @return a list of transactions in the given category
     */
    public List<Transaction> getTransactionsByCategory(String categoryName) {
        return null;
    }
}
