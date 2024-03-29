package pchlystek.aidevs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestAiDevs2Application {

    public static void main(String[] args) {
        SpringApplication.from(AiDevs2Application::main).with(TestAiDevs2Application.class).run(args);
    }

}
