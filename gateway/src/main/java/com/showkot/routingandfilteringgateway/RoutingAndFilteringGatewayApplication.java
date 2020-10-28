package com.showkot.routingandfilteringgateway;

import com.showkot.routingandfilteringgateway.filters.pre.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
//import com.example.routingandfilteringgateway.filters.pre.SimpleFilter;
import org.springframework.web.bind.annotation.RestController;
//import sun.security.util.Resources;


@RestController
@EnableZuulProxy
@SpringBootApplication
public class RoutingAndFilteringGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
  }

  @Bean
  public SimpleFilter simpleFilter() {
    return new SimpleFilter();
  }

}

//@RestController
//@RequestMapping("/journals")
//class JournalGatewayRestController{
//
//  private RestTemplate restTemplate;
//
//  @RequestMapping(method = RequestMethod.GET, value = "/authors")
//  public Collection<String> getAuthorNames(){
//
//    ParameterizedTypeReference<Resources<Journal>> ptr =
//            new ParameterizedTypeReference<Resources<Journal>> (){};
//    ResponseEntity<Resources<Journal>> entity =  this.restTemplate.
//            exchange("http://localhost/8080/journals/names", HttpMethod.GET, null, ptr);
//
//    return entity
//            .getBody()
//            .getContents()
//            .stream()
//            .map(Journal::getJournalAuthor)
//            .collect(Collectors.toList());
//  }
//}

//class Journal{
//  private int journalId;
//  private String journalName;
//  private String journalAuthor;
//
//  public Journal(int journalId, String journalName, String journalAuthor) {
//    this.journalId = journalId;
//    this.journalName = journalName;
//    this.journalAuthor = journalAuthor;
//  }
//
//  public String getJournalAuthor() {
//    return journalAuthor;
//  }
//}

