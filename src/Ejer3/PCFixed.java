package Ejer3;

class PCFixed {
	  public static void main(String args[]) {
	    Q q = new Q();
	    new Producer(q);
	    new Consumer(q);
	    System.out.println("Pulsa Control-C para parar.");
	  }
	}

