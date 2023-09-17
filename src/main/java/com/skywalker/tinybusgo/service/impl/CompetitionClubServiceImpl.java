package com.skywalker.tinybusgo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skywalker.tinybusgo.entity.CompetitionClub;
import com.skywalker.tinybusgo.entity.dto.ClubDTO;
import com.skywalker.tinybusgo.mapper.CompetitionClubMapper;
import com.skywalker.tinybusgo.service.ICompetitionClubService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author skywalker
 * @since 2023-09-17
 */
@Service
public class CompetitionClubServiceImpl extends ServiceImpl<CompetitionClubMapper, CompetitionClub> implements ICompetitionClubService {
    public IPage<ClubDTO> getClubDTOsWithCompetitionIdAndRole(Integer competitionId, Integer role, IPage<CompetitionClub> page) {
        QueryWrapper<CompetitionClub> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("competition_id", competitionId).eq("role", role);
        IPage<CompetitionClub> competitionClubIPage = page(page, queryWrapper);
        // TODO: Transform DTO
        return null;
    }

    public IPage<ClubDTO> getClubByQuery(QueryWrapper<CompetitionClub> queryWrapper, IPage<CompetitionClub> page) {
        IPage<CompetitionClub> competitionClubPage = page(page, queryWrapper);
        // TODO: Transform DTO
        return null;
    }
}
