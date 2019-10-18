package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Recruiter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Drive
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-17T12:40:01.504Z[GMT]")
public class Drive   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("companyid")
  private String companyid = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("addr1")
  private String addr1 = null;

  @JsonProperty("addr2")
  private String addr2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("PIN")
  private Integer PIN = null;

  @JsonProperty("recruiters")
  @Valid
  private List<Recruiter> recruiters = null;

  @JsonProperty("organization")
  private String organization = null;

  public Drive _id(String _id) {
    this._id = _id;
    return this;
  }

  /**
   * Get _id
   * @return _id
  **/
  @ApiModelProperty(example = "driveid123", value = "")
  
    public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public Drive companyid(String companyid) {
    this.companyid = companyid;
    return this;
  }

  /**
   * Get companyid
   * @return companyid
  **/
  @ApiModelProperty(example = "abcd1234hsc", value = "")
  
    public String getCompanyid() {
    return companyid;
  }

  public void setCompanyid(String companyid) {
    this.companyid = companyid;
  }

  public Drive date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "01-07-2020", value = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Drive time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "10:00AM", value = "")
  
    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Drive addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

  /**
   * Get addr1
   * @return addr1
  **/
  @ApiModelProperty(example = "1st cross", value = "")
  
    public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public Drive addr2(String addr2) {
    this.addr2 = addr2;
    return this;
  }

  /**
   * Get addr2
   * @return addr2
  **/
  @ApiModelProperty(example = "manyata", value = "")
  
    public String getAddr2() {
    return addr2;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }

  public Drive city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "bangalore", value = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Drive state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "karnataka", value = "")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Drive PIN(Integer PIN) {
    this.PIN = PIN;
    return this;
  }

  /**
   * Get PIN
   * @return PIN
  **/
  @ApiModelProperty(example = "560045", value = "")
  
    public Integer getPIN() {
    return PIN;
  }

  public void setPIN(Integer PIN) {
    this.PIN = PIN;
  }

  public Drive recruiters(List<Recruiter> recruiters) {
    this.recruiters = recruiters;
    return this;
  }

  public Drive addRecruitersItem(Recruiter recruitersItem) {
    if (this.recruiters == null) {
      this.recruiters = new ArrayList<Recruiter>();
    }
    this.recruiters.add(recruitersItem);
    return this;
  }

  /**
   * Get recruiters
   * @return recruiters
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Recruiter> getRecruiters() {
    return recruiters;
  }

  public void setRecruiters(List<Recruiter> recruiters) {
    this.recruiters = recruiters;
  }

  public Drive organization(String organization) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drive drive = (Drive) o;
    return Objects.equals(this._id, drive._id) &&
        Objects.equals(this.companyid, drive.companyid) &&
        Objects.equals(this.date, drive.date) &&
        Objects.equals(this.time, drive.time) &&
        Objects.equals(this.addr1, drive.addr1) &&
        Objects.equals(this.addr2, drive.addr2) &&
        Objects.equals(this.city, drive.city) &&
        Objects.equals(this.state, drive.state) &&
        Objects.equals(this.PIN, drive.PIN) &&
        Objects.equals(this.recruiters, drive.recruiters) &&
        Objects.equals(this.organization, drive.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, companyid, date, time, addr1, addr2, city, state, PIN, recruiters, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drive {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    PIN: ").append(toIndentedString(PIN)).append("\n");
    sb.append("    recruiters: ").append(toIndentedString(recruiters)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
