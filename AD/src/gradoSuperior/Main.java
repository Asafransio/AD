package gradoSuperior;

public class Main {
	static String hostname = "localhost";
	static String dbname = "gradoSuperior";

	public static void main(String[] args) {
		Metodos.create(hostname, dbname);
		Metodos.show(hostname, dbname);
		Metodos.update(hostname, dbname, "Maria Jose", "Juana");
		Metodos.show(hostname, dbname);
		Metodos.delete(hostname, dbname);
		Metodos.show(hostname, dbname);
 

	}

}
