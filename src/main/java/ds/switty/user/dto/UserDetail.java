package ds.switty.user.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDetail {

    private String userId;
    private String userNm;
    private String userPw;
    private String checkPw;
    private String userType;
    private String email;
    private String phone;
    private String state;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

}
