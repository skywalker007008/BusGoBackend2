package com.skywalker.tinybusgo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skywalker.tinybusgo.entity.CompetitionClub;
import com.skywalker.tinybusgo.entity.dto.ClubDTO;
import com.skywalker.tinybusgo.service.ICompetitionClubService;
import com.skywalker.tinybusgo.service.ICompetitionService;
import com.skywalker.tinybusgo.service.IGameService;
import com.skywalker.tinybusgo.service.IPlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author skywalker
 * @since 2023-09-16
 */
@RestController
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private ICompetitionService competitionService;
    @Autowired
    private IGameService gameService;
    @Autowired
    private IPlayerService playerService;
    @Autowired
    private ICompetitionClubService competitionClubService;

    private static final Logger logger = LoggerFactory.getLogger(CompetitionController.class);

    @GetMapping("/{id}/club/page")
    public ResponseEntity<IPage<ClubDTO>> getClubsPage(@PathVariable Integer id, @RequestParam Integer page, @RequestParam Integer size) {
        IPage<CompetitionClub> competitionClubPage = new Page<>(page, size);
        QueryWrapper<CompetitionClub> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("competition_id", id).eq("role", CompetitionClub.ROLE_JOINER);
        try {
            IPage<ClubDTO> clubDTOIPage = competitionClubService.getClubByQuery(queryWrapper, competitionClubPage);
            return ResponseEntity.ok(clubDTOIPage);
        } catch (Exception e) {
            logger.error("Failed to get clubDTOIPage: {}", e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }
}
