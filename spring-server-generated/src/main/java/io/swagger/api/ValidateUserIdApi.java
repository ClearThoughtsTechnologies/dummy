/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
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
@Api(value = "validateUserId", description = "the validateUserId API")
public interface ValidateUserIdApi {

    @ApiOperation(value = "", nickname = "validateUserIdGet", notes = "This URL will use a bloom filter (Use google Guava bloom filter) and check if the user id already taken. While a company registration is taking place, this url will be used to check for user id", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "user exists in system", response = InlineResponse200.class),
        @ApiResponse(code = 404, message = "user does not exists in system", response = InlineResponse404.class) })
    @RequestMapping(value = "/validateUserId",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> validateUserIdGet(@ApiParam(value = "user provided id") @Valid @RequestParam(value = "userid", required = false) String userid);

}