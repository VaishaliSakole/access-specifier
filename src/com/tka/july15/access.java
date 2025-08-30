package com.tka.july15;

public class access {
	private int var=10;
public int var1=20;
int var2=30;
protected int var3=40;
 
public void  add(int a,int b) {
System.out.println("add="+(a+b));
System.out.println("public="+var1);
System.out.println("private="+var);
System.out.println("default="+var2);
System.out.println("protected="+var3);
sub(20,10);
multi(20,10);
div(20,10);


}
private void sub(int c,int d) {
	System.out.println("sub="+(c-d));
	System.out.println("private="+var);
	
}
void multi(int e,int f) {
		System.out.println("multi="+e*f);
		System.out.println("default="+var2);
		System.out.println("public="+var1);
		System.out.println("private="+var);
		System.out.println("default="+var2);
		System.out.println("protected="+var3);
	}
	
	
	protected void div(int k,int l) {
		System.out.println("div="+k/l);
	
		System.out.println("public="+var1);
		System.out.println("private="+var);
		System.out.println("default="+var2);
		System.out.println("protected="+var3);
	}
}