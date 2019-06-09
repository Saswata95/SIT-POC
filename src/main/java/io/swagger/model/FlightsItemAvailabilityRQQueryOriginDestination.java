package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQQueryOriginDestinationArrival;
import io.swagger.model.FlightsItemAvailabilityRQQueryOriginDestinationDeparture;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQQueryOriginDestination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQQueryOriginDestination   {
  @JsonProperty("Departure")
  private FlightsItemAvailabilityRQQueryOriginDestinationDeparture departure = null;

  @JsonProperty("Arrival")
  private FlightsItemAvailabilityRQQueryOriginDestinationArrival arrival = null;

  public FlightsItemAvailabilityRQQueryOriginDestination departure(FlightsItemAvailabilityRQQueryOriginDestinationDeparture departure) {
    this.departure = departure;
    return this;
  }

  /**
   * Get departure
   * @return departure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQQueryOriginDestinationDeparture getDeparture() {
    return departure;
  }

  public void setDeparture(FlightsItemAvailabilityRQQueryOriginDestinationDeparture departure) {
    this.departure = departure;
  }

  public FlightsItemAvailabilityRQQueryOriginDestination arrival(FlightsItemAvailabilityRQQueryOriginDestinationArrival arrival) {
    this.arrival = arrival;
    return this;
  }

  /**
   * Get arrival
   * @return arrival
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQQueryOriginDestinationArrival getArrival() {
    return arrival;
  }

  public void setArrival(FlightsItemAvailabilityRQQueryOriginDestinationArrival arrival) {
    this.arrival = arrival;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQQueryOriginDestination flightsItemAvailabilityRQQueryOriginDestination = (FlightsItemAvailabilityRQQueryOriginDestination) o;
    return Objects.equals(this.departure, flightsItemAvailabilityRQQueryOriginDestination.departure) &&
        Objects.equals(this.arrival, flightsItemAvailabilityRQQueryOriginDestination.arrival);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departure, arrival);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQQueryOriginDestination {\n");
    
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
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

