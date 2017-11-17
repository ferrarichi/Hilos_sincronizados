class Synch {
   	public static void main(String args[]) {
		Callme target = new Callme();
		new Caller(target, "Hola");
		new Caller(target, "Mundo");
		new Caller(target, "Sincronizado");
   	}
}
