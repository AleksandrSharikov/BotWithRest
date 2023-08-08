package com.bot.restbot.dao;

import com.bot.restbot.repository.MemRepository;
import org.springframework.stereotype.Service;

@Service
public class MemDaoImpl implements MemDao {
    private final MemRepository memRepository;

    public MemDaoImpl(MemRepository memRepository) {
        this.memRepository = memRepository;
    }

    @Override
    public long memCount() {
        return memRepository.count();
    }
}
