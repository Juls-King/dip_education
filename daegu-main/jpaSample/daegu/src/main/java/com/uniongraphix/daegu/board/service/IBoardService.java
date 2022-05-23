package com.uniongraphix.daegu.board.service;

import com.uniongraphix.daegu.board.dto.BoardDto;
import com.uniongraphix.daegu.board.model.Board;

import java.util.List;
import java.util.Optional;

public interface IBoardService {

    Board addBoard(BoardDto boardDto);
    List<Board> findAll();
    Optional<Board> findById(Long id);

}
