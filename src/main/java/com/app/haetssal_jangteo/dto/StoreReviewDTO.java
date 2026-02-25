package com.app.haetssal_jangteo.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@ToString
@NoArgsConstructor
public class StoreReviewDTO {
    private Long storeId;
    private List<ReviewDTO> storeReviews;
}
