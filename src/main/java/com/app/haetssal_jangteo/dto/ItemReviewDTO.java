package com.app.haetssal_jangteo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter
@ToString
@NoArgsConstructor
public class ItemReviewDTO {
    private Long itemId;
    private List<ReviewDTO> itemReviews;
}
