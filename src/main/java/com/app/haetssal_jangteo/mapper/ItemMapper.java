package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface ItemMapper {
    public Optional<ItemDTO> selectById(Long id);
}

