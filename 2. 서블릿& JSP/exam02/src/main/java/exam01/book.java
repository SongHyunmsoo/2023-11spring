package exam01;

import lombok.*;

/*@Getter
@Setter
@ToString*/
/*@NoArgsConstructor (access = AccessLevel.PRIVATE)//기본 생성자
@AllArgsConstructor // 모든 멤버 변수 초기화 생성자*/
/*@RequiredArgsConstructor
@EqualsAndHashCode*/
@Data // @Gatter @Setter @ToString @EqualsAndHashCode
public class book {

    private final String Title;

    @NonNull

    private String Author;
    private String Publisher;
}
