package config;

import lombok.Value;
import models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
@ComponentScan(value = "models",   // 자동 주입 범위 모델
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, // 기존에 있던 빈클래스를 필터를 사용해서 제외한다.
    classes = ManualBean.class)) // 새로만든 빈 클래스를 사용하겠다
    */
/*
 @ComponentScan(value="models",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
 classes = ManualBean.class))
*/
@ComponentScan(value = "models",excludeFilters = @ComponentScan.Filter(type =FilterType.ASPECTJ,
pattern = "models..*Dao")) // 하위패키지에존재하는 모든 Dao 제외
public class AppCtx {
/*
    @Bean
    public MemberDao memberDao() { // 이름이 동일한 경우 수동 등록 빈이 자동 등록 빈보다 우선순위가 높다.
    System.out.println("수동 등록빈!!");
  ㄴ  return new MemberDao();
    }*/
}
