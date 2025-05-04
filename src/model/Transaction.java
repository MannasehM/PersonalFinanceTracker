package model;
import java.time.LocalDate;


public class Transaction {
	
	private enum TransactionType {
	    INCOME, EXPENSE
	}
	
    private String description;
    private double amount;
    private LocalDate date;
    private String category;
    private TransactionType type; // INCOME or EXPENSE
}
