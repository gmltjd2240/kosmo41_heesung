package com.study.pattern02.stretegy3;

public class Main {

	public static void main(String[] args) {
		//데이터베이스를 전략적으로 선택하여 사용한다.
		DatabaseUse myDB = new DatabaseUse();
		myDB.connect();
		
		myDB.setDatbase(new MySQL());
		myDB.connect();
		
		myDB.setDatbase(new Oracle());
		myDB.connect();
		
		myDB.setDatbase(new Informix());
		myDB.connect();

	}

}
