package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@Slf4j
@SpringBootTest
public class ItemMapperTests {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void testSelectById() {
        Optional<ItemDTO> foundReview = itemMapper.selectById(1L);

        log.info("{}", foundReview.orElse(null));
    }
}

