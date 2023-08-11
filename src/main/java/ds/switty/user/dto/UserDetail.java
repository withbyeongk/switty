package ds.switty.user.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDetail {

    private String id;
    private String userId;
    private String userName;
    private String password;
    private String checkPw;
    private String email;
    private String phone;
    private String state;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

}
