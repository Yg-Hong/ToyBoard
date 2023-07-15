package com.practice.board.dto;

import com.practice.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private int hits;
    private char deleteYn;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public BoardResponseDto(Board entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.writer = entity.getWriter();
        this.hits = entity.getHits();
        this.deleteYn = entity.getDeleteYn();
        this.createdDate = entity.getCreatedDate();
        this.modifiedDate = entity.getModifiedDate();
    }
}
