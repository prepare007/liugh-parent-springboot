package com.liugh.service;

import com.liugh.entity.Book;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
public interface IBookService extends IService<Book> {

    void updateState(String state, Integer bookId);
}
