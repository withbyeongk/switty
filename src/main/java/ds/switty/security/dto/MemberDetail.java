package ds.switty.security.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MemberDetail {

    private String id;
    private String memberName;
    private String password;
    private String checkPw;
    private String email;
    private String phone;
    private String state;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

}
