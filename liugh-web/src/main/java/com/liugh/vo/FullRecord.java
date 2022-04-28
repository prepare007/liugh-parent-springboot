package com.liugh.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.util.Date;

/**
 * @author yangbo
 * @createTime 2022年04月27日 19:07:00
 */
@Data
public class FullRecord {
    private Integer bookId;
    private Integer recordId;
    private String note;
    private Date startTime;
    private String state;
    private Date endTime;
    private Integer startPage;
    private Integer endPage;
}
