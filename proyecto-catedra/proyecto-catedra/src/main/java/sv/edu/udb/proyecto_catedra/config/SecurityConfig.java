package sv.edu.udb.proyecto_catedra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configuración de las reglas de acceso
        http
                .authorizeRequests(authz -> authz
                        .requestMatchers("/public/**").permitAll()  // Rutas públicas que no requieren autenticación
                        .anyRequest().authenticated()  // Requiere autenticación para todas las demás rutas
                )
                .formLogin(form -> form
                        .loginPage("/login")  // Ruta personalizada de login
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")  // Ruta personalizada de logout
                        .permitAll()
                );

        return http.build();  // Se construye y se devuelve la configuración
    }
}