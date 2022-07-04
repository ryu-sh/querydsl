package study.Querydsl.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import study.Querydsl.entity.Member;
import study.Querydsl.entity.MemberRepository;

@Service
@RequiredArgsConstructor
public class TestService {
    private final MemberRepository memberRepository;

    @Cacheable(key = "#dto.id", value = "member")
    public MemberResponse getMember(TestRequest dto) {
        return new MemberResponse(memberRepository.findById(dto.getId()).get());
    }
}
