
public class Empleado {

    //Variables de instanciaa
    private String nombre;
    private String numeroNomina;
    private String sexo;
    private double sueldo;
    private boolean activo;

    private static int contarObjetos;

    //Sobrecarga de constructores
    public Empleado (){
        contarObjetos++;

    }

    public Empleado ( String nombre,String numeroNomina,
                     String sexo, double sueldo,
                     boolean activo
                     ){
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;

        contarObjetos++;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public static int getContarObjetos(){
        return Empleado.contarObjetos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append("numeroNomina='").append(numeroNomina).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append(", activo=").append(activo?"Activo":"Inactivo");//ternario
        sb.append('}');
        return sb.toString();
    }
}
