package com.bot.restbot.dao;

import com.bot.restbot.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public long userCount() {
        return userRepository.count();
    }
}
