package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQ;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItem   {
  @JsonProperty("AvailabilityRQ")
  private FlightsItemAvailabilityRQ availabilityRQ = null;

  public FlightsItem availabilityRQ(FlightsItemAvailabilityRQ availabilityRQ) {
    this.availabilityRQ = availabilityRQ;
    return this;
  }

  /**
   * Get availabilityRQ
   * @return availabilityRQ
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQ getAvailabilityRQ() {
    return availabilityRQ;
  }

  public void setAvailabilityRQ(FlightsItemAvailabilityRQ availabilityRQ) {
    this.availabilityRQ = availabilityRQ;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItem flightsItem = (FlightsItem) o;
    return Objects.equals(this.availabilityRQ, flightsItem.availabilityRQ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityRQ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItem {\n");
    
    sb.append("    availabilityRQ: ").append(toIndentedString(availabilityRQ)).append("\n");
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

