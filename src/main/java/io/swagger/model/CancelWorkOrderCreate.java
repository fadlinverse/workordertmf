package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkOrderRef;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *  Skipped properties: id,href,state,effectiveCancellationDate
 */
@ApiModel(description = " Skipped properties: id,href,state,effectiveCancellationDate")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class CancelWorkOrderCreate   {
  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("requestedCancellationDate")
  private OffsetDateTime requestedCancellationDate = null;

  @JsonProperty("workOrder")
  private WorkOrderRef workOrder = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public CancelWorkOrderCreate cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled.
   * @return cancellationReason
  **/
  @ApiModelProperty(value = "Reason why the order is cancelled.")


  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelWorkOrderCreate requestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

  /**
   * Date when the submitter wants the order to be cancelled
   * @return requestedCancellationDate
  **/
  @ApiModelProperty(value = "Date when the submitter wants the order to be cancelled")

  @Valid

  public OffsetDateTime getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  public void setRequestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  public CancelWorkOrderCreate workOrder(WorkOrderRef workOrder) {
    this.workOrder = workOrder;
    return this;
  }

  /**
   * Get workOrder
   * @return workOrder
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WorkOrderRef getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(WorkOrderRef workOrder) {
    this.workOrder = workOrder;
  }

  public CancelWorkOrderCreate baseType(String baseType) {
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

  public CancelWorkOrderCreate schemaLocation(String schemaLocation) {
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

  public CancelWorkOrderCreate type(String type) {
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
    CancelWorkOrderCreate cancelWorkOrderCreate = (CancelWorkOrderCreate) o;
    return Objects.equals(this.cancellationReason, cancelWorkOrderCreate.cancellationReason) &&
        Objects.equals(this.requestedCancellationDate, cancelWorkOrderCreate.requestedCancellationDate) &&
        Objects.equals(this.workOrder, cancelWorkOrderCreate.workOrder) &&
        Objects.equals(this.baseType, cancelWorkOrderCreate.baseType) &&
        Objects.equals(this.schemaLocation, cancelWorkOrderCreate.schemaLocation) &&
        Objects.equals(this.type, cancelWorkOrderCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, requestedCancellationDate, workOrder, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelWorkOrderCreate {\n");
    
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
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

