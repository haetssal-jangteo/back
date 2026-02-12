package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.domain.ItemVO;
import com.app.haetssal_jangteo.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface AdminMapper {
    // id로 상품들 검색
    public Optional<ItemVO> selectById(Long id);

    // 상품 수정
    public void update(ItemDTO itemDTO);
}

