package backend.registro.equipos.Backend_re.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="docIdentidd")
    private String docIdentidad;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;


    private int tipo_doc;


    public Usuarios() {
    }


    public Usuarios(int id, String docIdentidad, String nombre, String apellido, int tipo_doc) {
        this.id = id;
        this.docIdentidad = docIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_doc = tipo_doc;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDocIdentidad() {
        return docIdentidad;
    }


    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getTipo_doc() {
        return tipo_doc;
    }


    public void setTipo_doc(int tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

}
