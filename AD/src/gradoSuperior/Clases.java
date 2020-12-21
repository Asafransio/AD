/*
 * Clases.java
 *
 * Generated with Matisse Schema Definition Language 9.1.11
 * Generation date: Mon Dec 21 13:33:11 2020
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package gradoSuperior;



/**
 * <code>Clases</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Clases extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.11
     * Generation Date: Mon Dec 21 13:33:11 2020
     */

    /*
     * Class variables and methods
     */

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Class <code>Clases</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("gradoSuperior.Clases"));

    /**
     * Gets the <code>Clases</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Clases(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Clases(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Clases.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Clases.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Clases.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Clases.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'nombreClases' */

    /** Attribute <code>nombreClases</code> cache ID */
    private static int nombreClasesCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nombreClases",CID));

    /**
     * Gets the <code>nombreClases</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNombreClasesAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreClasesCID);
    }


    /**
     * Gets the <code>nombreClases</code> attribute value.
     * @return the value
     *
     * @see #setNombreClases
     * @see #removeNombreClases
     */
    public final String getNombreClases() {
        return getString(getNombreClasesAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>nombreClases</code> attribute value.
     * @param val the new value
     *
     * @see #getNombreClases
     * @see #removeNombreClases
     */
    public final void setNombreClases(String val) {
        setString(getNombreClasesAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>nombreClases</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNombreClases
     * @see #setNombreClases
     */
    public final void removeNombreClases() {
        removeValue(getNombreClasesAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getNombreClases
     * @see #setNombreClases
     */
    public final boolean isNombreClasesNull() {
        return isNull(getNombreClasesAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNombreClases
     * @see #setNombreClases
     */
    public final boolean isNombreClasesDefaultValue() {
        return isDefaultValue(getNombreClasesAttribute(getMtDatabase()));
    }


    /* Attribute 'aula' */

    /** Attribute <code>aula</code> cache ID */
    private static int aulaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("aula",CID));

    /**
     * Gets the <code>aula</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getAulaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(aulaCID);
    }


    /**
     * Gets the <code>aula</code> attribute value.
     * @return the value
     *
     * @see #setAula
     * @see #removeAula
     */
    public final String getAula() {
        return getString(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>aula</code> attribute value.
     * @param val the new value
     *
     * @see #getAula
     * @see #removeAula
     */
    public final void setAula(String val) {
        setString(getAulaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>aula</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getAula
     * @see #setAula
     */
    public final void removeAula() {
        removeValue(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getAula
     * @see #setAula
     */
    public final boolean isAulaNull() {
        return isNull(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getAula
     * @see #setAula
     */
    public final boolean isAulaDefaultValue() {
        return isDefaultValue(getAulaAttribute(getMtDatabase()));
    }


    /* Attribute 'duracion' */

    /** Attribute <code>duracion</code> cache ID */
    private static int duracionCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("duracion",CID));

    /**
     * Gets the <code>duracion</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDuracionAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(duracionCID);
    }


    /**
     * Gets the <code>duracion</code> attribute value.
     * @return the value
     *
     * @see #setDuracion
     * @see #removeDuracion
     */
    public final float getDuracion() {
        return getFloat(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>duracion</code> attribute value.
     * @param val the new value
     *
     * @see #getDuracion
     * @see #removeDuracion
     */
    public final void setDuracion(float val) {
        setFloat(getDuracionAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>duracion</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final void removeDuracion() {
        removeValue(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionNull() {
        return isNull(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionDefaultValue() {
        return isDefaultValue(getDuracionAttribute(getMtDatabase()));
    }


    /* Attribute 'horaInicio' */

    /** Attribute <code>horaInicio</code> cache ID */
    private static int horaInicioCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("horaInicio",CID));

    /**
     * Gets the <code>horaInicio</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getHoraInicioAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(horaInicioCID);
    }


    /**
     * Gets the <code>horaInicio</code> attribute value.
     * @return the value
     *
     * @see #setHoraInicio
     * @see #removeHoraInicio
     */
    public final String getHoraInicio() {
        return getString(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>horaInicio</code> attribute value.
     * @param val the new value
     *
     * @see #getHoraInicio
     * @see #removeHoraInicio
     */
    public final void setHoraInicio(String val) {
        setString(getHoraInicioAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>horaInicio</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final void removeHoraInicio() {
        removeValue(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioNull() {
        return isNull(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioDefaultValue() {
        return isDefaultValue(getHoraInicioAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'es_impartida' */

    /** Relationship <code>es_impartida</code> cache ID */
    private static int es_impartidaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("es_impartida",CID));

    /**
     * Gets the <code>es_impartida</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getEs_impartidaRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(es_impartidaCID);
    }

    /**
     * Gets the <code>es_impartida</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     * @see #setEs_impartida
     * @see #removeEs_impartida
     */
    public final gradoSuperior.Profesores[] getEs_impartida() {
        return (gradoSuperior.Profesores[])getSuccessors(getEs_impartidaRelationship(getMtDatabase()), gradoSuperior.Profesores.class);
    }

    /**
     * Counts the <code>es_impartida</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getEs_impartida
     * @see #es_impartidaIterator
     * @see #setEs_impartida
     * @see #removeEs_impartida
     */
    public final int getEs_impartidaSize() {
        return getSuccessorSize(getEs_impartidaRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>es_impartida</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getEs_impartida
     * @see #getEs_impartidaSize
     * @see #setEs_impartida
     * @see #removeEs_impartida
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> es_impartidaIterator() {
        return this.<E>successorIterator(getEs_impartidaRelationship(getMtDatabase()), gradoSuperior.Profesores.class);
    }

    /**
     * Sets the <code>es_impartida</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     * @see #removeEs_impartida
     */
    public final void setEs_impartida(gradoSuperior.Profesores[] succs) {
        setSuccessors(getEs_impartidaRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>es_impartida</code> successors list.
     * @param succ the object to add
     *
     * @see #getEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     * @see #setEs_impartida
     * @see #removeEs_impartida
     */
    public final void prependEs_impartida(gradoSuperior.Profesores succ) {
        prependSuccessor(getEs_impartidaRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>es_impartida</code> successors list.
     * @param succ the object to add
     *
     * @see #getEs_impartida
     * @see #setEs_impartida
     * @see #removeEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     */
    public final void appendEs_impartida(gradoSuperior.Profesores succ) {
        appendSuccessor(getEs_impartidaRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>es_impartida</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getEs_impartida
     * @see #setEs_impartida
     * @see #removeEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     */
    public final void appendEs_impartida(gradoSuperior.Profesores[] succs) {
        addSuccessors(getEs_impartidaRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>es_impartida</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getEs_impartida
     * @see #setEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     */
    public void removeEs_impartida(gradoSuperior.Profesores[] succs) {
        removeSuccessors(getEs_impartidaRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>es_impartida</code> successors list.
     * @param succ the object to remove
     *
     * @see #getEs_impartida
     * @see #setEs_impartida
     * @see #getEs_impartidaSize
     * @see #es_impartidaIterator
     */
    public void removeEs_impartida(gradoSuperior.Profesores succ) {
        removeSuccessor(getEs_impartidaRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>es_impartida</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearEs_impartida() {
        clearSuccessors(getEs_impartidaRelationship(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Clases(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Clases]";
    }
}
