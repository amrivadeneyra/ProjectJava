
package modelo;

/**
 @author Manuel Rivadeneyra
 */
public class usuarios {
    
    private int Id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String edad;
    private String correo;
   // private String last_session;
    private int IdTipo;
    private String getlast_session;

    public int getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
    }


    public String getGetLast_session() {
        return getlast_session;
    }

    public void setGetLast_session(String getLast_session) {
        this.getlast_session = getLast_session;
    }
    String getLast_session;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   // public String getLast_session() {
   //     return last_session;
   // }

    //public void setLast_session(String last_session) {
    //    this.last_session = last_session;
    //}

    public void setcorreo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setlast_session(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLast_session(String format) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
