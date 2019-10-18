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
 * Candidate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class Candidate   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private BigDecimal phone = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("addr1")
  private String addr1 = null;

  @JsonProperty("addr2")
  private String addr2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("pin")
  private Integer pin = null;

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

  @JsonProperty("runningyear")
  private Integer runningyear = null;

  @JsonProperty("markspercentage")
  private Integer markspercentage = null;

  @JsonProperty("cvid")
  private String cvid = null;

  public Candidate _id(String _id) {
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

  public Candidate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Abhijeet Bannerjee", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Candidate email(String email) {
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

  public Candidate phone(BigDecimal phone) {
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

  public Candidate username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "canuser", value = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Candidate password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "abc123", value = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Candidate addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

  /**
   * Get addr1
   * @return addr1
  **/
  @ApiModelProperty(example = "2nd Cross", value = "")
  
    public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public Candidate addr2(String addr2) {
    this.addr2 = addr2;
    return this;
  }

  /**
   * Get addr2
   * @return addr2
  **/
  @ApiModelProperty(example = "Kalyan Nagar", value = "")
  
    public String getAddr2() {
    return addr2;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }

  public Candidate city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Bangalore", value = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Candidate state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "Karnataka", value = "")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Candidate pin(Integer pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
  **/
  @ApiModelProperty(example = "560032", value = "")
  
    public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  public Candidate registrationuuid(String registrationuuid) {
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

  public Candidate driveid(String driveid) {
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

  public Candidate registered(String registered) {
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

  public Candidate organization(String organization) {
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

  public Candidate tpoid(String tpoid) {
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

  public Candidate runningyear(Integer runningyear) {
    this.runningyear = runningyear;
    return this;
  }

  /**
   * Get runningyear
   * @return runningyear
  **/
  @ApiModelProperty(example = "4", value = "")
  
    public Integer getRunningyear() {
    return runningyear;
  }

  public void setRunningyear(Integer runningyear) {
    this.runningyear = runningyear;
  }

  public Candidate markspercentage(Integer markspercentage) {
    this.markspercentage = markspercentage;
    return this;
  }

  /**
   * Get markspercentage
   * @return markspercentage
  **/
  @ApiModelProperty(example = "84", value = "")
  
    public Integer getMarkspercentage() {
    return markspercentage;
  }

  public void setMarkspercentage(Integer markspercentage) {
    this.markspercentage = markspercentage;
  }

  public Candidate cvid(String cvid) {
    this.cvid = cvid;
    return this;
  }

  /**
   * Get cvid
   * @return cvid
  **/
  @ApiModelProperty(example = "abhijeet_cv_12345", value = "")
  
    public String getCvid() {
    return cvid;
  }

  public void setCvid(String cvid) {
    this.cvid = cvid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candidate candidate = (Candidate) o;
    return Objects.equals(this._id, candidate._id) &&
        Objects.equals(this.name, candidate.name) &&
        Objects.equals(this.email, candidate.email) &&
        Objects.equals(this.phone, candidate.phone) &&
        Objects.equals(this.username, candidate.username) &&
        Objects.equals(this.password, candidate.password) &&
        Objects.equals(this.addr1, candidate.addr1) &&
        Objects.equals(this.addr2, candidate.addr2) &&
        Objects.equals(this.city, candidate.city) &&
        Objects.equals(this.state, candidate.state) &&
        Objects.equals(this.pin, candidate.pin) &&
        Objects.equals(this.registrationuuid, candidate.registrationuuid) &&
        Objects.equals(this.driveid, candidate.driveid) &&
        Objects.equals(this.registered, candidate.registered) &&
        Objects.equals(this.organization, candidate.organization) &&
        Objects.equals(this.tpoid, candidate.tpoid) &&
        Objects.equals(this.runningyear, candidate.runningyear) &&
        Objects.equals(this.markspercentage, candidate.markspercentage) &&
        Objects.equals(this.cvid, candidate.cvid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, name, email, phone, username, password, addr1, addr2, city, state, pin, registrationuuid, driveid, registered, organization, tpoid, runningyear, markspercentage, cvid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidate {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    registrationuuid: ").append(toIndentedString(registrationuuid)).append("\n");
    sb.append("    driveid: ").append(toIndentedString(driveid)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    tpoid: ").append(toIndentedString(tpoid)).append("\n");
    sb.append("    runningyear: ").append(toIndentedString(runningyear)).append("\n");
    sb.append("    markspercentage: ").append(toIndentedString(markspercentage)).append("\n");
    sb.append("    cvid: ").append(toIndentedString(cvid)).append("\n");
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
