package com.xiaoma.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xiaoma.demo.domain.Random;
import com.xiaoma.demo.mapper.RandomMapper;
import com.xiaoma.demo.service.RandomService;
@Service
public class RandomServiceImpl implements RandomService{

    @Resource
    private RandomMapper randomMapper;

    @Override
    public Random selectByPrimaryKey(Long id) {
        return randomMapper.selectByPrimaryKey(id);
    }

}
