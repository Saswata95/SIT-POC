package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightResultBAFlightsResponseFlight;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightResultBAFlightsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightResultBAFlightsResponse   {
  @JsonProperty("DataLastUpdated")
  private OffsetDateTime dataLastUpdated = null;

  @JsonProperty("Flight")
  @Valid
  private List<FlightResultBAFlightsResponseFlight> flight = null;

  public FlightResultBAFlightsResponse dataLastUpdated(OffsetDateTime dataLastUpdated) {
    this.dataLastUpdated = dataLastUpdated;
    return this;
  }

  /**
   * Get dataLastUpdated
   * @return dataLastUpdated
  **/
  @ApiModelProperty(example = "2019-05-13T05:33:00.000Z", value = "")

  @Valid

  public OffsetDateTime getDataLastUpdated() {
    return dataLastUpdated;
  }

  public void setDataLastUpdated(OffsetDateTime dataLastUpdated) {
    this.dataLastUpdated = dataLastUpdated;
  }

  public FlightResultBAFlightsResponse flight(List<FlightResultBAFlightsResponseFlight> flight) {
    this.flight = flight;
    return this;
  }

  public FlightResultBAFlightsResponse addFlightItem(FlightResultBAFlightsResponseFlight flightItem) {
    if (this.flight == null) {
      this.flight = new ArrayList<FlightResultBAFlightsResponseFlight>();
    }
    this.flight.add(flightItem);
    return this;
  }

  /**
   * Get flight
   * @return flight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FlightResultBAFlightsResponseFlight> getFlight() {
    return flight;
  }

  public void setFlight(List<FlightResultBAFlightsResponseFlight> flight) {
    this.flight = flight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightResultBAFlightsResponse flightResultBAFlightsResponse = (FlightResultBAFlightsResponse) o;
    return Objects.equals(this.dataLastUpdated, flightResultBAFlightsResponse.dataLastUpdated) &&
        Objects.equals(this.flight, flightResultBAFlightsResponse.flight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataLastUpdated, flight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightResultBAFlightsResponse {\n");
    
    sb.append("    dataLastUpdated: ").append(toIndentedString(dataLastUpdated)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
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

