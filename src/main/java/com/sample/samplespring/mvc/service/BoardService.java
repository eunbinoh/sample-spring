package com.sample.samplespring.mvc.service;

import com.sample.samplespring.mvc.domain.Board;
import com.sample.samplespring.mvc.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 게시판 서비스
 * @Author eunb
 */
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository repository;

    /**
     * 게시판 목록
     * @return
     */
    public List<Board> getList(){
        return repository.getList();
    };

    /**
     * 게시판 상세정보
     * @param boardSeq
     * @return
     */
    public Board get(int boardSeq){
        return repository.get(boardSeq);
    };

    /**
     * 등록
     * @param board
     */
    public void save(Board board){
        repository.save(board);
    };

    /**
     * 업데이트
     * @param board
     */
    public void update(Board board){
        repository.update(board);
    };

    /**
     * 삭제
     * @param boardSeq
     */
    public void delete(int boardSeq){
        repository.delete(boardSeq);
    };

}
