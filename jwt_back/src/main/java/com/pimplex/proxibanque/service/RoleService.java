package com.pimplex.proxibanque.service;

import com.pimplex.proxibanque.dao.RoleDao;
import com.pimplex.proxibanque.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
