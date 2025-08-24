package Facade;

public class Email {
    private String correoElectronico;

    //Aqui estaria la logica para validar que es un correo
    public Email(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public String toString() {
        return correoElectronico;
    }
}