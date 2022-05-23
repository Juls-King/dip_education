package com.uniongraphix.daegu.board.service;

import com.uniongraphix.daegu.board.dto.BoardDto;
import com.uniongraphix.daegu.board.model.Board;
import com.uniongraphix.daegu.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImple implements IBoardService{

    private final BoardRepository boardRepository;

    @Override
    public Board addBoard(BoardDto boardDto) {
        return boardRepository.save(
                Board.builder()
                        .title(boardDto.getTitle())
                        .content(boardDto.getContent())
                        .imgUrl(boardDto.getImgUrl())
                        .build()
        );
    }

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Optional<Board> findById(Long id) {
        return boardRepository.findById(id);
    }


}
