package com.demo.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.user.model.User_Permissions;

@Repository
public interface PermissionRepository extends JpaRepository<User_Permissions, Integer> {

}
