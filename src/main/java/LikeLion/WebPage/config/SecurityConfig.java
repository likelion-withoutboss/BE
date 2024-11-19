package LikeLion.WebPage.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/swagger-ui/**", // Swagger UI
                                "/v3/api-docs/**", // OpenAPI 문서 경로
                                "/swagger-resources/**", // Swagger 리소스
                                "/webjars/**" // Webjars 관련 리소스
                        ).permitAll() // 인증 없이 접근 허용
                        .anyRequest().authenticated() // 나머지는 인증 필요
                )
                .formLogin(form -> form
                        .loginPage("/login") // 커스텀 로그인 페이지 경로
                        .permitAll() // 로그인 페이지는 누구나 접근 가능
                )
                .csrf(csrf -> csrf.disable()); // 필요 시 CSRF 비활성화

        return http.build();

    }
}
