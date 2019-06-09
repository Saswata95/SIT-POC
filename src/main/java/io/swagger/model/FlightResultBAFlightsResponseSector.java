package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightResultBAFlightsResponseSector
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightResultBAFlightsResponseSector   {
  @JsonProperty("DepartureAirport")
  private String departureAirport = null;

  @JsonProperty("ArrivalStatus")
  private String arrivalStatus = null;

  @JsonProperty("ArrivalAirport")
  private String arrivalAirport = null;

  @JsonProperty("DepartureTerminal")
  private Integer departureTerminal = null;

  @JsonProperty("ArrivalTerminal")
  private Integer arrivalTerminal = null;

  @JsonProperty("ScheduledDepartureDateTime")
  private OffsetDateTime scheduledDepartureDateTime = null;

  @JsonProperty("MatchesRequest")
  private Boolean matchesRequest = null;

  @JsonProperty("DepartureStatus")
  private String departureStatus = null;

  public FlightResultBAFlightsResponseSector departureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
    return this;
  }

  /**
   * Get departureAirport
   * @return departureAirport
  **/
  @ApiModelProperty(example = "LHR", value = "")


  public String getDepartureAirport() {
    return departureAirport;
  }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  public FlightResultBAFlightsResponseSector arrivalStatus(String arrivalStatus) {
    this.arrivalStatus = arrivalStatus;
    return this;
  }

  /**
   * Get arrivalStatus
   * @return arrivalStatus
  **/
  @ApiModelProperty(example = "Estimated", value = "")


  public String getArrivalStatus() {
    return arrivalStatus;
  }

  public void setArrivalStatus(String arrivalStatus) {
    this.arrivalStatus = arrivalStatus;
  }

  public FlightResultBAFlightsResponseSector arrivalAirport(String arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
    return this;
  }

  /**
   * Get arrivalAirport
   * @return arrivalAirport
  **/
  @ApiModelProperty(example = "JFK", value = "")


  public String getArrivalAirport() {
    return arrivalAirport;
  }

  public void setArrivalAirport(String arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
  }

  public FlightResultBAFlightsResponseSector departureTerminal(Integer departureTerminal) {
    this.departureTerminal = departureTerminal;
    return this;
  }

  /**
   * Get departureTerminal
   * @return departureTerminal
  **/
  @ApiModelProperty(example = "5", value = "")


  public Integer getDepartureTerminal() {
    return departureTerminal;
  }

  public void setDepartureTerminal(Integer departureTerminal) {
    this.departureTerminal = departureTerminal;
  }

  public FlightResultBAFlightsResponseSector arrivalTerminal(Integer arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
    return this;
  }

  /**
   * Get arrivalTerminal
   * @return arrivalTerminal
  **/
  @ApiModelProperty(example = "7", value = "")


  public Integer getArrivalTerminal() {
    return arrivalTerminal;
  }

  public void setArrivalTerminal(Integer arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
  }

  public FlightResultBAFlightsResponseSector scheduledDepartureDateTime(OffsetDateTime scheduledDepartureDateTime) {
    this.scheduledDepartureDateTime = scheduledDepartureDateTime;
    return this;
  }

  /**
   * Get scheduledDepartureDateTime
   * @return scheduledDepartureDateTime
  **/
  @ApiModelProperty(example = "2019-05-13T08:25:00.000Z", value = "")

  @Valid

  public OffsetDateTime getScheduledDepartureDateTime() {
    return scheduledDepartureDateTime;
  }

  public void setScheduledDepartureDateTime(OffsetDateTime scheduledDepartureDateTime) {
    this.scheduledDepartureDateTime = scheduledDepartureDateTime;
  }

  public FlightResultBAFlightsResponseSector matchesRequest(Boolean matchesRequest) {
    this.matchesRequest = matchesRequest;
    return this;
  }

  /**
   * Get matchesRequest
   * @return matchesRequest
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isMatchesRequest() {
    return matchesRequest;
  }

  public void setMatchesRequest(Boolean matchesRequest) {
    this.matchesRequest = matchesRequest;
  }

  public FlightResultBAFlightsResponseSector departureStatus(String departureStatus) {
    this.departureStatus = departureStatus;
    return this;
  }

  /**
   * Get departureStatus
   * @return departureStatus
  **/
  @ApiModelProperty(example = "Estimated", value = "")


  public String getDepartureStatus() {
    return departureStatus;
  }

  public void setDepartureStatus(String departureStatus) {
    this.departureStatus = departureStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightResultBAFlightsResponseSector flightResultBAFlightsResponseSector = (FlightResultBAFlightsResponseSector) o;
    return Objects.equals(this.departureAirport, flightResultBAFlightsResponseSector.departureAirport) &&
        Objects.equals(this.arrivalStatus, flightResultBAFlightsResponseSector.arrivalStatus) &&
        Objects.equals(this.arrivalAirport, flightResultBAFlightsResponseSector.arrivalAirport) &&
        Objects.equals(this.departureTerminal, flightResultBAFlightsResponseSector.departureTerminal) &&
        Objects.equals(this.arrivalTerminal, flightResultBAFlightsResponseSector.arrivalTerminal) &&
        Objects.equals(this.scheduledDepartureDateTime, flightResultBAFlightsResponseSector.scheduledDepartureDateTime) &&
        Objects.equals(this.matchesRequest, flightResultBAFlightsResponseSector.matchesRequest) &&
        Objects.equals(this.departureStatus, flightResultBAFlightsResponseSector.departureStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departureAirport, arrivalStatus, arrivalAirport, departureTerminal, arrivalTerminal, scheduledDepartureDateTime, matchesRequest, departureStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightResultBAFlightsResponseSector {\n");
    
    sb.append("    departureAirport: ").append(toIndentedString(departureAirport)).append("\n");
    sb.append("    arrivalStatus: ").append(toIndentedString(arrivalStatus)).append("\n");
    sb.append("    arrivalAirport: ").append(toIndentedString(arrivalAirport)).append("\n");
    sb.append("    departureTerminal: ").append(toIndentedString(departureTerminal)).append("\n");
    sb.append("    arrivalTerminal: ").append(toIndentedString(arrivalTerminal)).append("\n");
    sb.append("    scheduledDepartureDateTime: ").append(toIndentedString(scheduledDepartureDateTime)).append("\n");
    sb.append("    matchesRequest: ").append(toIndentedString(matchesRequest)).append("\n");
    sb.append("    departureStatus: ").append(toIndentedString(departureStatus)).append("\n");
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

