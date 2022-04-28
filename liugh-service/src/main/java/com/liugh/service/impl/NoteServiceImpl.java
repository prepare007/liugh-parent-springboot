package com.liugh.service.impl;

import com.liugh.entity.Note;
import com.liugh.mapper.NoteMapper;
import com.liugh.service.INoteService;
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
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements INoteService {

}
