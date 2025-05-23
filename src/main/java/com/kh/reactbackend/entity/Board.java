package com.kh.reactbackend.entity;

import com.kh.reactbackend.enums.CommonEnums;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) //JPA 스펙상 필수 + 외부 생성 방지
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNo;

    @Column(nullable = false, length = 30)
    private String boardTitle;

    @Column(nullable = false)
    @Lob
    private String boardContent;

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private CommonEnums.Status status;

    private LocalDateTime createDate;

    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Board_Writer")
    private Member member;


    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
        this.count = 0;
        if(this.status == null) {
            this.status = CommonEnums.Status.Y;
        }
    }
}
