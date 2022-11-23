package br.com.register.commons.service;

import br.com.register.commons.domain.v1.entity.ClientEntity;
import br.com.register.commons.domain.v1.repositories.ClientRepository;
import br.com.register.commons.domain.v1.security.UserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/*
 * Classe que implementa o contrato de autenticação do usuário padrão do Spring Security.
 *
 * @author otaviogomestj@gmail.com
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClientRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Usamos o email, ao invés do username
        ClientEntity cliente = repository.findByEmail(email).orElseGet(() -> {
            throw new UsernameNotFoundException("User not found with email: " + email);
        });

        return new UserAuthentication(cliente.getId(), cliente.getNomeCompleto(), cliente.getEmail(), cliente.getSenha());
    }
}