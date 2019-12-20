package com.absratction;

class Subject{
	Topic t=new Topic();
	public void startReading(){
		t.understand();
	}
}
class Topic{
	public void understand(){
		System.out.println("its tighthtycoupled");
	}
}

public class TightCouplingTest {

	public static void main(String[] args) {

		Subject s=new Subject();
		s.startReading();
		
	}

}
