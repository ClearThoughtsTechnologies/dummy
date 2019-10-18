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
 * CandidateUnregistered
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class CandidateUnregistered   {
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

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("tpoid")
  private String tpoid = null;

  public CandidateUnregistered _id(String _id) {
    this._id = _id;
    return this;
  }

  /**
   * Get _id
   * @return _id
  **/
  @ApiModelProperty(example = "can123rd", value = "")
  
    public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public CandidateUnregistered email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "abhi@gmail.com", value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CandidateUnregistered phone(BigDecimal phone) {
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

  public CandidateUnregistered registrationuuid(String registrationuuid) {
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

  public CandidateUnregistered driveid(String driveid) {
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

  public CandidateUnregistered registered(String registered) {
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

  public CandidateUnregistered organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(example = "IIIT Bangalore", value = "")
  
    public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public CandidateUnregistered tpoid(String tpoid) {
    this.tpoid = tpoid;
    return this;
  }

  /**
   * Get tpoid
   * @return tpoid
  **/
  @ApiModelProperty(example = "tpo123rd", value = "")
  
    public String getTpoid() {
    return tpoid;
  }

  public void setTpoid(String tpoid) {
    this.tpoid = tpoid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateUnregistered candidateUnregistered = (CandidateUnregistered) o;
    return Objects.equals(this._id, candidateUnregistered._id) &&
        Objects.equals(this.email, candidateUnregistered.email) &&
        Objects.equals(this.phone, candidateUnregistered.phone) &&
        Objects.equals(this.registrationuuid, candidateUnregistered.registrationuuid) &&
        Objects.equals(this.driveid, candidateUnregistered.driveid) &&
        Objects.equals(this.registered, candidateUnregistered.registered) &&
        Objects.equals(this.organization, candidateUnregistered.organization) &&
        Objects.equals(this.tpoid, candidateUnregistered.tpoid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, email, phone, registrationuuid, driveid, registered, organization, tpoid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateUnregistered {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    registrationuuid: ").append(toIndentedString(registrationuuid)).append("\n");
    sb.append("    driveid: ").append(toIndentedString(driveid)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    tpoid: ").append(toIndentedString(tpoid)).append("\n");
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
