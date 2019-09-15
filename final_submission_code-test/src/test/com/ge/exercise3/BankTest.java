package com.ge.exercise3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankTest {

    Bank bank;

    @Before
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void addAccountTest() {
        Account account = new Account("001");
        bank.addAccount(account);
        assertEquals(1, bank.numAccounts());
    }

    @Test
    public void getAccountTest() {
        Account account = new Account("002", "Checking", 100.0f);
        bank.addAccount(account);
        assertEquals(account, bank.getAccount("002"));
    }

    @Test
    public void depositToAccountTest() {
        Account account = new Account("003", "Checking", 100.0f);
        bank.addAccount(account);
        bank.depositToAccount("003", 100.0f);
        assertEquals(200.0f, account.getBalance(), 0.01);
    }

    @Test
    public void withdrawFromAccountTest() {
        Account account = new Account("004", "Checking", 100.0f);
        bank.addAccount(account);
        bank.withdrawFromAccount("004", 100.0f);
        assertEquals(0.0f, account.getBalance(), 0.01);
    }
    
    @Test
    public void currentHoldingstest() {
    	
    	 Account account1 = new Account("001", "Checking", 100.0f);
    	 Account account2 = new Account("002", "Checking", 100.0f);
    	 Account account3 = new Account("003", "Checking", 100.0f);
    	 Account account4 = new Account("004", "Checking", 100.0f);
    	 Account account5 = new Account("005", "Checking", 100.0f);
    	 
    	 bank.addAccount(account1);
    	 bank.addAccount(account2);
    	 bank.addAccount(account3);
    	 bank.addAccount(account4);
    	 bank.addAccount(account5);
    	 
    	
    	  assertEquals(500.0f,bank.getCurrentHolding(), 0.01);
    	 
    }
    
    @Test
    public void projectionForNextMonth1() {
    	
    	 Account account1 = new Account("001", "Checking", 100.0f);
    	 Account account2 = new Account("002", "Savings", 100.0f);
    	 Account account3 = new Account("003", "Checking", 100.0f);
    	 Account account4 = new Account("004", "Savings", 100.0f);
    	 Account account5 = new Account("005", "Checking", 100.0f);
    	 
    	 bank.addAccount(account1);
    	 bank.addAccount(account2);
    	 bank.addAccount(account3);
    	 bank.addAccount(account4);
    	 bank.addAccount(account5);
    	 
    	assertFalse(bank.projectProfitForNextMonth());
    	 
    	 
    }
    
    @Test
    public void projectionForNextMonth2() {
    	
    	 Account account1 = new Account("001", "Checking", 100.0f);
    	 Account account2 = new Account("002", "Savings", 100.0f);
    	 Account account3 = new Account("003", "Checking", 100.0f);
    	 Account account4 = new Account("004", "Savings", 100.0f);
    	 Account account5 = new Account("005", "Checking", 100.0f);
    	 account5.setMonthlyFee(100);
    	 
    	 bank.addAccount(account1);
    	 bank.addAccount(account2);
    	 bank.addAccount(account3);
    	 bank.addAccount(account4);
    	 bank.addAccount(account5);
    	 
    	assertTrue(bank.projectProfitForNextMonth());
    	 
    	 
    }
    
    
    
    
}