package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgreementRef;
import io.swagger.model.AppointmentRef;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.Note;
import io.swagger.model.OrderPrice;
import io.swagger.model.OrderRef;
import io.swagger.model.OrderRelationship;
import io.swagger.model.PaymentRef;
import io.swagger.model.PlaceRefOrValue;
import io.swagger.model.QuoteRef;
import io.swagger.model.RelatedChannel;
import io.swagger.model.RelatedEntity;
import io.swagger.model.RelatedParty;
import io.swagger.model.WorkOrderItem;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *  Skipped properties: id,href,completionDate,orderDate,state,expectedCompletionDate,workOrderItem.state
 */
@ApiModel(description = " Skipped properties: id,href,completionDate,orderDate,state,expectedCompletionDate,workOrderItem.state")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class WorkOrderCreate   {
  @JsonProperty("cancellationDate")
  private OffsetDateTime cancellationDate = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("notificationContact")
  private String notificationContact = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("requestedCompletionDate")
  private OffsetDateTime requestedCompletionDate = null;

  @JsonProperty("requestedStartDate")
  private OffsetDateTime requestedStartDate = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("stateChangeDate")
  private OffsetDateTime stateChangeDate = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementRef> agreement = null;

  @JsonProperty("appointment")
  private AppointmentRef appointment = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("channel")
  @Valid
  private List<RelatedChannel> channel = null;

  @JsonProperty("note")
  private Note note = null;

  @JsonProperty("order")
  @Valid
  private List<OrderRef> order = null;

  @JsonProperty("orderTotalPrice")
  @Valid
  private List<OrderPrice> orderTotalPrice = null;

  @JsonProperty("payment")
  @Valid
  private List<PaymentRef> payment = null;

  @JsonProperty("place")
  private PlaceRefOrValue place = null;

  @JsonProperty("quote")
  @Valid
  private List<QuoteRef> quote = null;

  @JsonProperty("relatedEntity")
  @Valid
  private List<RelatedEntity> relatedEntity = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("workOrderItem")
  @Valid
  private List<WorkOrderItem> workOrderItem = new ArrayList<WorkOrderItem>();

  @JsonProperty("workOrderRelationship")
  @Valid
  private List<OrderRelationship> workOrderRelationship = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public WorkOrderCreate cancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled. This is used when order is cancelled. 
   * @return cancellationDate
  **/
  @ApiModelProperty(value = "Date when the order is cancelled. This is used when order is cancelled. ")

  @Valid

  public OffsetDateTime getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public WorkOrderCreate cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled. This is used when order is cancelled. 
   * @return cancellationReason
  **/
  @ApiModelProperty(value = "Reason why the order is cancelled. This is used when order is cancelled. ")


  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public WorkOrderCreate category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...)
   * @return category
  **/
  @ApiModelProperty(value = "Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...)")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public WorkOrderCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A free-text description of the order
   * @return description
  **/
  @ApiModelProperty(value = "A free-text description of the order")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkOrderCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID given by the consumer to facilitate searches
   * @return externalId
  **/
  @ApiModelProperty(value = "ID given by the consumer to facilitate searches")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public WorkOrderCreate notificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
    return this;
  }

  /**
   * Contact attached to the order to send back information regarding this order
   * @return notificationContact
  **/
  @ApiModelProperty(value = "Contact attached to the order to send back information regarding this order")


  public String getNotificationContact() {
    return notificationContact;
  }

  public void setNotificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
  }

  public WorkOrderCreate priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)
   * @return priority
  **/
  @ApiModelProperty(value = "A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public WorkOrderCreate requestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  /**
   * Requested completion date from the requestors perspective
   * @return requestedCompletionDate
  **/
  @ApiModelProperty(value = "Requested completion date from the requestors perspective")

  @Valid

  public OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public WorkOrderCreate requestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * Order fulfillment start date wished by the requestor. This is used when, for any reason, requestor cannot allow provider to begin to operationally begin the fulfillment before a date.
   * @return requestedStartDate
  **/
  @ApiModelProperty(value = "Order fulfillment start date wished by the requestor. This is used when, for any reason, requestor cannot allow provider to begin to operationally begin the fulfillment before a date.")

  @Valid

  public OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public WorkOrderCreate startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the order started
   * @return startDate
  **/
  @ApiModelProperty(value = "Date when the order started")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public WorkOrderCreate stateChangeDate(OffsetDateTime stateChangeDate) {
    this.stateChangeDate = stateChangeDate;
    return this;
  }

  /**
   * Last change date of the order state.
   * @return stateChangeDate
  **/
  @ApiModelProperty(value = "Last change date of the order state.")

  @Valid

  public OffsetDateTime getStateChangeDate() {
    return stateChangeDate;
  }

  public void setStateChangeDate(OffsetDateTime stateChangeDate) {
    this.stateChangeDate = stateChangeDate;
  }

  public WorkOrderCreate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version number allows for the tracking of multiple evolution steps during the lifecycle of the entity.  It can be correlated to the revision number related to the lifecycle management change of the entity.
   * @return version
  **/
  @ApiModelProperty(value = "The version number allows for the tracking of multiple evolution steps during the lifecycle of the entity.  It can be correlated to the revision number related to the lifecycle management change of the entity.")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public WorkOrderCreate agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public WorkOrderCreate addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * A reference to an agreement defined in the context of the work order
   * @return agreement
  **/
  @ApiModelProperty(value = "A reference to an agreement defined in the context of the work order")

  @Valid

  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public WorkOrderCreate appointment(AppointmentRef appointment) {
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

  public WorkOrderCreate billingAccount(BillingAccountRef billingAccount) {
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

  public WorkOrderCreate channel(List<RelatedChannel> channel) {
    this.channel = channel;
    return this;
  }

  public WorkOrderCreate addChannelItem(RelatedChannel channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<RelatedChannel>();
    }
    this.channel.add(channelItem);
    return this;
  }

  /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedChannel> getChannel() {
    return channel;
  }

  public void setChannel(List<RelatedChannel> channel) {
    this.channel = channel;
  }

  public WorkOrderCreate note(Note note) {
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

  public WorkOrderCreate order(List<OrderRef> order) {
    this.order = order;
    return this;
  }

  public WorkOrderCreate addOrderItem(OrderRef orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<OrderRef>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderRef> getOrder() {
    return order;
  }

  public void setOrder(List<OrderRef> order) {
    this.order = order;
  }

  public WorkOrderCreate orderTotalPrice(List<OrderPrice> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
    return this;
  }

  public WorkOrderCreate addOrderTotalPriceItem(OrderPrice orderTotalPriceItem) {
    if (this.orderTotalPrice == null) {
      this.orderTotalPrice = new ArrayList<OrderPrice>();
    }
    this.orderTotalPrice.add(orderTotalPriceItem);
    return this;
  }

  /**
   * Get orderTotalPrice
   * @return orderTotalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderPrice> getOrderTotalPrice() {
    return orderTotalPrice;
  }

  public void setOrderTotalPrice(List<OrderPrice> orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
  }

  public WorkOrderCreate payment(List<PaymentRef> payment) {
    this.payment = payment;
    return this;
  }

  public WorkOrderCreate addPaymentItem(PaymentRef paymentItem) {
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

  public WorkOrderCreate place(PlaceRefOrValue place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PlaceRefOrValue getPlace() {
    return place;
  }

  public void setPlace(PlaceRefOrValue place) {
    this.place = place;
  }

  public WorkOrderCreate quote(List<QuoteRef> quote) {
    this.quote = quote;
    return this;
  }

  public WorkOrderCreate addQuoteItem(QuoteRef quoteItem) {
    if (this.quote == null) {
      this.quote = new ArrayList<QuoteRef>();
    }
    this.quote.add(quoteItem);
    return this;
  }

  /**
   * Get quote
   * @return quote
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QuoteRef> getQuote() {
    return quote;
  }

  public void setQuote(List<QuoteRef> quote) {
    this.quote = quote;
  }

  public WorkOrderCreate relatedEntity(List<RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public WorkOrderCreate addRelatedEntityItem(RelatedEntity relatedEntityItem) {
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

  public WorkOrderCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public WorkOrderCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public WorkOrderCreate workOrderItem(List<WorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
    return this;
  }

  public WorkOrderCreate addWorkOrderItemItem(WorkOrderItem workOrderItemItem) {
    this.workOrderItem.add(workOrderItemItem);
    return this;
  }

  /**
   * Get workOrderItem
   * @return workOrderItem
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<WorkOrderItem> getWorkOrderItem() {
    return workOrderItem;
  }

  public void setWorkOrderItem(List<WorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
  }

  public WorkOrderCreate workOrderRelationship(List<OrderRelationship> workOrderRelationship) {
    this.workOrderRelationship = workOrderRelationship;
    return this;
  }

  public WorkOrderCreate addWorkOrderRelationshipItem(OrderRelationship workOrderRelationshipItem) {
    if (this.workOrderRelationship == null) {
      this.workOrderRelationship = new ArrayList<OrderRelationship>();
    }
    this.workOrderRelationship.add(workOrderRelationshipItem);
    return this;
  }

  /**
   * Get workOrderRelationship
   * @return workOrderRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderRelationship> getWorkOrderRelationship() {
    return workOrderRelationship;
  }

  public void setWorkOrderRelationship(List<OrderRelationship> workOrderRelationship) {
    this.workOrderRelationship = workOrderRelationship;
  }

  public WorkOrderCreate baseType(String baseType) {
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

  public WorkOrderCreate schemaLocation(String schemaLocation) {
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

  public WorkOrderCreate type(String type) {
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
    WorkOrderCreate workOrderCreate = (WorkOrderCreate) o;
    return Objects.equals(this.cancellationDate, workOrderCreate.cancellationDate) &&
        Objects.equals(this.cancellationReason, workOrderCreate.cancellationReason) &&
        Objects.equals(this.category, workOrderCreate.category) &&
        Objects.equals(this.description, workOrderCreate.description) &&
        Objects.equals(this.externalId, workOrderCreate.externalId) &&
        Objects.equals(this.notificationContact, workOrderCreate.notificationContact) &&
        Objects.equals(this.priority, workOrderCreate.priority) &&
        Objects.equals(this.requestedCompletionDate, workOrderCreate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, workOrderCreate.requestedStartDate) &&
        Objects.equals(this.startDate, workOrderCreate.startDate) &&
        Objects.equals(this.stateChangeDate, workOrderCreate.stateChangeDate) &&
        Objects.equals(this.version, workOrderCreate.version) &&
        Objects.equals(this.agreement, workOrderCreate.agreement) &&
        Objects.equals(this.appointment, workOrderCreate.appointment) &&
        Objects.equals(this.billingAccount, workOrderCreate.billingAccount) &&
        Objects.equals(this.channel, workOrderCreate.channel) &&
        Objects.equals(this.note, workOrderCreate.note) &&
        Objects.equals(this.order, workOrderCreate.order) &&
        Objects.equals(this.orderTotalPrice, workOrderCreate.orderTotalPrice) &&
        Objects.equals(this.payment, workOrderCreate.payment) &&
        Objects.equals(this.place, workOrderCreate.place) &&
        Objects.equals(this.quote, workOrderCreate.quote) &&
        Objects.equals(this.relatedEntity, workOrderCreate.relatedEntity) &&
        Objects.equals(this.relatedParty, workOrderCreate.relatedParty) &&
        Objects.equals(this.workOrderItem, workOrderCreate.workOrderItem) &&
        Objects.equals(this.workOrderRelationship, workOrderCreate.workOrderRelationship) &&
        Objects.equals(this.baseType, workOrderCreate.baseType) &&
        Objects.equals(this.schemaLocation, workOrderCreate.schemaLocation) &&
        Objects.equals(this.type, workOrderCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationDate, cancellationReason, category, description, externalId, notificationContact, priority, requestedCompletionDate, requestedStartDate, startDate, stateChangeDate, version, agreement, appointment, billingAccount, channel, note, order, orderTotalPrice, payment, place, quote, relatedEntity, relatedParty, workOrderItem, workOrderRelationship, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderCreate {\n");
    
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stateChangeDate: ").append(toIndentedString(stateChangeDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    workOrderItem: ").append(toIndentedString(workOrderItem)).append("\n");
    sb.append("    workOrderRelationship: ").append(toIndentedString(workOrderRelationship)).append("\n");
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

