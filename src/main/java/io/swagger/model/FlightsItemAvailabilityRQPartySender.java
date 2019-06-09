package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQPartySenderTravelAgencySender;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQPartySender
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQPartySender   {
  @JsonProperty("TravelAgencySender")
  private FlightsItemAvailabilityRQPartySenderTravelAgencySender travelAgencySender = null;

  public FlightsItemAvailabilityRQPartySender travelAgencySender(FlightsItemAvailabilityRQPartySenderTravelAgencySender travelAgencySender) {
    this.travelAgencySender = travelAgencySender;
    return this;
  }

  /**
   * Get travelAgencySender
   * @return travelAgencySender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQPartySenderTravelAgencySender getTravelAgencySender() {
    return travelAgencySender;
  }

  public void setTravelAgencySender(FlightsItemAvailabilityRQPartySenderTravelAgencySender travelAgencySender) {
    this.travelAgencySender = travelAgencySender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQPartySender flightsItemAvailabilityRQPartySender = (FlightsItemAvailabilityRQPartySender) o;
    return Objects.equals(this.travelAgencySender, flightsItemAvailabilityRQPartySender.travelAgencySender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(travelAgencySender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQPartySender {\n");
    
    sb.append("    travelAgencySender: ").append(toIndentedString(travelAgencySender)).append("\n");
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

