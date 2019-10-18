package io.swagger.api;

import io.swagger.model.Candidate;
import io.swagger.model.CandidateUnregistered;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
@Controller
public class CandidateApiController implements CandidateApi {

    private static final Logger log = LoggerFactory.getLogger(CandidateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CandidateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Candidate> candidateCandidateIdGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Candidate>(objectMapper.readValue("{\n  \"cvid\" : \"abhijeet_cv_12345\",\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"runningyear\" : 4,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"organization\" : \"IIIT Bangalore\",\n  \"name\" : \"Abhijeet Bannerjee\",\n  \"markspercentage\" : 84,\n  \"tpoid\" : \"tpo123rd\",\n  \"_id\" : \"can123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"abhi@gmail.com\",\n  \"username\" : \"canuser\"\n}", Candidate.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Candidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Candidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Candidate> candidateGet(@ApiParam(value = "page number") @Valid @RequestParam(value = "pageNum", required = false) Integer pageNum,@ApiParam(value = "No of elements in page") @Valid @RequestParam(value = "noOfElements", required = false) Integer noOfElements) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Candidate>(objectMapper.readValue("{\n  \"cvid\" : \"abhijeet_cv_12345\",\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"runningyear\" : 4,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"organization\" : \"IIIT Bangalore\",\n  \"name\" : \"Abhijeet Bannerjee\",\n  \"markspercentage\" : 84,\n  \"tpoid\" : \"tpo123rd\",\n  \"_id\" : \"can123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"abhi@gmail.com\",\n  \"username\" : \"canuser\"\n}", Candidate.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Candidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Candidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Candidate> candidatePost(@ApiParam(value = ""  )  @Valid @RequestBody Candidate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Candidate>(objectMapper.readValue("{\n  \"cvid\" : \"abhijeet_cv_12345\",\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"runningyear\" : 4,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"organization\" : \"IIIT Bangalore\",\n  \"name\" : \"Abhijeet Bannerjee\",\n  \"markspercentage\" : 84,\n  \"tpoid\" : \"tpo123rd\",\n  \"_id\" : \"can123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"abhi@gmail.com\",\n  \"username\" : \"canuser\"\n}", Candidate.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Candidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Candidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Candidate> candidatePut(@ApiParam(value = ""  )  @Valid @RequestBody Candidate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Candidate>(objectMapper.readValue("{\n  \"cvid\" : \"abhijeet_cv_12345\",\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"runningyear\" : 4,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"organization\" : \"IIIT Bangalore\",\n  \"name\" : \"Abhijeet Bannerjee\",\n  \"markspercentage\" : 84,\n  \"tpoid\" : \"tpo123rd\",\n  \"_id\" : \"can123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"abhi@gmail.com\",\n  \"username\" : \"canuser\"\n}", Candidate.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Candidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Candidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CandidateUnregistered> candidateRegistrationUUIDGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CandidateUnregistered>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"driveid\" : \"driveid123\",\n  \"phone\" : 9980053231,\n  \"organization\" : \"IIIT Bangalore\",\n  \"registered\" : \"false\",\n  \"tpoid\" : \"tpo123rd\",\n  \"_id\" : \"can123rd\",\n  \"email\" : \"abhi@gmail.com\"\n}", CandidateUnregistered.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CandidateUnregistered>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CandidateUnregistered>(HttpStatus.NOT_IMPLEMENTED);
    }

}
