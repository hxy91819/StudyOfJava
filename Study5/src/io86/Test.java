package io86;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getPath());
	}
	
	public String getPath(){
		return this.getClass().getResource("/").getPath(); 
	}
	
}
