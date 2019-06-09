package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightResultBA;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightResult   {
  @JsonProperty("BA")
  private FlightResultBA BA = null;

  public FlightResult BA(FlightResultBA BA) {
    this.BA = BA;
    return this;
  }

  /**
   * Get BA
   * @return BA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightResultBA getBA() {
    return BA;
  }

  public void setBA(FlightResultBA BA) {
    this.BA = BA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightResult flightResult = (FlightResult) o;
    return Objects.equals(this.BA, flightResult.BA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightResult {\n");
    
    sb.append("    BA: ").append(toIndentedString(BA)).append("\n");
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

