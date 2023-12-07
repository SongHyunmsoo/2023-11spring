package models.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberDao memberDao;

    private final JoinValidator validator;



    public void join(Member member) { // 빈의 이름 joinService
        // 데이터 검증
        validator.validate(member);

        // 데이터 추가
        memberDao.register(member);
    }
}