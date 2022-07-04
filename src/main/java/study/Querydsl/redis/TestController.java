package study.Querydsl.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.Querydsl.entity.Member;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public MemberResponse test() {
        return testService.getMember(new TestRequest(3L, "aaa"));
    }
}
