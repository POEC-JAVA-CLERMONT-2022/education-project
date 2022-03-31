package com.educ.data;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.educ.entity.Role;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    public List<Role> findAll();

  public Role getById(Long id);

    public Role createRole(String roleName);



    public void updateRole (Long id, String name);



}
