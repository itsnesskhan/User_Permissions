package com.demo.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.user.model.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
