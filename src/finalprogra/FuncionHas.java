
package finalprogra;

public class FuncionHas {
    
    
    private String NumeroEntrada;
    private String Nombre;
    private String FechaNacimiento;
    private String Llave;

    public FuncionHas(String NumeroEntrada, String Nombre, String FechaNacimiento, String Llave) {
        this.NumeroEntrada = NumeroEntrada;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Llave = Llave;
    }

    /**
     * @return the NumeroEntrada
     */
    public String getNumeroEntrada() {
        return NumeroEntrada;
    }

    /**
     * @param NumeroEntrada the NumeroEntrada to set
     */
    public void setNumeroEntrada(String NumeroEntrada) {
        this.NumeroEntrada = NumeroEntrada;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the Llave
     */
    public String getLlave() {
        return Llave;
    }

    /**
     * @param Llave the Llave to set
     */
    public void setLlave(String Llave) {
        this.Llave = Llave;
    }

   
    
    
}
