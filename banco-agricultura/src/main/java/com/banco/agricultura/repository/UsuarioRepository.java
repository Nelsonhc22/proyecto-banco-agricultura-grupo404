package com.banco.agricultura.repository;

import com.banco.agricultura.model.Usuario;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class UsuarioRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Optional<Usuario> findByUsername(String username) {
        return sessionFactory.getCurrentSession()
            .createQuery("FROM Usuario u WHERE u.username = :username", Usuario.class)
            .setParameter("username", username)
            .uniqueResultOptional();
    }

    public Optional<Usuario> findByDui(String dui) {
        return sessionFactory.getCurrentSession()
            .createQuery("FROM Usuario u WHERE u.dui = :dui", Usuario.class)
            .setParameter("dui", dui)
            .uniqueResultOptional();
    }

    public void guardar(Usuario usuario) {
        sessionFactory.getCurrentSession().persist(usuario);
    }

    public void actualizar(Usuario usuario) {
        sessionFactory.getCurrentSession().merge(usuario);
    }
}