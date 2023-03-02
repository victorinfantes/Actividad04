public class Alumno {

    private String DNI;
    private String nombre;
    private String apellidos;
    private String dir;

    public Alumno() {
    }

    public Alumno(String DNI, String nombre, String apellidos, String dir) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dir = dir;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
