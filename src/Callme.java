
class Callme {
	synchronized void call (String msg) { 
		System.out.print("[" + msg);
		try {		
			Thread.sleep(1000); 
		}
		catch (Exception e) {};
		System.out.println("]");
    }
}
