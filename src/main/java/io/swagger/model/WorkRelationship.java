package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Characteristic;
import io.swagger.model.WorkRefOrValue;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkRelationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class WorkRelationship   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("work")
  private WorkRefOrValue work = null;

  @JsonProperty("workRelationshipCharacteristic")
  @Valid
  private List<Characteristic> workRelationshipCharacteristic = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public WorkRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkRelationship href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public WorkRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public WorkRelationship work(WorkRefOrValue work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   * @return work
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WorkRefOrValue getWork() {
    return work;
  }

  public void setWork(WorkRefOrValue work) {
    this.work = work;
  }

  public WorkRelationship workRelationshipCharacteristic(List<Characteristic> workRelationshipCharacteristic) {
    this.workRelationshipCharacteristic = workRelationshipCharacteristic;
    return this;
  }

  public WorkRelationship addWorkRelationshipCharacteristicItem(Characteristic workRelationshipCharacteristicItem) {
    if (this.workRelationshipCharacteristic == null) {
      this.workRelationshipCharacteristic = new ArrayList<Characteristic>();
    }
    this.workRelationshipCharacteristic.add(workRelationshipCharacteristicItem);
    return this;
  }

  /**
   * Get workRelationshipCharacteristic
   * @return workRelationshipCharacteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getWorkRelationshipCharacteristic() {
    return workRelationshipCharacteristic;
  }

  public void setWorkRelationshipCharacteristic(List<Characteristic> workRelationshipCharacteristic) {
    this.workRelationshipCharacteristic = workRelationshipCharacteristic;
  }

  public WorkRelationship baseType(String baseType) {
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

  public WorkRelationship schemaLocation(String schemaLocation) {
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

  public WorkRelationship type(String type) {
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
    WorkRelationship workRelationship = (WorkRelationship) o;
    return Objects.equals(this.id, workRelationship.id) &&
        Objects.equals(this.href, workRelationship.href) &&
        Objects.equals(this.relationshipType, workRelationship.relationshipType) &&
        Objects.equals(this.work, workRelationship.work) &&
        Objects.equals(this.workRelationshipCharacteristic, workRelationship.workRelationshipCharacteristic) &&
        Objects.equals(this.baseType, workRelationship.baseType) &&
        Objects.equals(this.schemaLocation, workRelationship.schemaLocation) &&
        Objects.equals(this.type, workRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, relationshipType, work, workRelationshipCharacteristic, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workRelationshipCharacteristic: ").append(toIndentedString(workRelationshipCharacteristic)).append("\n");
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

