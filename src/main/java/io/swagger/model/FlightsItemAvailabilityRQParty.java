package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQPartyRecipient;
import io.swagger.model.FlightsItemAvailabilityRQPartySender;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQParty
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQParty   {
  @JsonProperty("Sender")
  private FlightsItemAvailabilityRQPartySender sender = null;

  @JsonProperty("Recipient")
  private FlightsItemAvailabilityRQPartyRecipient recipient = null;

  public FlightsItemAvailabilityRQParty sender(FlightsItemAvailabilityRQPartySender sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQPartySender getSender() {
    return sender;
  }

  public void setSender(FlightsItemAvailabilityRQPartySender sender) {
    this.sender = sender;
  }

  public FlightsItemAvailabilityRQParty recipient(FlightsItemAvailabilityRQPartyRecipient recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQPartyRecipient getRecipient() {
    return recipient;
  }

  public void setRecipient(FlightsItemAvailabilityRQPartyRecipient recipient) {
    this.recipient = recipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQParty flightsItemAvailabilityRQParty = (FlightsItemAvailabilityRQParty) o;
    return Objects.equals(this.sender, flightsItemAvailabilityRQParty.sender) &&
        Objects.equals(this.recipient, flightsItemAvailabilityRQParty.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, recipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQParty {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

