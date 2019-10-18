package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TPOUnregistered
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class TPOUnregistered   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private BigDecimal phone = null;

  @JsonProperty("registrationuuid")
  private String registrationuuid = null;

  @JsonProperty("driveid")
  private String driveid = null;

  @JsonProperty("registered")
  private String registered = null;

  public TPOUnregistered _id(String _id) {
    this._id = _id;
    return this;
  }

  /**
   * Get _id
   * @return _id
  **/
  @ApiModelProperty(example = "tpo123rd", value = "")
  
    public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public TPOUnregistered email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "tpo@gmail.com", value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TPOUnregistered phone(BigDecimal phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "9980053231", value = "")
  
    @Valid
    public BigDecimal getPhone() {
    return phone;
  }

  public void setPhone(BigDecimal phone) {
    this.phone = phone;
  }

  public TPOUnregistered registrationuuid(String registrationuuid) {
    this.registrationuuid = registrationuuid;
    return this;
  }

  /**
   * Get registrationuuid
   * @return registrationuuid
  **/
  @ApiModelProperty(example = "aedre123wers", value = "")
  
    public String getRegistrationuuid() {
    return registrationuuid;
  }

  public void setRegistrationuuid(String registrationuuid) {
    this.registrationuuid = registrationuuid;
  }

  public TPOUnregistered driveid(String driveid) {
    this.driveid = driveid;
    return this;
  }

  /**
   * Get driveid
   * @return driveid
  **/
  @ApiModelProperty(example = "driveid123", value = "")
  
    public String getDriveid() {
    return driveid;
  }

  public void setDriveid(String driveid) {
    this.driveid = driveid;
  }

  public TPOUnregistered registered(String registered) {
    this.registered = registered;
    return this;
  }

  /**
   * Get registered
   * @return registered
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public String getRegistered() {
    return registered;
  }

  public void setRegistered(String registered) {
    this.registered = registered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TPOUnregistered tpOUnregistered = (TPOUnregistered) o;
    return Objects.equals(this._id, tpOUnregistered._id) &&
        Objects.equals(this.email, tpOUnregistered.email) &&
        Objects.equals(this.phone, tpOUnregistered.phone) &&
        Objects.equals(this.registrationuuid, tpOUnregistered.registrationuuid) &&
        Objects.equals(this.driveid, tpOUnregistered.driveid) &&
        Objects.equals(this.registered, tpOUnregistered.registered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, email, phone, registrationuuid, driveid, registered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TPOUnregistered {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    registrationuuid: ").append(toIndentedString(registrationuuid)).append("\n");
    sb.append("    driveid: ").append(toIndentedString(driveid)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
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
