//package ds.switty.user.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@TableGenerator(name = "SWT_ROLE_USER", table = "hibernate_sequences", pkColumnValue = "SWT_ROLE_USER")
//@Table(name = "SWT_ROLE_USER")
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Builder
//@AllArgsConstructor
//public class RoleUser {
//
//    @Id
//    @Column(name = "ID", length = 20)
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_ROLE_USER")
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_NAME", nullable = false)
//    private Role role;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_NAME", nullable = false)
//    private Member member;
//}
