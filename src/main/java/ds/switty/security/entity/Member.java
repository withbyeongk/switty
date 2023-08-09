package ds.switty.security.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@TableGenerator(name = "SWT_MEMBER", table = "hibernate_sequences", pkColumnValue = "SWT_MEMBER")
@Table(name = "SWT_MEMBER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
public class Member {

    @Id
    @Column(name = "ID", length = 20)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_MEMBER")
    private Long id;

    @Column(name = "MEMBER_NAME", length = 20)
    private String memberName;

    @Column(name = "PASSWORD", length = 100)
    private String password;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @Column(name = "PHONE", length = 30)
    private String phone;

    //삭제 상태
    @Column(name = "STATE", length = 1)
    private char state;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

}
