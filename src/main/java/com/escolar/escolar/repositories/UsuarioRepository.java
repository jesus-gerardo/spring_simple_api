package com.escolar.escolar.repositories;

import com.escolar.escolar.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {}
