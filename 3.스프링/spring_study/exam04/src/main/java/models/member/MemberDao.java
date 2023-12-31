package models.member;

import config.ManualBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class MemberDao {
    private static Map<String, Member> members = new HashMap<>();

    public void register(Member member) {
        members.put(member.getUserId(),member);
    }
    public boolean exists(String userId) {
        // 유저 아이디가 존재하는지 체크 소스
        return members.containsKey(userId);

    }
    public List<Member> getList() {
    return new ArrayList<>(members.values());
    }




}
