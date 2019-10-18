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
 * TPO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class TPO   {
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

  public TPO _id(String _id) {
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

  public TPO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "TPOName", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TPO email(String email) {
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

  public TPO phone(BigDecimal phone) {
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

  public TPO username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "tpouser", value = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public TPO password(String password) {
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

  public TPO addr1(String addr1) {
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

  public TPO addr2(String addr2) {
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

  public TPO city(String city) {
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

  public TPO state(String state) {
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

  public TPO pin(Integer pin) {
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

  public TPO registrationuuid(String registrationuuid) {
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

  public TPO driveid(String driveid) {
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

  public TPO registered(String registered) {
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
    TPO TPO = (TPO) o;
    return Objects.equals(this._id, TPO._id) &&
        Objects.equals(this.name, TPO.name) &&
        Objects.equals(this.email, TPO.email) &&
        Objects.equals(this.phone, TPO.phone) &&
        Objects.equals(this.username, TPO.username) &&
        Objects.equals(this.password, TPO.password) &&
        Objects.equals(this.addr1, TPO.addr1) &&
        Objects.equals(this.addr2, TPO.addr2) &&
        Objects.equals(this.city, TPO.city) &&
        Objects.equals(this.state, TPO.state) &&
        Objects.equals(this.pin, TPO.pin) &&
        Objects.equals(this.registrationuuid, TPO.registrationuuid) &&
        Objects.equals(this.driveid, TPO.driveid) &&
        Objects.equals(this.registered, TPO.registered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, name, email, phone, username, password, addr1, addr2, city, state, pin, registrationuuid, driveid, registered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TPO {\n");
    
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
