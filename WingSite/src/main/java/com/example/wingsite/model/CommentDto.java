package com.example.wingsite.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 * packageName : com.example.wingsite.model
 * fileName : CommentDto
 * author : naraekwon
 * date : 2022/05/19
 * description : TB_COMMENT 댓글 테이블을 위한 모델 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/19         naraekwon          최초 생성
 */
@Getter
@Setter
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CommentDto {
    private int idx;// 댓글 멤버변수
    private int boardIdx; //
    private String content; //
    private String writer; //
    private String deleteYn; //
    private LocalDateTime insertDate; //
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

}
