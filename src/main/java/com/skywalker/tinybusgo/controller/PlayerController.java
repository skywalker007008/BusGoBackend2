package com.skywalker.tinybusgo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skywalker.tinybusgo.entity.Player;
import com.skywalker.tinybusgo.entity.dto.PlayerDTO;
import com.skywalker.tinybusgo.service.IPlayerService;
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
@RequestMapping("/player")
public class PlayerController {
    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);
    @Autowired
    private IPlayerService playerService;
    /**
     * Get the players from the request
     */
    @GetMapping("/page")
    public ResponseEntity<IPage<PlayerDTO>> getPlayersPage(@RequestBody Object query, @RequestParam Integer page, @RequestParam Integer size) {
        IPage<Player> playerPage = new Page<>(page, size);
        // TODO: from query to queryWrapper
        // QueryWrapper<Player> queryWrapper = new QueryWrapper<>();
        // queryWrapper.eq("black_player_id", id).or().eq("white_player_id", id);
        try {
            IPage<PlayerDTO> playerDTOIPage = playerService.getPlayerDTOsWithQueryWrapper(null, playerPage);
            return ResponseEntity.ok(playerDTOIPage);
        } catch (Exception e) {
            logger.error("Failed to get playerDTOIPage: {}", e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

}
