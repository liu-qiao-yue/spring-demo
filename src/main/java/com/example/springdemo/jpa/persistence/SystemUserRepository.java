package com.example.springdemo.jpa.persistence;

import com.example.springdemo.jpa.entity.SystemUser;
import com.example.springdemo.jpa.entityId.SystemUserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SystemUserRepository extends JpaRepository<SystemUser, SystemUserId> {
    @Query(nativeQuery = true, value = "select * from sys_user where id=:#{#id} and username=''")
    SystemUser findSystemUser(@Param("id")String id);

    @Modifying
    @Query(nativeQuery = true, value = "update sys_user set username=:#{#username} where id = :#{#id}")
    void updateUserNameById(@Param("username") String username, @Param("id") String id);
}
