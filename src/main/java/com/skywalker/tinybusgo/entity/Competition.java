package com.skywalker.tinybusgo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

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
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String description;

    private String avatar;

    private Byte memberType;

    private Byte ruleType;

    private Integer roundNum;

    private Integer groupNum;

    private Boolean isPublic;

    private Boolean isClubPublic;

    private Byte creatorType;

    private Integer creatorId;

    private Byte status;

    private Integer nowRound;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
