package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaskStateType;
import io.swagger.model.WorkOrderRef;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancelWorkOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class CancelWorkOrder   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("effectiveCancellationDate")
  private OffsetDateTime effectiveCancellationDate = null;

  @JsonProperty("requestedCancellationDate")
  private OffsetDateTime requestedCancellationDate = null;

  @JsonProperty("state")
  private TaskStateType state = null;

  @JsonProperty("workOrder")
  private WorkOrderRef workOrder = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public CancelWorkOrder id(String id) {
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

  public CancelWorkOrder href(String href) {
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

  public CancelWorkOrder cancellationReason(String cancellationReason) {
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

  public CancelWorkOrder effectiveCancellationDate(OffsetDateTime effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled.
   * @return effectiveCancellationDate
  **/
  @ApiModelProperty(value = "Date when the order is cancelled.")

  @Valid

  public OffsetDateTime getEffectiveCancellationDate() {
    return effectiveCancellationDate;
  }

  public void setEffectiveCancellationDate(OffsetDateTime effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
  }

  public CancelWorkOrder requestedCancellationDate(OffsetDateTime requestedCancellationDate) {
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

  public CancelWorkOrder state(TaskStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Tracks the lifecycle status of the cancellation request, such as Acknowledged, Rejected, InProgress, Pending and so on.
   * @return state
  **/
  @ApiModelProperty(value = "Tracks the lifecycle status of the cancellation request, such as Acknowledged, Rejected, InProgress, Pending and so on.")

  @Valid

  public TaskStateType getState() {
    return state;
  }

  public void setState(TaskStateType state) {
    this.state = state;
  }

  public CancelWorkOrder workOrder(WorkOrderRef workOrder) {
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

  public CancelWorkOrder baseType(String baseType) {
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

  public CancelWorkOrder schemaLocation(String schemaLocation) {
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

  public CancelWorkOrder type(String type) {
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
    CancelWorkOrder cancelWorkOrder = (CancelWorkOrder) o;
    return Objects.equals(this.id, cancelWorkOrder.id) &&
        Objects.equals(this.href, cancelWorkOrder.href) &&
        Objects.equals(this.cancellationReason, cancelWorkOrder.cancellationReason) &&
        Objects.equals(this.effectiveCancellationDate, cancelWorkOrder.effectiveCancellationDate) &&
        Objects.equals(this.requestedCancellationDate, cancelWorkOrder.requestedCancellationDate) &&
        Objects.equals(this.state, cancelWorkOrder.state) &&
        Objects.equals(this.workOrder, cancelWorkOrder.workOrder) &&
        Objects.equals(this.baseType, cancelWorkOrder.baseType) &&
        Objects.equals(this.schemaLocation, cancelWorkOrder.schemaLocation) &&
        Objects.equals(this.type, cancelWorkOrder.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationReason, effectiveCancellationDate, requestedCancellationDate, state, workOrder, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelWorkOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    effectiveCancellationDate: ").append(toIndentedString(effectiveCancellationDate)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

