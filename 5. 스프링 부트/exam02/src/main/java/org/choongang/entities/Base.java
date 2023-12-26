package org.choongang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Base {
    @CreatedDate
    @Column(updatable = false) // 추가 0 , 수정 x  //추가될때 기록 수정될때 기록 x
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false) // 추가 x, 수정 0 // 수정될때 기록 추가할때 기록 x
    private LocalDateTime modifiedAt;
}
