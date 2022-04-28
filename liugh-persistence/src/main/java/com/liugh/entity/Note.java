package com.liugh.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
@TableName("note")
public class Note extends Model<Note> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "note_id", type = IdType.AUTO)
    private Integer noteId;
    private String note;
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableField("book_id")
    private Integer bookId;


    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    protected Serializable pkVal() {
        return this.noteId;
    }

    @Override
    public String toString() {
        return "Note{" +
        "noteId=" + noteId +
        ", note=" + note +
        ", updateTime=" + updateTime +
        ", bookId=" + bookId +
        "}";
    }
}
