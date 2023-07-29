package ds.switty.user.domain;

import lombok.*;

import java.sql.Timestamp;


@NoArgsConstructor
@Setter
@Getter
public class User {
    private String userId;
    private String userNm;
    private String userPw;
    private String checkPw;
    private String userType;
    private String email;
    private String phone;
    private String state;
    private Timestamp updatedAt;
    private Timestamp createdAt;
}
