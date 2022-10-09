package org.binar.kampusmerdeka.repository;

import org.binar.kampusmerdeka.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
//    @Query("SELECT * FROM user_entity where name like %?1")
//    UserEntity findAllByNativeQuery(String name);
}
