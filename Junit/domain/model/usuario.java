// domain/model/Usuario.java
public class Usuario {
    private String id;
    private String nombreCompleto;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String genero;
    

    public Usuario(String id, String nombreCompleto, String tipoIdentificacion, String numeroIdentificacion,
                   String telefono, LocalDate fechaNacimiento, String genero) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    // Getters y setters omitidos por brevedad


}
