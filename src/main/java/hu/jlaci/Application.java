package hu.jlaci;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.Map;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Value("${test.variable}")
    private String testVariable;

    private static Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("SpringBootEnvTest started");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @PostConstruct
    public void test() {
        log.info("Spring: Test Variable is: " + testVariable);
        Map<String, String> env = System.getenv();
        log.info("Java  : Test Variable is: " + env.get("test.variable"));
    }
}