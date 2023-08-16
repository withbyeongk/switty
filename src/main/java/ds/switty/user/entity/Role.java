//package ds.switty.user.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name = "SWT_ROLE")
//@TableGenerator(name = "SWT_ROLE", table = "hibernate_sequences", pkColumnValue = "SWT_ROLE")
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//@Builder
//public class Role {
//
//    @Id
//    @Column(name = "ID", length = 20)
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_ROLE")
//    private Long id;
//
//    @Column(name = "ROLE_NAME", length = 20)
//    private String roleName;
//
//    @Column(name = "DESCRIPTION", length = 64)
//    private String description;
//}
