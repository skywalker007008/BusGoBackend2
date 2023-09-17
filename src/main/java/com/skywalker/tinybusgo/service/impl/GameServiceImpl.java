package com.skywalker.tinybusgo.service.impl;

import com.skywalker.tinybusgo.entity.Game;
import com.skywalker.tinybusgo.mapper.GameMapper;
import com.skywalker.tinybusgo.service.IGameService;
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
public class GameServiceImpl extends ServiceImpl<GameMapper, Game> implements IGameService {

}
