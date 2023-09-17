package com.skywalker.tinybusgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.skywalker.tinybusgo.entity.Player;
import com.skywalker.tinybusgo.entity.dto.PlayerDTO;
import com.skywalker.tinybusgo.mapper.PlayerMapper;
import com.skywalker.tinybusgo.service.IPlayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author skywalker
 * @since 2023-09-16
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements IPlayerService {
    public IPage<PlayerDTO> getPlayerDTOsWithQueryWrapper(QueryWrapper<Player> queryWrapper, IPage<Player> page) {
//        IPage<GameResponseDTO> convertedPage = games.getRecords().stream()
//                .map(game -> {
//                    GameResponseDTO gameResponseDTO = new GameResponseDTO();
//                    gameResponseDTO.loadEntity(game);
//                    return gameResponseDTO;
//                })
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list -> new Page<GameResponseDTO>(games.getCurrent(), games.getSize(), games.getTotal()).setRecords(list)
//                ));
        return null;
    }
}
