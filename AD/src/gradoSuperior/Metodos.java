package gradoSuperior;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;

public class Metodos {

	public static void create(String hostname, String dbName) {
		System.out.println("\n====================== Crear objetos =====================\n");
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
	
	public static void show(String hostname, String dbname) {
		System.out.println("\n====================== Mostrar objetos =====================\n");
		MtDatabase dbcon = new MtDatabase(hostname, dbname);
		dbcon.open();
		try {
			Connection jdbcon = dbcon.getJDBCConnection();
			Statement stmt = dbcon.createStatement();
			String linePrf = "SELECT REF(a) from gradoSuperior.Profesores a;";
			ResultSet rsetP = stmt.executeQuery(linePrf);
			Profesores prf;
			while (rsetP.next()) {
				prf = (Profesores) rsetP.getObject(1);
				System.out.println("Profesor: " + String.format("%16s", prf.getNombre())+ String.format("%16s", prf.getApellidos()) + String.format("%32s", prf.getDni() + String.format("%16s", prf.getTelefono())));
			}
			rsetP.close();
			stmt.close();
			jdbcon.close();
			dbcon.close();	 
		}
		catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	
	public static void update(String hostname, String dbname, String nombre, String nuevoNombre) {
		System.out.println("\n=========== Modifica un objeto ==========\n");
				 int nProfesores = 0;
				 try { MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "gradoSuperior"));
				 db.open();
				 db.startTransaction();
				 System.out.println("\n" + Profesores.getInstanceNumber(db) + " Profesor(es) en la DB.");
				 nProfesores = (int) Profesores.getInstanceNumber(db);
				 MtObjectIterator<Profesores> iter = Profesores.<Profesores>instanceIterator(db);
				 	while (iter.hasNext()) {
				 		Profesores[] profesores = iter.next(nProfesores);
				 		for (int i = 0; i < profesores.length; i++) {
				 			if (profesores[i].getNombre().compareTo(nombre) == 0) {
				 				profesores[i].setNombre(nuevoNombre);
				 			} 
				 			else {
				 			}	 
				 		}
				 	}
				 	iter.close();
				 	db.commit();
				 	db.close();
				 	System.out.println("\n Modificación realizada.");
				 }
				 catch (MtException mte) {
					 System.out.println("MtException : " + mte.getMessage());
				}
	}
	
	public static void delete(String hostname, String dbname) {
		System.out.println("\n====================== Borrar Todos =====================\n");
		try {
			 MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "gradoSuperior"));
			 db.open();
			 db.startTransaction();
			 Profesores.getClass(db).removeAllInstances();
			 Clases.getClass(db).removeAllInstances();
			 Cursos.getClass(db).removeAllInstances();
			 Asignaturas.getClass(db).removeAllInstances();
			 db.commit();
			 db.close();
			 System.out.println("\nSe han eliminado todos los datos de todos los objetos.");
		 } 
		catch (MtException mte) {
		 System.out.println("MtException : " + mte.getMessage());
		 } 

	}

}
