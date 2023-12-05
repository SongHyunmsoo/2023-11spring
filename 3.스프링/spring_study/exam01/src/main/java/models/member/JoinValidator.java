        package models.member;

import commons.validators.Validator;

public class JoinValidator implements Validator<Member> {

    public void validate(Member member) {
        // 전달받은 객체인 Member member를 검증
        /* 필수 항목 검증(아이디, 비밀번호, 비밀번호 확인, 회원명 */
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String confirmPw = member.getConfirmPw();
        String userNm = member.getUserNm();

        if(userId == null || userId.isBlank()) {

        }

    }
}