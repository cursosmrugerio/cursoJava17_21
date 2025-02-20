package com.enums.v0;

enum Type{
	CHECKING,
	SAVINGS,
	FD
}

enum Tipo{
	CHECKING {
		@Override
		void show() {
			System.out.println("Checking account");
		}
	},
	SAVINGS {
		@Override
		void show() {
			System.out.println("Savings account");
		}
	},
	FD {
		@Override
		void show() {
			System.out.println("Fixed Deposit");
		}
	};
	
	abstract void show();
}

enum AccountType {
    CHECKING("Checking account"),  //0 new
    SAVINGS("Savings account"), //1 new
    FD("Fixed Deposit"), //new
    EJE; //2 //new

    private String desc;
    
    //private
    AccountType(String desc) {
        this.desc = desc;
    }
    //private
    AccountType() {
    }

    @Override
    public String toString() {
        return "Acct type:" + super.toString();
    }
    
	public String getDesc() {
		return desc;
	}
}

public class TestClass {
    public static void main(String[] args) {
//    	AccountType at = AccountType.valueOf("FD");
//    	System.out.println(at.toString());
//    	
    	AccountType at = AccountType.valueOf("FD");
        System.out.println(at.ordinal() + " " + at);
        //2 Acct type:FD
        
        System.out.println(at.getDesc());
        
        at = AccountType.EJE;
        System.out.println(at.getDesc());
        
        System.out.println("*******");
        
        Tipo tipo = Tipo.SAVINGS;
        System.out.println(tipo);
        tipo.show();
        
    }
}

