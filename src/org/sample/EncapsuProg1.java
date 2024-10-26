package org.sample;

public class EncapsuProg1 extends EncapsuProg{
	public static void main(String[] args) {
		EncapsuProg1 e = new EncapsuProg1();
		String name = e.getName();
		System.out.println(name);
		
		e.setName("Ezhil");
		String name2 = e.getName();
		System.out.println(name2);
	}

}
