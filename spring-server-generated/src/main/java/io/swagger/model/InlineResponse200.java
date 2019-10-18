package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class InlineResponse200   {
  @JsonProperty("userExists")
  private Boolean userExists = null;

  public InlineResponse200 userExists(Boolean userExists) {
    this.userExists = userExists;
    return this;
  }

  /**
   * Get userExists
   * @return userExists
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isUserExists() {
    return userExists;
  }

  public void setUserExists(Boolean userExists) {
    this.userExists = userExists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.userExists, inlineResponse200.userExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    userExists: ").append(toIndentedString(userExists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
