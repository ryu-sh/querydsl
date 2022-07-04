package study.Querydsl.redis;

import lombok.Getter;
import study.Querydsl.entity.Member;

@Getter
public class MemberResponse {
    private Long id;
    private String username;
    private int age;

    public MemberResponse(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.age = member.getAge();
    }

    public MemberResponse() {
    }
}
