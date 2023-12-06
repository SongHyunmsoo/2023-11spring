package models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListService {

    private  MemberDao memberDao;

    private DateTimeFormatter formatter;
    @Autowired
    public void setFormatter(DateTimeFormatter formatter){
        this.formatter = formatter;
    }
    @Autowired

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void print() {
        List<Member> members = memberDao.getList();
        for (Member member : members) {
            String regDistr = formatter.format(member.getRegDt());
            member.setRegDtstr(regDistr);
            System.out.println(member);
        }
    }
}
