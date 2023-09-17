package com.skywalker.tinybusgo.controller;

import com.skywalker.tinybusgo.service.IClubService;
import com.skywalker.tinybusgo.service.IGameService;
import com.skywalker.tinybusgo.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author skywalker
 * @since 2023-09-16
 */
@RestController
@RequestMapping("/club")
public class ClubController {
    @Autowired
    private IClubService clubService;
    @Autowired
    private IGameService gameService;
    @Autowired
    private IPlayerService playerService;
}
