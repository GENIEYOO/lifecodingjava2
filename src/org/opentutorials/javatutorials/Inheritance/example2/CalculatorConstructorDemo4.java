package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
	int left, right;
	//public  ���� ����������.
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
		//�� �����ڰ� �Ű������� �ִ� �����ڶ� ���� Ŭ������ ����Ŭ������ �⺻ �����ڸ� ��������� �ʴ´�.
		//�ذ� ��� 1.�� ���� ���� public Calculator() {}  �⺻������ ������ֱ�
	    //�����ڶ�? �޼ҵ���� Ŭ������� �����ϰ�/����Ÿ���� �������� ����.
	
	}
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
		//�θ� Ŭ������ �ǹ� 
	}
	
	public void substract(){
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}	
}