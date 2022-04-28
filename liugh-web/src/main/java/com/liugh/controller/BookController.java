package com.liugh.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.liugh.annotation.CurrentUser;
import com.liugh.annotation.Pass;
import com.liugh.config.ResponseHelper;
import com.liugh.config.ResponseModel;
import com.liugh.entity.Book;
import com.liugh.entity.Notice;
import com.liugh.entity.User;
import com.liugh.service.IBookService;
import com.liugh.service.IUserService;
import com.liugh.util.ComUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/list")
    @Pass
    public ResponseModel<Page<Book>> findInfoList( @RequestParam(value = "bookName", defaultValue = "",required = false) String bookName,
                                                   @RequestParam(name = "pageIndex", defaultValue = "1", required = false) Integer pageIndex,
                                                    @RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize) throws Exception{

        return ResponseHelper.succeed(bookService.selectPage(new Page<>(pageIndex, pageSize),ComUtil.isEmpty(bookName)?new EntityWrapper<Book>(): new EntityWrapper<Book>().like("book_name", bookName).orderBy("update_time",false)));
    }
    @PostMapping("/create")
    @Pass
    public  ResponseModel create(@RequestBody Book book){
        bookService.insert(book);
        return  ResponseHelper.succeed();
    }
    @PostMapping("/update")
    @Pass
    public  ResponseModel update(@RequestBody Book book){
        bookService.updateById(book);
        return  ResponseHelper.succeed();
    }
    @GetMapping("/delete")
    @Pass
    public  ResponseModel delete(@RequestParam Long id){
        bookService.deleteById(id);
        return  ResponseHelper.succeed();
    }
}

