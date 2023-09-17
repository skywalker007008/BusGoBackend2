package com.skywalker.tinybusgo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import io.swagger.v3.oas.annotations.

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
@TableName("club_player")
//@ApiModel(value = "ClubPlayer对象", description = "")
public class ClubPlayer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer clubId;

    private Integer playerId;

    private Byte playerRole;
}
