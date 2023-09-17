package com.skywalker.tinybusgo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.skywalker.tinybusgo.entity.CompetitionClub;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skywalker.tinybusgo.entity.dto.ClubDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author skywalker
 * @since 2023-09-17
 */
public interface ICompetitionClubService extends IService<CompetitionClub> {
    IPage<ClubDTO> getClubDTOsWithCompetitionIdAndRole(Integer competitionId, Integer role, IPage<CompetitionClub> page);

    IPage<ClubDTO> getClubByQuery(QueryWrapper<CompetitionClub> queryWrapper, IPage<CompetitionClub> page);
}
