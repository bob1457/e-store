package com.skyware.estore.services;

import com.skyware.estore.models.User;

import java.util.Optional;

public interface IUserService
{

    User SaveUser(User user);

    Optional<User> FindUserByUsername(String username);

    void MakeAdmin(String username);
}
