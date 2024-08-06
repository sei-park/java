package ch06.second;

public class Iphone {
	
	int cpu;
	int memory;
	String color; 
	
	Iphone(int cpu) {
		this.cpu = cpu;
	}
	
	Iphone(int cpu, int memory) {
		this.cpu = cpu;
		this.memory = memory;
	}
	
	Iphone(int cpu, int memory, String color) {
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;  
	}

}
