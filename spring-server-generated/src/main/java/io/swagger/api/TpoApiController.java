package io.swagger.api;

import io.swagger.model.TPO;
import io.swagger.model.TPOUnregistered;
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
public class TpoApiController implements TpoApi {

    private static final Logger log = LoggerFactory.getLogger(TpoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TpoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TPO> tpoGet(@ApiParam(value = "page number") @Valid @RequestParam(value = "pageNum", required = false) Integer pageNum,@ApiParam(value = "No of elements in page") @Valid @RequestParam(value = "noOfElements", required = false) Integer noOfElements) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TPO>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"name\" : \"TPOName\",\n  \"_id\" : \"tpo123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"tpo@gmail.com\",\n  \"username\" : \"tpouser\"\n}", TPO.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TPO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TPO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TPO> tpoPost(@ApiParam(value = ""  )  @Valid @RequestBody TPO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TPO>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"name\" : \"TPOName\",\n  \"_id\" : \"tpo123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"tpo@gmail.com\",\n  \"username\" : \"tpouser\"\n}", TPO.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TPO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TPO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TPO> tpoPut(@ApiParam(value = ""  )  @Valid @RequestBody TPO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TPO>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"name\" : \"TPOName\",\n  \"_id\" : \"tpo123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"tpo@gmail.com\",\n  \"username\" : \"tpouser\"\n}", TPO.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TPO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TPO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TPOUnregistered> tpoRegistrationUUIDGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TPOUnregistered>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"driveid\" : \"driveid123\",\n  \"phone\" : 9980053231,\n  \"registered\" : \"false\",\n  \"_id\" : \"tpo123rd\",\n  \"email\" : \"tpo@gmail.com\"\n}", TPOUnregistered.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TPOUnregistered>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TPOUnregistered>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TPO> tpoTpoIdGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TPO>(objectMapper.readValue("{\n  \"registrationuuid\" : \"aedre123wers\",\n  \"addr2\" : \"Kalyan Nagar\",\n  \"addr1\" : \"2nd Cross\",\n  \"city\" : \"Bangalore\",\n  \"registered\" : \"false\",\n  \"password\" : \"abc123\",\n  \"driveid\" : \"driveid123\",\n  \"pin\" : 560032,\n  \"phone\" : 9980053231,\n  \"name\" : \"TPOName\",\n  \"_id\" : \"tpo123rd\",\n  \"state\" : \"Karnataka\",\n  \"email\" : \"tpo@gmail.com\",\n  \"username\" : \"tpouser\"\n}", TPO.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TPO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TPO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
