package com.ThridDay;


	class one {
		public void on() {
			System.out.println("Geeks");
		}
	}

	class two extends one {
		public void off() {
			System.out.println("for");
		}
	}

public class SingleInheritance {
		public static void main(String[] args) {
			two g = new two();
			g.on();
			g.off();
			g.on();
		}
	}


