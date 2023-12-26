package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.choongang.commons.MemberType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name="USERS",
        indexes = @Index(name="idx_member_createdAt", columnList = "createdAt DESC"))
@EntityListeners(AuditingEntityListener.class)
public class Member extends Base{
    @Id @GeneratedValue
    private Long seq;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(name = "uwerPw",nullable = false)
    private String password;  // varchar2

    @Enumerated(EnumType.STRING)
    private MemberType type;

    //@Lob
   /* @Transient
    private String introduction;  //CLOB
/


    @CreationTimestamp  // INSERT 인설트 SQL 실행시
    private LocalDateTime createdAt;

    @UpdateTimestamp    // UPDATE 업데이트 SQL 실행시
    private LocalDateTime modifiedAt;
*/
    //@Temporal(TemporalType.DATE) // 날짜
    //@Temporal(TemporalType.TIME) // 시간
    //@Temporal(TemporalType.TIMESTAMP) // 날짜 + 시간
    //public Date dt;


}