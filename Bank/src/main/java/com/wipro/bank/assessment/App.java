//Appjava

package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;
import com.wipro.bank.entity.*;

public class App {
	public static List<Account> accounts = new ArrayList<Account>();

	public Account getAccountDetailsByID(int id) {
		int i;
		Account result = null;
		for (i = 0; i < accounts.size(); i++) {
			if (((Account) accounts.get(i)).getAccountID() == id)
				result = accounts.get(i);
		}
		return result;
	}

	public List<Account> getAccountDetailsByBalance(double amount)
    {
    	int i;
    	List<Account> result=new ArrayList<Account>();
        for(i=0;i<accounts.size();i++)
        {	double v=accounts.get(i).getBalance();
        	if(v>=amount) 
        		result.add(accounts.get(i));
        }
        if(result.size()==0)
        {
        	return null;
        }
        else
        {
    		return result;
        }
    }
}
