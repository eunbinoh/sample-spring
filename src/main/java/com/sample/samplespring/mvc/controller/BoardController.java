package com.sample.samplespring.mvc.controller;

import com.sample.samplespring.mvc.domain.Board;
import com.sample.samplespring.mvc.repository.BoardRepository;
import com.sample.samplespring.mvc.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 게시판 컨트롤러
 * @Author eunb
 */
@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    /**
     * 게시판 목록
     * @return
     */
    @GetMapping
    public List<Board> getList(){
        return service.getList();
    };

    /**
     * 게시판 상세정보
     * @param boardSeq
     * @return
     */
    @GetMapping("/{boardSeq}")
    public Board get(@PathVariable int boardSeq){
        return service.get(boardSeq);
    };

    /**
     * 등록 / 수정 처리
     * @param board
     */
    @GetMapping("/save")
    public void save(Board board){
        service.save(board);
    };

    /**
     * 삭제
     * @param boardSeq
     */
    @GetMapping("/delete/{boardSeq}")
    public void delete(@PathVariable int boardSeq){
        service.delete(boardSeq);
    };
}
