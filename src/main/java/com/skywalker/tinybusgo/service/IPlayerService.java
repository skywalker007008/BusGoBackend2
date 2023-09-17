package com.skywalker.tinybusgo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.skywalker.tinybusgo.entity.Player;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skywalker.tinybusgo.entity.dto.PlayerDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author skywalker
 * @since 2023-09-16
 */
public interface IPlayerService extends IService<Player> {

    /**
     * Service 1: Get player DTOs with QueryWrapper.
     */

    IPage<PlayerDTO> getPlayerDTOsWithQueryWrapper(QueryWrapper<Player> queryWrapper, IPage<Player> page);
}
