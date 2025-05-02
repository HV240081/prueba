package sv.edu.udb.proyecto_catedra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.proyecto_catedra.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
