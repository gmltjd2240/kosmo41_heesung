package com.study.pattern02.stretegy1;

public class BObj {
	AInterface ainter;
	public BObj() {
	ainter = new AImplement();
	
	}
	public void SomeFunc() {
		
		// ���� ��ɤ� ���ʿ��մϴ�. A�� ������࿩.
		//��� ������ ���� - delegate �ߴ�
	//	System.out.println("AAA");
	//	System.out.println("AAA");
	//	System.out.println("AAA");
		
		
		//Delegate ���
		ainter.funcA();
		ainter.funcA();
		ainter.funcA();
	}
}