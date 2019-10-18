package io.swagger.api;

import io.swagger.model.Company;
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
public class CompanyApiController implements CompanyApi {

    private static final Logger log = LoggerFactory.getLogger(CompanyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CompanyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Company> companyCompanyIdGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Company>(objectMapper.readValue("{\n  \"password\" : \"clear123\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"name\" : \"ClearThought\",\n  \"_id\" : \"abcd1234hsc\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"clearthoughtstechnologies@gmail.com\",\n  \"username\" : \"clearthoughts\"\n}", Company.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Company>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Company> companyGet(@ApiParam(value = "page number") @Valid @RequestParam(value = "pageNum", required = false) Integer pageNum,@ApiParam(value = "No of elements in page") @Valid @RequestParam(value = "noOfElements", required = false) Integer noOfElements) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Company>(objectMapper.readValue("{\n  \"password\" : \"clear123\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"name\" : \"ClearThought\",\n  \"_id\" : \"abcd1234hsc\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"clearthoughtstechnologies@gmail.com\",\n  \"username\" : \"clearthoughts\"\n}", Company.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Company>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Company> companyPost(@ApiParam(value = ""  )  @Valid @RequestBody Company body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Company>(objectMapper.readValue("{\n  \"password\" : \"clear123\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"name\" : \"ClearThought\",\n  \"_id\" : \"abcd1234hsc\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"clearthoughtstechnologies@gmail.com\",\n  \"username\" : \"clearthoughts\"\n}", Company.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Company>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Company> companyPut(@ApiParam(value = ""  )  @Valid @RequestBody Company body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Company>(objectMapper.readValue("{\n  \"password\" : \"clear123\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"name\" : \"ClearThought\",\n  \"_id\" : \"abcd1234hsc\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"clearthoughtstechnologies@gmail.com\",\n  \"username\" : \"clearthoughts\"\n}", Company.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Company>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
    }

}
