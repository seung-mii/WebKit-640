package org.comstudy.boardweb.persistence;

import org.comstudy.boardweb.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {

}
