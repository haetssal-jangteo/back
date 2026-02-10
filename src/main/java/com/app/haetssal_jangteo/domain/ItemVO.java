package com.app.haetssal_jangteo.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class ItemVO {
    private Long id;
    private Long itemMarketId;
    private Long itemCategoryId;
    private String itemName;
    private String itemType;
    private int itemStock;
    private int itemPrice;
    private int itemDeliveryFee;
    private String itemContent;
    private String itemState;
    private int itemViewCount;
    private String createdDatetime;
    private String updatedDatetime;
}