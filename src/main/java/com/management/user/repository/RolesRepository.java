package com.management.user.repository;

import com.management.user.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {

    Role getRoleByName(String name);

    Role getRoleByNameEqualsAndIsDeleted(String name, boolean isDeleted);

}
