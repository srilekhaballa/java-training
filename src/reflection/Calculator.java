package reflection;

import org.apache.log4j.Logger;

import package2.B;

public class Calculator {
		
		private static final Logger log = Logger.getLogger(Calculator.class);
		private double num1;
		private double num2;
		
	Calculator(){
		log.info("Default Constructor");
	}
	
	Calculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public static void main(String[] args) {
		

	}

}
