package com.example.demo.board.service;

import com.example.demo.board.dto.BoardDto;

import java.util.List;

public interface BoardService {

    boolean addBoard(BoardDto boardDto);
    List<BoardDto> findAll();
    BoardDto findById(Long id);

}