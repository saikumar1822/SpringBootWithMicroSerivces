package com.example.SpringJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringJwt.domain.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
Role findByName(String name);
}
