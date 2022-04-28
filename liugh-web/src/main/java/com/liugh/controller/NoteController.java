package com.liugh.controller;


import com.liugh.annotation.Pass;
import com.liugh.config.ResponseHelper;
import com.liugh.config.ResponseModel;
import com.liugh.entity.Book;
import com.liugh.entity.Note;
import com.liugh.service.INoteService;
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
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private INoteService iNoteService;
    @PostMapping("/create")
    @Pass
    public ResponseModel create(@RequestBody Note note){
        iNoteService.insert(note);
        return  ResponseHelper.succeed();
    }
}

