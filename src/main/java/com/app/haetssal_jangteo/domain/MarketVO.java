package com.app.haetssal_jangteo.domain;

import com.app.haetssal_jangteo.common.enumeration.Status;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class MarketVO {
    private Long id;
    private String marketRegion;
    private String marketName;
    private String marketLocation;
    private Status marketStatus;
    private String createdDatetime;
    private String updatedDatetime;
}