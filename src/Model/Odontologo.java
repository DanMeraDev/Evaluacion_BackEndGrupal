package Model;

public class Odontologo {
    private Integer id;
    private Integer matricula;
    private String nombre;
    private String apellido;

    public Odontologo() {

    }

    public Odontologo(Integer matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
//
//    public Odontologo(Integer id, Integer matricula, String nombre, String apellido) {
//        this.id = id;
//        this.matricula = matricula;
//        this.nombre = nombre;
//        this.apellido = apellido;
//    }

    public Integer getId() {
        return id;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
