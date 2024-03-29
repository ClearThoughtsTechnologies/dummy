/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Candidate;
import io.swagger.model.CandidateUnregistered;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
@Api(value = "candidate", description = "the candidate API")
public interface CandidateApi {

    @ApiOperation(value = "", nickname = "candidateCandidateIdGet", notes = "Return specified Candidate object", response = Candidate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The candidate detail", response = Candidate.class),
        @ApiResponse(code = 404, message = "") })
    @RequestMapping(value = "/candidate/CandidateId",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Candidate> candidateCandidateIdGet();


    @ApiOperation(value = "", nickname = "candidateGet", notes = "Get all Candidate listing", response = Candidate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of candidate object", response = Candidate.class) })
    @RequestMapping(value = "/candidate",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Candidate> candidateGet(@ApiParam(value = "page number") @Valid @RequestParam(value = "pageNum", required = false) Integer pageNum,@ApiParam(value = "No of elements in page") @Valid @RequestParam(value = "noOfElements", required = false) Integer noOfElements);


    @ApiOperation(value = "", nickname = "candidatePost", notes = "Register a new Candidate", response = Candidate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The newly registered candidate detail", response = Candidate.class) })
    @RequestMapping(value = "/candidate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Candidate> candidatePost(@ApiParam(value = ""  )  @Valid @RequestBody Candidate body);


    @ApiOperation(value = "", nickname = "candidatePut", notes = "Modify a candidate", response = Candidate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The candidate detail", response = Candidate.class) })
    @RequestMapping(value = "/candidate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Candidate> candidatePut(@ApiParam(value = ""  )  @Valid @RequestBody Candidate body);


    @ApiOperation(value = "", nickname = "candidateRegistrationUUIDGet", notes = "This url will be used to fetch candidate basic information. While candidate open the mailed link and trying to register himself. Frontend will fetch stored Candidate info by this URL. registrationUUID will be a variable and dynamic one and that is sent by mail.", response = CandidateUnregistered.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The unregistered TPO detail", response = CandidateUnregistered.class),
        @ApiResponse(code = 404, message = "") })
    @RequestMapping(value = "/candidate/registrationUUID",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CandidateUnregistered> candidateRegistrationUUIDGet();

}
