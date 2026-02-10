package com.app.haetssal_jangteo.dto;


import com.app.haetssal_jangteo.domain.ItemVO;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class ItemDTO {
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

    public ItemVO toVO(){
        return ItemVO.builder()
                .id(id)
                .itemMarketId(itemMarketId)
                .itemCategoryId(itemCategoryId)
                .itemName(itemName)
                .itemType(itemType)
                .itemStock(itemStock)
                .itemPrice(itemPrice)
                .itemDeliveryFee(itemDeliveryFee)
                .itemContent(itemContent)
                .itemState(itemState)
                .itemViewCount(itemViewCount)
                .createdDatetime(createdDatetime)
                .updatedDatetime(updatedDatetime)
                .build();
    }
}