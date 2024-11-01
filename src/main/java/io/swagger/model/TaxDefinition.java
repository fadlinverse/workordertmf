package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference of a tax definition. A tax is levied by an authorized tax jurisdiction. There are many different types of tax (Federal Tax levied by the US Government, State Tax levied by the State of California,…).
 */
@ApiModel(description = "Reference of a tax definition. A tax is levied by an authorized tax jurisdiction. There are many different types of tax (Federal Tax levied by the US Government, State Tax levied by the State of California,…).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class TaxDefinition   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jurisdictionLevel")
  private String jurisdictionLevel = null;

  @JsonProperty("jurisdictionName")
  private String jurisdictionName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taxType")
  private String taxType = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TaxDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the tax.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the tax.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxDefinition jurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
    return this;
  }

  /**
   * Level of the jurisdiction that levies the tax
   * @return jurisdictionLevel
  **/
  @ApiModelProperty(example = "Country", value = "Level of the jurisdiction that levies the tax")


  public String getJurisdictionLevel() {
    return jurisdictionLevel;
  }

  public void setJurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
  }

  public TaxDefinition jurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

  /**
   * Name of the jurisdiction that levies the tax
   * @return jurisdictionName
  **/
  @ApiModelProperty(example = "USA", value = "Name of the jurisdiction that levies the tax")


  public String getJurisdictionName() {
    return jurisdictionName;
  }

  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }

  public TaxDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Tax name.
   * @return name
  **/
  @ApiModelProperty(value = "Tax name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxDefinition taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Type of the tax.
   * @return taxType
  **/
  @ApiModelProperty(example = "VAT", value = "Type of the tax.")


  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public TaxDefinition validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which the tax applies, might be set for example if it is known that the jurisdiction will cease to apply the tax after a certain date.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which the tax applies, might be set for example if it is known that the jurisdiction will cease to apply the tax after a certain date.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public TaxDefinition baseType(String baseType) {
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

  public TaxDefinition schemaLocation(String schemaLocation) {
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

  public TaxDefinition type(String type) {
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
    TaxDefinition taxDefinition = (TaxDefinition) o;
    return Objects.equals(this.id, taxDefinition.id) &&
        Objects.equals(this.jurisdictionLevel, taxDefinition.jurisdictionLevel) &&
        Objects.equals(this.jurisdictionName, taxDefinition.jurisdictionName) &&
        Objects.equals(this.name, taxDefinition.name) &&
        Objects.equals(this.taxType, taxDefinition.taxType) &&
        Objects.equals(this.validFor, taxDefinition.validFor) &&
        Objects.equals(this.baseType, taxDefinition.baseType) &&
        Objects.equals(this.schemaLocation, taxDefinition.schemaLocation) &&
        Objects.equals(this.type, taxDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jurisdictionLevel, jurisdictionName, name, taxType, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jurisdictionLevel: ").append(toIndentedString(jurisdictionLevel)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

