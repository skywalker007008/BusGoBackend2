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
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String name;

    private String nickname;

    private String email;

    private String wechat;

    private String qq;

    private String phone;

    private String region;

    private String school;

    private Integer schoolId;

    private Byte entryYear;

    private String introduction;

    private String signature;

    private String avatar;

    private String certificate;

    private Double score;

    private Boolean isActivated;

    private Integer uniqueCode;

    private LocalDateTime lastLoginTime;

    private String lastLoginIp;

    private LocalDateTime registerTime;
}
