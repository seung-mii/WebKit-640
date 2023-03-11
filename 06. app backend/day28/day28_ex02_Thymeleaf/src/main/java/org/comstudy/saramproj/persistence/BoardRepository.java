package org.comstudy.saramproj.persistence;

import java.util.List;

import org.comstudy.saramproj.domain.Board;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends CrudRepository<Board, Long> {
	List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
	
	// nativeQuery=true 속성 필수.
	@Query(value="SELECT * FROM BOARD WHERE TITLE LIKE '%'||:keyword||'%' ORDER BY SEQ DESC", 
			nativeQuery=true)
	List<Board> getBoardList(@Param("keyword") String searchKeyword);
}