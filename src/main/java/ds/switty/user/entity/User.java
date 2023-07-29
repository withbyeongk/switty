package ds.switty.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "SWT_USER")
@TableGenerator(name = "SWT_USER", table = "hibernate_sequences", pkColumnValue = "SWT_USER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "USER_ID", length = 20)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_USER")
    private Long userId;

    @Column(name = "USER_PW", length = 100)
    private String userPw;

    @Column(name = "USER_NM", length = 20)
    private String userNm;

    @Column(name = "USER_TYPE", length = 1)
    private char userType;

    @Column(name = "EMAIL", length = 30)
    private String email;

    //phone length 임의로 30 넣음
    @Column(name = "PHONE", length = 30)
    private String phone;

    @Column(name = "STATE", length = 1)
    private char state;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

}
