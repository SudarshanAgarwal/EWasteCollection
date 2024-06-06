/*package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.com.ewaste.Ewaste.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.com.ewaste.Ewaste.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.com.ewaste.Ewaste.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.com.ewaste.Ewaste.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.com.ewaste.Ewaste.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class ApplicationConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login" , "/signup")
                .permitAll()
                .antMatchers("/account/**").hasAuthority("USER")
                .and()
                .formLogin(form -> form
                        .defaultSuccessUrl("/index")
                        .loginPage("/login")
                        .failureUrl("/signup").permitAll());
    }
    //@Override
    //public void configure(WebSecurity web){
   //     web.ignoring().antMatchers("/resources/**","/static/**");
   // }
}*/