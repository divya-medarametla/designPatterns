package com.factorymethod.pattern;

abstract class Cost {
	
	 double rate;  
    abstract void getRate();  

    double calculateBill(double sqrfoot){  
         return sqrfoot*rate;  
     }  
}
