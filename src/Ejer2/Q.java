package Ejer2;

class Q {
	  int n;
	  synchronized int get() {
	    System.out.println("Obtengo: " + n);
	    return n;
	  }
	  synchronized void put(int n) {
		    this.n = n;
		    System.out.println("Pongo: " + n);
		  }

}

