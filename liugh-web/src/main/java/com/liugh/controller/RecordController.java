package com.liugh.controller;


import com.liugh.annotation.Pass;
import com.liugh.config.ResponseHelper;
import com.liugh.config.ResponseModel;
import com.liugh.entity.Book;
import com.liugh.entity.Note;
import com.liugh.entity.Record;
import com.liugh.service.IBookService;
import com.liugh.service.INoteService;
import com.liugh.service.IRecordService;
import com.liugh.vo.FullRecord;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private IRecordService iRecordService;
    @Autowired
    private INoteService iNoteService;
    @Autowired
    private IBookService iBookService;
    @PostMapping("/create")
    @Pass
    public ResponseModel create(@RequestBody FullRecord fullRecordrecord){
        Record record = new Record();
        BeanUtils.copyProperties(fullRecordrecord,record);
        iRecordService.insert(record);
        Note note = new Note();
        BeanUtils.copyProperties(fullRecordrecord,note);
        iNoteService.insert(note);
        Book book =iBookService.selectById(fullRecordrecord.getBookId());
        book.setState(fullRecordrecord.getState());
        book.setCurPage(fullRecordrecord.getEndPage());
        iBookService.updateById(book);
        return  ResponseHelper.succeed();
    }
}

