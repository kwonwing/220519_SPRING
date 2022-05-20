package com.example.wingsite.controller;

import com.example.wingsite.model.CommentDto;
import com.example.wingsite.service.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName : com.example.wingsite.controller
 * fileName : CommentApiController
 * author : naraekwon
 * date : 2022/05/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/20         naraekwon          최초 생성
 */
//RestApi @RestController (json, text 로 프론트엔드로 전송, vue , react)
//    비교) @Controller : html, jsp , 타임리프 파일로 바로 출력
//    @RequestMapping("/api") : http://localhost:8000/api/board 의 /api 자동으로 설정 해줌
@RestController
@RequestMapping("/api")
public class CommentApiController {

    @Autowired
    CommentServiceImpl commentService;//클래스 가져와서 객체 정의 (null 상태에서  @Autowired 달고 스프링객체로 !)

//    @GetMapping("/board/comment/{idx}")
////    @PathVariable("idx")Long idx : ("idx") 생략가능
//    public CommentDto openCommentWrite(@PathVariable("idx")Long idx){
////        상세목록 보기 서비스를 호출 (select : 1건)
//        CommentDto detail = commentService.getCommentDetail(idx);
//        return detail;
//    }

//  @PostMapping : insert할때 사용하는 어노테이션
//    @RequestBody : 입력테스트시 json형태로 데이터를 전송할수있음
    @PostMapping("/board/comments")
    public List<CommentDto> registerBoard(@RequestBody CommentDto commentDto){

//            insert문 실행: 댓글 추가
            boolean isRegistered = commentService.registerComment(commentDto);

//        insert완료후 데이터 확인을 위한 조회(select)
        return commentService.getCommentList(commentDto);
    };

//    @PutMapping(value="/board/delete/{idx}")
//    public List<CommentDto> deleteComment(@PathVariable("idx") Long idx){
////        삭제 서비스 호출
//        boolean isDeleted = commentService.deleteComment(idx);
////        삭제되었는지 전체 조회
//        return commentService.getCommentAllList();
//    }
//
////    페이징 처리를 위한 게시물 검색 메뉴1
//    @GetMapping("/board/list/cur-page-no/{currentPageNo}/records-per-page/{recordsPerPage}")
//    public List<CommentDto> openCommentList(CommentDto params){
//
//        return commentService.getCommentList(params);
//    };
//
////    페이징 처리를 위한 게시물 검색 메뉴2
//    @GetMapping("/board/list/cpage/{currentPageNo}/rpage/{recordsPerPage}/sword/{searchKeyword}/stype/{searchType}")
//    public List<CommentDto> openCommentList2(CommentDto params){
//
//        return commentService.getCommentList(params);
//    };

}

