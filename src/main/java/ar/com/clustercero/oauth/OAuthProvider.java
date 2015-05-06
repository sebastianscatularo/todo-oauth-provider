package ar.com.clustercero.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Sebastian Scatularo <sebastianscatularo@gmail.com>
 */
@SpringBootApplication
public class OAuthProvider {
    public static void main(String... args) {
        SpringApplication.run(OAuthProvider.class, args);
    }
}
