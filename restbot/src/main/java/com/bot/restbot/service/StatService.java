package com.bot.restbot.service;

import com.bot.restbot.dao.MemDao;
import com.bot.restbot.dao.UserDao;
import com.bot.restbot.dto.MainStat;
import org.springframework.stereotype.Service;

@Service
public class StatService {
    private final MemDao memDao;
    private final UserDao userDao;

    public StatService(MemDao memDao, UserDao userDao) {
        this.memDao = memDao;
        this.userDao = userDao;
    }


    public MainStat mainStat(){return new MainStat(memDao.memCount(), userDao.userCount());}
}

