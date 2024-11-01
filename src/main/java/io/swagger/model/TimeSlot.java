package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeSlot
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class TimeSlot   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("relatedParty")
  private RelatedParty relatedParty = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TimeSlot id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the TimeSlot
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the TimeSlot")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TimeSlot href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the TimeSlot
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the TimeSlot")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TimeSlot relatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  /**
   * RelatedParty reference. A related party defines party or party role linked to a specific entity.
   * @return relatedParty
  **/
  @ApiModelProperty(value = "RelatedParty reference. A related party defines party or party role linked to a specific entity.")

  @Valid

  public RelatedParty getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
  }

  public TimeSlot validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Start date and end date of the timeSlot
   * @return validFor
  **/
  @ApiModelProperty(value = "Start date and end date of the timeSlot")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public TimeSlot baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public TimeSlot schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TimeSlot type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.id, timeSlot.id) &&
        Objects.equals(this.href, timeSlot.href) &&
        Objects.equals(this.relatedParty, timeSlot.relatedParty) &&
        Objects.equals(this.validFor, timeSlot.validFor) &&
        Objects.equals(this.baseType, timeSlot.baseType) &&
        Objects.equals(this.schemaLocation, timeSlot.schemaLocation) &&
        Objects.equals(this.type, timeSlot.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, relatedParty, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

