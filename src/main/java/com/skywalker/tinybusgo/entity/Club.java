package com.skywalker.tinybusgo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String description;

    private String region;

    private String avatar;

    private String email;

    private Integer adminId;

    private String adminName;

    private Integer uniqueCode;

    private Boolean isActivated;

    private LocalDateTime registerTime;
}
