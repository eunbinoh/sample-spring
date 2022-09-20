package com.sample.samplespring.mvc.repository;

import com.sample.samplespring.mvc.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 게시판 레포지토리
 * @Author eunb
 */
@Repository
public interface BoardRepository {

    List<Board> getList();

    Board get(int boardSeq);

    void save(Board board);

    void update(Board board);

    void delete(int boardSeq);

}
