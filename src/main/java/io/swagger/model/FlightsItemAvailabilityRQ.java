package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FlightsItemAvailabilityRQParty;
import io.swagger.model.FlightsItemAvailabilityRQQuery;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightsItemAvailabilityRQ
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T16:38:42.732Z")

public class FlightsItemAvailabilityRQ   {
  @JsonProperty("Party")
  private FlightsItemAvailabilityRQParty party = null;

  @JsonProperty("Query")
  private FlightsItemAvailabilityRQQuery query = null;

  public FlightsItemAvailabilityRQ party(FlightsItemAvailabilityRQParty party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQParty getParty() {
    return party;
  }

  public void setParty(FlightsItemAvailabilityRQParty party) {
    this.party = party;
  }

  public FlightsItemAvailabilityRQ query(FlightsItemAvailabilityRQQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlightsItemAvailabilityRQQuery getQuery() {
    return query;
  }

  public void setQuery(FlightsItemAvailabilityRQQuery query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightsItemAvailabilityRQ flightsItemAvailabilityRQ = (FlightsItemAvailabilityRQ) o;
    return Objects.equals(this.party, flightsItemAvailabilityRQ.party) &&
        Objects.equals(this.query, flightsItemAvailabilityRQ.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsItemAvailabilityRQ {\n");
    
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

