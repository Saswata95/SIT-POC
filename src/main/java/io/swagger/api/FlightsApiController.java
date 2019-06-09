package io.swagger.api;

import io.swagger.model.FlightResult;
import io.swagger.model.FlightsItem;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

@Controller
public class FlightsApiController implements FlightsApi {

    private static final Logger log = LoggerFactory.getLogger(FlightsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
       
       return builder.build();
    }

    @org.springframework.beans.factory.annotation.Autowired
    public FlightsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    
    @Autowired
    private RestTemplate restTemplate;
    

    public ResponseEntity<FlightResult> searchFlights(@ApiParam(value = "Flights to find"  )  @Valid @RequestBody FlightsItem flightItem) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        
        HttpHeaders headers = new HttpHeaders();
        
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", "Bearer"+token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<FlightsItem> entity = new HttpEntity<FlightsItem>(flightItem, headers);
        
        //System.out.println(flightItem.toString());
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	
                return new ResponseEntity<FlightResult>(restTemplate.postForObject("http://52.172.214.238/flights", entity, FlightResult.class), HttpStatus.ACCEPTED);
            } catch (RestClientException e) {
                log.error("Couldn't Fetch Result", e);
                return new ResponseEntity<FlightResult>(HttpStatus.UNAUTHORIZED);
            }
        }

        return new ResponseEntity<FlightResult>(HttpStatus.NOT_IMPLEMENTED);
    }

}
