package com.skywalker.tinybusgo.entity.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author skywalker
 * @since 2023-09-16
 */
@Getter
@Setter
public class GameDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer blackPlayerId;

    private String blackPlayerName;

    private Integer blackClubId;

    private Integer whitePlayerId;

    private String whitePlayerName;

    private Integer whiteClubId;

    private Byte winner;

    private Double winningPoints;

    private Byte platform;

    private Integer competitionId;

    private Integer competitionRound;

    private Integer competitionGroup;

    private Integer competitionSeat;

    private Boolean isRanking;

    private Double rankingScore;

    private Boolean isClubPrivate;

    private Boolean isPlayerPrivate;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private LocalDateTime startTime;

    private LocalDateTime importTime;

    private LocalDateTime playTime;

    private Integer status;
}
