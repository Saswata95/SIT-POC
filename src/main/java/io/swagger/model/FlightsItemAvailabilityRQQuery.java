package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQQueryOriginDestination;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQQuery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQQuery   {
  @JsonProperty("OriginDestination")
  private FlightsItemAvailabilityRQQueryOriginDestination originDestination = null;

  public FlightsItemAvailabilityRQQuery originDestination(FlightsItemAvailabilityRQQueryOriginDestination originDestination) {
    this.originDestination = originDestination;
    return this;
  }

  /**
   * Get originDestination
   * @return originDestination
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQQueryOriginDestination getOriginDestination() {
    return originDestination;
  }

  public void setOriginDestination(FlightsItemAvailabilityRQQueryOriginDestination originDestination) {
    this.originDestination = originDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQQuery flightsItemAvailabilityRQQuery = (FlightsItemAvailabilityRQQuery) o;
    return Objects.equals(this.originDestination, flightsItemAvailabilityRQQuery.originDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQQuery {\n");
    
    sb.append("    originDestination: ").append(toIndentedString(originDestination)).append("\n");
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

