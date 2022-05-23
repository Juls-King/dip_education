package com.uniongraphix.daegu.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private String title;
    private String content;
    private String imgUrl;

}
