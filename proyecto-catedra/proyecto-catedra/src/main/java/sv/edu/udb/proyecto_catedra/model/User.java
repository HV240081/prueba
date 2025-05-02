package sv.edu.udb.proyecto_catedra.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // Añadir esta anotación para que JPA reconozca esta clase como entidad
public class User {

    @Id  // Necesitas un campo con esta anotación para la clave primaria
    private Long id;
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters y Setters para el ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
