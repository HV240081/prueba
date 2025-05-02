package sv.edu.udb.proyecto_catedra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sv.edu.udb.proyecto_catedra.model.User;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository; // Repositorio para acceder a los usuarios

    @GetMapping("/login")
    public String login(String username, String password) {
        // Obtener el usuario desde la base de datos
        User foundUser = userRepository.findByUsername(username);

        // Verificar el usuario y la contraseña
        if (foundUser != null && foundUser.getPassword().equals(password)) {
            return "login_success";
        } else {
            return "login_failure";
        }
    }
}