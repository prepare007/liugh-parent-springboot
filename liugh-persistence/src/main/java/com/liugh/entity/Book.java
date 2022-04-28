package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liugh123
 * @since 2022-04-26
 */
@TableName("book")
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;
    @TableField("book_name")
    private String bookName;
    private String state;
    private String cover;
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;
    private String publish;
    private String author;

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    @TableField("total_page")
    private Integer totalPage;
    @TableField("cur_page")
    private Integer curPage;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    protected Serializable pkVal() {
        return this.bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
        "bookId=" + bookId +
        ", bookName=" + bookName +
        ", state=" + state +
        ", cover=" + cover +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        ", publish=" + publish +
        ", author=" + author +
        ", totalPage=" + totalPage +
        "}";
    }
}
