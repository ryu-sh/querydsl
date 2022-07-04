package study.Querydsl.redis;

import lombok.Getter;

@Getter
public class TestRequest {
    private Long id;
    private String name;

    public TestRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
