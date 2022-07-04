package study.Querydsl.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Tuple;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String name);
}
