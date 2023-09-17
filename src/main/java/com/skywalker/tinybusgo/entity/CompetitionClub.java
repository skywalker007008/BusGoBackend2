package com.skywalker.tinybusgo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author skywalker
 * @since 2023-09-17
 */
@Getter
@Setter
@TableName("competition_club")
public class CompetitionClub implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int ROLE_JOINER = 0;
    public static final int ROLE_CREATOR = 1;

    private Integer competitionId;

    private Integer clubId;

    private Integer role;
}
