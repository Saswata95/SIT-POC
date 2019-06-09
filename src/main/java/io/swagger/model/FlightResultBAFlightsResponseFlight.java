package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightResultBAFlightsResponseSector;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightResultBAFlightsResponseFlight
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightResultBAFlightsResponseFlight   {
  @JsonProperty("Sector")
  private FlightResultBAFlightsResponseSector sector = null;

  public FlightResultBAFlightsResponseFlight sector(FlightResultBAFlightsResponseSector sector) {
    this.sector = sector;
    return this;
  }

  /**
   * Get sector
   * @return sector
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightResultBAFlightsResponseSector getSector() {
    return sector;
  }

  public void setSector(FlightResultBAFlightsResponseSector sector) {
    this.sector = sector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightResultBAFlightsResponseFlight flightResultBAFlightsResponseFlight = (FlightResultBAFlightsResponseFlight) o;
    return Objects.equals(this.sector, flightResultBAFlightsResponseFlight.sector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightResultBAFlightsResponseFlight {\n");
    
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
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

