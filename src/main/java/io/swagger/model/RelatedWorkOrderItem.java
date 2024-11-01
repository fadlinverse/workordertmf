package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedWorkOrderItem (WorkOrder item). The work order item which triggered this unit of work&#39;s creation/change/termination.
 */
@ApiModel(description = "RelatedWorkOrderItem (WorkOrder item). The work order item which triggered this unit of work's creation/change/termination.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class RelatedWorkOrderItem   {
  @JsonProperty("orderItemAction")
  private String orderItemAction = null;

  @JsonProperty("orderItemId")
  private String orderItemId = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("workOrderHref")
  private String workOrderHref = null;

  @JsonProperty("workOrderId")
  private String workOrderId = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public RelatedWorkOrderItem orderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
    return this;
  }

  /**
   * Action of the order item for this unit of work  
   * @return orderItemAction
  **/
  @ApiModelProperty(value = "Action of the order item for this unit of work  ")


  public String getOrderItemAction() {
    return orderItemAction;
  }

  public void setOrderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
  }

  public RelatedWorkOrderItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Identifier of the work order item where the unit of work was managed
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the work order item where the unit of work was managed")
  @NotNull


  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public RelatedWorkOrderItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the work order item for this unitof work  
   * @return role
  **/
  @ApiModelProperty(value = "Role of the work order item for this unitof work  ")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedWorkOrderItem workOrderHref(String workOrderHref) {
    this.workOrderHref = workOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return workOrderHref
  **/
  @ApiModelProperty(value = "Reference of the related entity.")


  public String getWorkOrderHref() {
    return workOrderHref;
  }

  public void setWorkOrderHref(String workOrderHref) {
    this.workOrderHref = workOrderHref;
  }

  public RelatedWorkOrderItem workOrderId(String workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return workOrderId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @NotNull


  public String getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(String workOrderId) {
    this.workOrderId = workOrderId;
  }

  public RelatedWorkOrderItem baseType(String baseType) {
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

  public RelatedWorkOrderItem schemaLocation(String schemaLocation) {
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

  public RelatedWorkOrderItem type(String type) {
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

  public RelatedWorkOrderItem referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedWorkOrderItem relatedWorkOrderItem = (RelatedWorkOrderItem) o;
    return Objects.equals(this.orderItemAction, relatedWorkOrderItem.orderItemAction) &&
        Objects.equals(this.orderItemId, relatedWorkOrderItem.orderItemId) &&
        Objects.equals(this.role, relatedWorkOrderItem.role) &&
        Objects.equals(this.workOrderHref, relatedWorkOrderItem.workOrderHref) &&
        Objects.equals(this.workOrderId, relatedWorkOrderItem.workOrderId) &&
        Objects.equals(this.baseType, relatedWorkOrderItem.baseType) &&
        Objects.equals(this.schemaLocation, relatedWorkOrderItem.schemaLocation) &&
        Objects.equals(this.type, relatedWorkOrderItem.type) &&
        Objects.equals(this.referredType, relatedWorkOrderItem.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemAction, orderItemId, role, workOrderHref, workOrderId, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedWorkOrderItem {\n");
    
    sb.append("    orderItemAction: ").append(toIndentedString(orderItemAction)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    workOrderHref: ").append(toIndentedString(workOrderHref)).append("\n");
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

