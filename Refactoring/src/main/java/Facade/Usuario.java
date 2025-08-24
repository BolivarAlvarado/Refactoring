package Facade;

public class Usuario {
    private String idUser;
    private String nombre;
    private String email;

    public Usuario(String idUser, String nombre, String email) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.email = email;
    }

    public String getIdUser() { return idUser; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}