package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQQueryOriginDestinationDeparture
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQQueryOriginDestinationDeparture   {
  @JsonProperty("AirportCode")
  private String airportCode = null;

  @JsonProperty("Date")
  private LocalDate date = null;

  public FlightsItemAvailabilityRQQueryOriginDestinationDeparture airportCode(String airportCode) {
    this.airportCode = airportCode;
    return this;
  }

  /**
   * Get airportCode
   * @return airportCode
  **/
  @ApiModelProperty(example = "LON", value = "")


  public String getAirportCode() {
    return airportCode;
  }

  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  public FlightsItemAvailabilityRQQueryOriginDestinationDeparture date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2019-03-10T00:00:00.000Z", value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQQueryOriginDestinationDeparture flightsItemAvailabilityRQQueryOriginDestinationDeparture = (FlightsItemAvailabilityRQQueryOriginDestinationDeparture) o;
    return Objects.equals(this.airportCode, flightsItemAvailabilityRQQueryOriginDestinationDeparture.airportCode) &&
        Objects.equals(this.date, flightsItemAvailabilityRQQueryOriginDestinationDeparture.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportCode, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQQueryOriginDestinationDeparture {\n");
    
    sb.append("    airportCode: ").append(toIndentedString(airportCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

