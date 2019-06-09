package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQPartyRecipientOperatingCarrierRecipient;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQPartyRecipient
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQPartyRecipient   {
  @JsonProperty("OperatingCarrierRecipient")
  private FlightsItemAvailabilityRQPartyRecipientOperatingCarrierRecipient operatingCarrierRecipient = null;

  public FlightsItemAvailabilityRQPartyRecipient operatingCarrierRecipient(FlightsItemAvailabilityRQPartyRecipientOperatingCarrierRecipient operatingCarrierRecipient) {
    this.operatingCarrierRecipient = operatingCarrierRecipient;
    return this;
  }

  /**
   * Get operatingCarrierRecipient
   * @return operatingCarrierRecipient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQPartyRecipientOperatingCarrierRecipient getOperatingCarrierRecipient() {
    return operatingCarrierRecipient;
  }

  public void setOperatingCarrierRecipient(FlightsItemAvailabilityRQPartyRecipientOperatingCarrierRecipient operatingCarrierRecipient) {
    this.operatingCarrierRecipient = operatingCarrierRecipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQPartyRecipient flightsItemAvailabilityRQPartyRecipient = (FlightsItemAvailabilityRQPartyRecipient) o;
    return Objects.equals(this.operatingCarrierRecipient, flightsItemAvailabilityRQPartyRecipient.operatingCarrierRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingCarrierRecipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQPartyRecipient {\n");
    
    sb.append("    operatingCarrierRecipient: ").append(toIndentedString(operatingCarrierRecipient)).append("\n");
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

