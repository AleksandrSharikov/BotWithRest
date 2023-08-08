package com.bot.restbot.controller;

import com.bot.restbot.dto.MainStat;
import com.bot.restbot.service.StatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/stat")
public class StatController {

    public final StatService statService;

    public StatController(StatService statService) {
        this.statService = statService;
    }

    @GetMapping("/main")
    public MainStat returnMainStat(){return statService.mainStat();}
     @GetMapping("/test")
    public String test(){return "Works";}
}
