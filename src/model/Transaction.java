/**
 * Transaction class. 
 * @author Mannaseh Merakanapalli
 */

package model;

import java.time.LocalDate;

/**
 * Represents a single financial transaction, such as an income or an expense.
 * Each transaction includes a description, amount, date, category, and type.
 */
public class Transaction {

    /**
     * Enum representing the type of transaction.
     * INCOME adds to the balance, EXPENSE subtracts from it.
     */
    private enum TransactionType {
        INCOME, EXPENSE
    }

    private String description;
    private double amount;
    private LocalDate date;
    private String category;
    private TransactionType type; // INCOME or EXPENSE

    // Consider adding constructors, getters, and setters for full functionality.
}
