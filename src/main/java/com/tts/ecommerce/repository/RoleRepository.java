package com.tts.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository<Role> extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}