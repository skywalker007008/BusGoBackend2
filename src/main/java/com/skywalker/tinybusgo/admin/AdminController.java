package com.skywalker.tinybusgo.admin;

import com.skywalker.tinybusgo.entity.Competition;
import com.skywalker.tinybusgo.service.IClubService;
import com.skywalker.tinybusgo.service.ICompetitionService;
import com.skywalker.tinybusgo.service.IGameService;
import com.skywalker.tinybusgo.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Skywalker
 * Date: 2023-09-16
 * File: AdminController
 * Description: The controller that admin operations are handled.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private ICompetitionService competitionService;
    @Autowired
    private IPlayerService playerService;
    @Autowired
    private IClubService adminService;
    @Autowired
    private IGameService gameService;

    /**
     * TODO: Function 1: Create a competition.
     */

    @PostMapping("/competition/create")
    public ResponseEntity<Integer> createCompetition(@RequestBody Competition competition) {
        return null;
    }

    /**
     * TODO: Function 2: Import a competition information from a file.
     */

    @PostMapping("/competition/import")
    public ResponseEntity<Integer> importCompetition(@RequestBody Competition competition) {
        return null;
    }
}
