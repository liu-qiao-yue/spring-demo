package com.example.springdemo.jpa.service;

import com.example.springdemo.jpa.entityId.SystemUserId;
import com.example.springdemo.jpa.persistence.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JpaService {

    @Autowired
    private final SystemUserRepository systemUserRepository;

    @Autowired
    public JpaService(SystemUserRepository systemUserRepository){
        this.systemUserRepository = systemUserRepository;
    }

    public boolean findById(){
        return !systemUserRepository.findById(SystemUserId.builder().id("3d464b4ea0d2491aab8a7bde74c57e95").build()).isPresent();
    }

    public boolean find(){
        return systemUserRepository.findSystemUser("3d464b4ea0d2491aab8a7bde74c57e95") == null;
    }

    @Transactional
    public int update(){
        systemUserRepository.updateUserNameById("123","3d464b4ea0d2491aab8a7bde74c57e95");
        return 1;
    }
    @Transactional
    public int findAndUpdate(){
        systemUserRepository.findById(SystemUserId.builder().id("3d464b4ea0d2491aab8a7bde74c57e95").build());
        systemUserRepository.updateUserNameById("123","3d464b4ea0d2491aab8a7bde74c57e95");
        return 1;
    }
}
