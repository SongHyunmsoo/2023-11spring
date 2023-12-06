package models.member;

public class JoinService {

    private MemberDao memberDao;
    // Dao 의존성 주입
    private JoinValidator validator;
    // JoinValidator 의존성 주입

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        this.memberDao = memberDao;
        this.validator  = validator;
    }

    public void join(Member member){
        validator.validate(member);
        // 데이터 검증

        memberDao.register(member);
        // 데이터 추가
    }



}
