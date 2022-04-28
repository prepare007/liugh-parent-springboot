package com.liugh.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
@TableName("record")
public class Record extends Model<Record> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;
    @TableField("book_id")
    private Integer bookId;
    @TableField("start_time")

    private Date startTime;
    @TableField("end_time")

    private Date endTime;
    @TableField("start_page")
    private Integer startPage;
    @TableField("end_page")
    private Integer endPage;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    @Override
    protected Serializable pkVal() {
        return this.recordId;
    }

    @Override
    public String toString() {
        return "Record{" +
        "bookId=" + bookId +
        ", recordId=" + recordId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", startPage=" + startPage +
        ", endPage=" + endPage +
        "}";
    }
}
