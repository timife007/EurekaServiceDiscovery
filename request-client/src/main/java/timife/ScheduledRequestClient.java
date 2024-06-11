package timife;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class ScheduledRequestClient {

    @Autowired
    private RestTemplate restTemplate;

    @Scheduled(cron = "0/5 * * * * *")
    public void scheduleApiRequest(){
        var item = restTemplate.getForObject("http://RESPONSE-CLIENT/client", String.class);
        log.error("SCHEDULE RESPONSE: " + item);
    }
}
