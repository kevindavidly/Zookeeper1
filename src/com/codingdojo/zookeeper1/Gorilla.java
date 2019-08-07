package com.codingdojo.zookeeper1;

	public class Gorilla extends Mammal{
	    
		public void throwSomething() {
			energyLevel -= 5;
			System.out.println("Gorilla has thrown something!");
			displayEnergy();
		}
		public void eatBananas() {
			energyLevel +=10;
			System.out.println("Gorilla is sastified!");
			displayEnergy();
		}
		public void climb() {
			energyLevel +=10;
			System.out.println("Gorilla climbed a tree");
			displayEnergy();
		}
	}

