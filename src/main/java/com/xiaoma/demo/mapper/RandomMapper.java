package com.xiaoma.demo.mapper;

import com.xiaoma.demo.domain.Random;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RandomMapper {
    Random selectByPrimaryKey(Long id);
}