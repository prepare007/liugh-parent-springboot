package com.liugh.service.impl;

import com.liugh.entity.Book;
import com.liugh.mapper.BookMapper;
import com.liugh.service.IBookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2022-04-19
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Override
    public void updateState(String state, Integer bookId) {
       Book book= this.baseMapper.selectById(bookId);
       book.setState(state);
       this.baseMapper.updateById(book);
    }
}
