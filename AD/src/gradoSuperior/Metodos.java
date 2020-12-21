package gradoSuperior;




import com.matisse.MtDatabase;
import com.matisse.MtPackageObjectFactory;

public class Metodos {

	public static void create(String hostname, String dbName, String nombre, String apellidos, Integer telefono, String dni) {
		MtDatabase db = new MtDatabase(hostname, dbName, new MtPackageObjectFactory("", "gradoSuperior"));
		db.open();
		db.startTransaction();
		System.out.println("Conectado a la base de datos " + db.toString() + " de Matisse");
		
		Profesores prf = new Profesores(db);
		prf.setNombre("Maria Jose");
		prf.setApellidos("Diaz Martinez");
		prf.setTelefono(666666666);
		prf.setDni("12345678Z");
		
		System.out.println("Profesor" + prf.getNombre() + "creado.");
		
		Cursos crs = new Cursos(db);
		crs.setNombreClases("Matematicas");
		crs.setAula("H 0.10");
		crs.setDuracion(2);
		crs.setHoraInicio("12:30");
		crs.setFecha("12-10-2013");
		
		Asignaturas as = new Asignaturas(db);
		as.setNombreClases("Matematicas");
		as.setAula("H 0.10");
		as.setDuracion(2);
		as.setHoraInicio("12:30");
		as.setDiaSemana("Martes");
		
		Clases[] cls = new Clases[2];
		cls[0] = as;
		cls[1] = crs;
		
		prf.setImparte(cls);
		System.out.println("Clase" + crs.getNombreClases() + "creado.");
		
		db.commit();
		db.close();
	}

}
