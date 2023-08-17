package ds.switty.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@TableGenerator(
        name = "SWT_USER",
        table = "hibernate_sequences",
        pkColumnValue = "SWT_USER",
        allocationSize = 1)
@Table(name = "SWT_USER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "ID", length = 20)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_USER")
    private Long id;

    @Column(name = "USER_ID", length = 20, unique = true)
    private String userId;

    @Column(name = "USER_NAME", length = 20)
    private String userName;

    @Column(name = "PASSWORD", length = 100)
    private String password;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @Column(name = "PHONE", length = 30)
    private String phone;

    @Column(name = "STATE", length = 1)
    private char state;

    @Column(name = "ROLE", length = 30)
    private String role;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

}
