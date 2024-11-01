package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AttachmentRefOrValue;
import io.swagger.model.TaxDefinition;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A tax exemption certificate represents a tax exemption granted to a party (individual or organization) by a tax jurisdiction which may be a city, state, country,... An exemption has a certificate identifier (received from the jurisdiction that levied the tax) and a validity period. An exemption is per tax types and determines for each type of tax what portion of the tax is exempted (partial by percentage or complete) via the tax definition.
 */
@ApiModel(description = "A tax exemption certificate represents a tax exemption granted to a party (individual or organization) by a tax jurisdiction which may be a city, state, country,... An exemption has a certificate identifier (received from the jurisdiction that levied the tax) and a validity period. An exemption is per tax types and determines for each type of tax what portion of the tax is exempted (partial by percentage or complete) via the tax definition.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class TaxExemptionCertificate   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("certificateNumber")
  private String certificateNumber = null;

  @JsonProperty("issuingJurisdiction")
  private String issuingJurisdiction = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("attachment")
  private AttachmentRefOrValue attachment = null;

  @JsonProperty("taxDefinition")
  @Valid
  private List<TaxDefinition> taxDefinition = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TaxExemptionCertificate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the tax exemption within list of the exemptions
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the tax exemption within list of the exemptions")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxExemptionCertificate certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction
   * @return certificateNumber
  **/
  @ApiModelProperty(value = "Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction")


  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public TaxExemptionCertificate issuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
    return this;
  }

  /**
   * Name of the jurisdiction that issued the exemption
   * @return issuingJurisdiction
  **/
  @ApiModelProperty(example = "USA", value = "Name of the jurisdiction that issued the exemption")


  public String getIssuingJurisdiction() {
    return issuingJurisdiction;
  }

  public void setIssuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
  }

  public TaxExemptionCertificate reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the tax exemption
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the tax exemption")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public TaxExemptionCertificate attachment(AttachmentRefOrValue attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * The actual certificate contents, if such is supplied by the issuing jurisdiction
   * @return attachment
  **/
  @ApiModelProperty(value = "The actual certificate contents, if such is supplied by the issuing jurisdiction")

  @Valid

  public AttachmentRefOrValue getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRefOrValue attachment) {
    this.attachment = attachment;
  }

  public TaxExemptionCertificate taxDefinition(List<TaxDefinition> taxDefinition) {
    this.taxDefinition = taxDefinition;
    return this;
  }

  public TaxExemptionCertificate addTaxDefinitionItem(TaxDefinition taxDefinitionItem) {
    if (this.taxDefinition == null) {
      this.taxDefinition = new ArrayList<TaxDefinition>();
    }
    this.taxDefinition.add(taxDefinitionItem);
    return this;
  }

  /**
   * A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).
   * @return taxDefinition
  **/
  @ApiModelProperty(value = "A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).")

  @Valid

  public List<TaxDefinition> getTaxDefinition() {
    return taxDefinition;
  }

  public void setTaxDefinition(List<TaxDefinition> taxDefinition) {
    this.taxDefinition = taxDefinition;
  }

  public TaxExemptionCertificate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which the exemption is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which the exemption is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public TaxExemptionCertificate baseType(String baseType) {
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

  public TaxExemptionCertificate schemaLocation(String schemaLocation) {
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

  public TaxExemptionCertificate type(String type) {
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
    TaxExemptionCertificate taxExemptionCertificate = (TaxExemptionCertificate) o;
    return Objects.equals(this.id, taxExemptionCertificate.id) &&
        Objects.equals(this.certificateNumber, taxExemptionCertificate.certificateNumber) &&
        Objects.equals(this.issuingJurisdiction, taxExemptionCertificate.issuingJurisdiction) &&
        Objects.equals(this.reason, taxExemptionCertificate.reason) &&
        Objects.equals(this.attachment, taxExemptionCertificate.attachment) &&
        Objects.equals(this.taxDefinition, taxExemptionCertificate.taxDefinition) &&
        Objects.equals(this.validFor, taxExemptionCertificate.validFor) &&
        Objects.equals(this.baseType, taxExemptionCertificate.baseType) &&
        Objects.equals(this.schemaLocation, taxExemptionCertificate.schemaLocation) &&
        Objects.equals(this.type, taxExemptionCertificate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, certificateNumber, issuingJurisdiction, reason, attachment, taxDefinition, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxExemptionCertificate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    issuingJurisdiction: ").append(toIndentedString(issuingJurisdiction)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    taxDefinition: ").append(toIndentedString(taxDefinition)).append("\n");
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

