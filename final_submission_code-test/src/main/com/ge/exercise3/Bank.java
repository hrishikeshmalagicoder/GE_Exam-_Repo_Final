package com.ge.exercise3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author HRISHIKESH
 *getCurrentHolding() and projectProfitForNextMonth has first two finctionalities
 *check the test cases for this class.
 */

public class Bank {

    private static final Logger logger = LogManager.getLogger(Bank.class);
    private Map<String, Account> accountMap;

    public Bank() {
        accountMap = new HashMap<>();
    }

    public Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void depositToAccount(String accountNumber, float amount) {
        getAccount(accountNumber).deposit(amount);
    }

    public void withdrawFromAccount(String accountNumber, float amount) {
        getAccount(accountNumber).withdraw(amount);
    }

    public int numAccounts() {
        return accountMap.size();
    }
    
    public float getCurrentHolding() {
    	
    	float sum=0;
    	for(Map.Entry<String, Account> map:accountMap.entrySet()) {
    		
    	
    		Account account=map.getValue();
    		
    		sum=sum+account.getBalance();
    		
    	
    	}
    	
    	return sum;
    }
    
    
    public boolean projectProfitForNextMonth() {
    	
    	float interest_paid_sum=0;
    	float fees_collected_sum=0;
    	for(Map.Entry<String, Account> map:accountMap.entrySet()) {
    		
    		Account account=map.getValue();
    		fees_collected_sum=fees_collected_sum+account.getMonthlyFee();
    		
    		interest_paid_sum=interest_paid_sum+((account.getBalance()*account.getMonthlyInterestRate())-account.getBalance());
    	
    	}
    	System.out.println(interest_paid_sum+" "+fees_collected_sum);
    	if(interest_paid_sum>=fees_collected_sum) {
    		return false;
    	}else {
    		return true;
    	}
    	
    	
    	
    }
    
}
