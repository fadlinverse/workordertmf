package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AppointmentRef;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.Note;
import io.swagger.model.OrderItemActionType;
import io.swagger.model.OrderItemPrice;
import io.swagger.model.OrderItemRef;
import io.swagger.model.OrderItemRelationship;
import io.swagger.model.PaymentRef;
import io.swagger.model.RelatedEntity;
import io.swagger.model.WorkOrderItem;
import io.swagger.model.WorkOrderItemStateType;
import io.swagger.model.WorkRefOrValue;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An identified part of the order. A work order is decomposed into one or more order items.
 */
@ApiModel(description = "An identified part of the order. A work order is decomposed into one or more order items.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class WorkOrderItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("action")
  private OrderItemActionType action = null;

  @JsonProperty("appointment")
  private AppointmentRef appointment = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("itemPrice")
  @Valid
  private List<OrderItemPrice> itemPrice = null;

  @JsonProperty("itemTotalPrice")
  @Valid
  private List<OrderItemPrice> itemTotalPrice = null;

  @JsonProperty("note")
  private Note note = null;

  @JsonProperty("orderItem")
  @Valid
  private List<OrderItemRef> orderItem = null;

  @JsonProperty("payment")
  @Valid
  private List<PaymentRef> payment = null;

  @JsonProperty("relatedEntity")
  @Valid
  private List<RelatedEntity> relatedEntity = null;

  @JsonProperty("state")
  private WorkOrderItemStateType state = null;

  @JsonProperty("work")
  private WorkRefOrValue work = null;

  @JsonProperty("workOrderItem")
  @Valid
  private List<WorkOrderItem> workOrderItem = null;

  @JsonProperty("workOrderItemRelationship")
  @Valid
  private List<OrderItemRelationship> workOrderItemRelationship = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public WorkOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkOrderItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Order Item
   * @return description
  **/
  @ApiModelProperty(value = "Description of the Order Item")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkOrderItem action(OrderItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OrderItemActionType getAction() {
    return action;
  }

  public void setAction(OrderItemActionType action) {
    this.action = action;
  }

  public WorkOrderItem appointment(AppointmentRef appointment) {
    this.appointment = appointment;
    return this;
  }

  /**
   * Get appointment
   * @return appointment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentRef getAppointment() {
    return appointment;
  }

  public void setAppointment(AppointmentRef appointment) {
    this.appointment = appointment;
  }

  public WorkOrderItem billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public WorkOrderItem itemPrice(List<OrderItemPrice> itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  public WorkOrderItem addItemPriceItem(OrderItemPrice itemPriceItem) {
    if (this.itemPrice == null) {
      this.itemPrice = new ArrayList<OrderItemPrice>();
    }
    this.itemPrice.add(itemPriceItem);
    return this;
  }

  /**
   * Get itemPrice
   * @return itemPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemPrice> getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(List<OrderItemPrice> itemPrice) {
    this.itemPrice = itemPrice;
  }

  public WorkOrderItem itemTotalPrice(List<OrderItemPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
    return this;
  }

  public WorkOrderItem addItemTotalPriceItem(OrderItemPrice itemTotalPriceItem) {
    if (this.itemTotalPrice == null) {
      this.itemTotalPrice = new ArrayList<OrderItemPrice>();
    }
    this.itemTotalPrice.add(itemTotalPriceItem);
    return this;
  }

  /**
   * Get itemTotalPrice
   * @return itemTotalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemPrice> getItemTotalPrice() {
    return itemTotalPrice;
  }

  public void setItemTotalPrice(List<OrderItemPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
  }

  public WorkOrderItem note(Note note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Note getNote() {
    return note;
  }

  public void setNote(Note note) {
    this.note = note;
  }

  public WorkOrderItem orderItem(List<OrderItemRef> orderItem) {
    this.orderItem = orderItem;
    return this;
  }

  public WorkOrderItem addOrderItemItem(OrderItemRef orderItemItem) {
    if (this.orderItem == null) {
      this.orderItem = new ArrayList<OrderItemRef>();
    }
    this.orderItem.add(orderItemItem);
    return this;
  }

  /**
   * Get orderItem
   * @return orderItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemRef> getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(List<OrderItemRef> orderItem) {
    this.orderItem = orderItem;
  }

  public WorkOrderItem payment(List<PaymentRef> payment) {
    this.payment = payment;
    return this;
  }

  public WorkOrderItem addPaymentItem(PaymentRef paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<PaymentRef>();
    }
    this.payment.add(paymentItem);
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentRef> getPayment() {
    return payment;
  }

  public void setPayment(List<PaymentRef> payment) {
    this.payment = payment;
  }

  public WorkOrderItem relatedEntity(List<RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public WorkOrderItem addRelatedEntityItem(RelatedEntity relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<RelatedEntity>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * Get relatedEntity
   * @return relatedEntity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedEntity> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public WorkOrderItem state(WorkOrderItemStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WorkOrderItemStateType getState() {
    return state;
  }

  public void setState(WorkOrderItemStateType state) {
    this.state = state;
  }

  public WorkOrderItem work(WorkRefOrValue work) {
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

  public WorkOrderItem workOrderItem(List<WorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
    return this;
  }

  public WorkOrderItem addWorkOrderItemItem(WorkOrderItem workOrderItemItem) {
    if (this.workOrderItem == null) {
      this.workOrderItem = new ArrayList<WorkOrderItem>();
    }
    this.workOrderItem.add(workOrderItemItem);
    return this;
  }

  /**
   * Get workOrderItem
   * @return workOrderItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkOrderItem> getWorkOrderItem() {
    return workOrderItem;
  }

  public void setWorkOrderItem(List<WorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
  }

  public WorkOrderItem workOrderItemRelationship(List<OrderItemRelationship> workOrderItemRelationship) {
    this.workOrderItemRelationship = workOrderItemRelationship;
    return this;
  }

  public WorkOrderItem addWorkOrderItemRelationshipItem(OrderItemRelationship workOrderItemRelationshipItem) {
    if (this.workOrderItemRelationship == null) {
      this.workOrderItemRelationship = new ArrayList<OrderItemRelationship>();
    }
    this.workOrderItemRelationship.add(workOrderItemRelationshipItem);
    return this;
  }

  /**
   * Get workOrderItemRelationship
   * @return workOrderItemRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemRelationship> getWorkOrderItemRelationship() {
    return workOrderItemRelationship;
  }

  public void setWorkOrderItemRelationship(List<OrderItemRelationship> workOrderItemRelationship) {
    this.workOrderItemRelationship = workOrderItemRelationship;
  }

  public WorkOrderItem baseType(String baseType) {
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

  public WorkOrderItem schemaLocation(String schemaLocation) {
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

  public WorkOrderItem type(String type) {
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
    WorkOrderItem workOrderItem = (WorkOrderItem) o;
    return Objects.equals(this.id, workOrderItem.id) &&
        Objects.equals(this.description, workOrderItem.description) &&
        Objects.equals(this.action, workOrderItem.action) &&
        Objects.equals(this.appointment, workOrderItem.appointment) &&
        Objects.equals(this.billingAccount, workOrderItem.billingAccount) &&
        Objects.equals(this.itemPrice, workOrderItem.itemPrice) &&
        Objects.equals(this.itemTotalPrice, workOrderItem.itemTotalPrice) &&
        Objects.equals(this.note, workOrderItem.note) &&
        Objects.equals(this.orderItem, workOrderItem.orderItem) &&
        Objects.equals(this.payment, workOrderItem.payment) &&
        Objects.equals(this.relatedEntity, workOrderItem.relatedEntity) &&
        Objects.equals(this.state, workOrderItem.state) &&
        Objects.equals(this.work, workOrderItem.work) &&
        Objects.equals(this.workOrderItem, workOrderItem.workOrderItem) &&
        Objects.equals(this.workOrderItemRelationship, workOrderItem.workOrderItemRelationship) &&
        Objects.equals(this.baseType, workOrderItem.baseType) &&
        Objects.equals(this.schemaLocation, workOrderItem.schemaLocation) &&
        Objects.equals(this.type, workOrderItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, action, appointment, billingAccount, itemPrice, itemTotalPrice, note, orderItem, payment, relatedEntity, state, work, workOrderItem, workOrderItemRelationship, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemTotalPrice: ").append(toIndentedString(itemTotalPrice)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workOrderItem: ").append(toIndentedString(workOrderItem)).append("\n");
    sb.append("    workOrderItemRelationship: ").append(toIndentedString(workOrderItemRelationship)).append("\n");
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

