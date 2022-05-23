package com.uniongraphix.daegu.board.repository;

import com.uniongraphix.daegu.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends  JpaRepository<Board, Long>{
}
