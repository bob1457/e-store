package com.skyware.estore.repository;

import com.skyware.estore.models.Role;
import com.skyware.estore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long>
{
    Optional<User> findByUsername(String username);
//    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set UserRole =: role where username =: username")
    void updateUserRole(@Param("Username") String username, @Param("role") Role role);
}
