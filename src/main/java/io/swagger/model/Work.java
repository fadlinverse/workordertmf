package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgreementRef;
import io.swagger.model.AppointmentRef;
import io.swagger.model.Characteristic;
import io.swagger.model.Note;
import io.swagger.model.Quantity;
import io.swagger.model.RelatedParty;
import io.swagger.model.RelatedPlaceRefOrValue;
import io.swagger.model.RelatedWorkOrderItem;
import io.swagger.model.TimePeriod;
import io.swagger.model.WorkPrice;
import io.swagger.model.WorkRefOrValue;
import io.swagger.model.WorkRelationship;
import io.swagger.model.WorkSpecificationRef;
import io.swagger.model.WorkStateType;
import io.swagger.model.WorkforceEmployeeAssignment;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Work
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class Work   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("completionDate")
  private OffsetDateTime completionDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("expectedCompletionDate")
  private OffsetDateTime expectedCompletionDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orderDate")
  private OffsetDateTime orderDate = null;

  @JsonProperty("percentageComplete")
  private Float percentageComplete = null;

  @JsonProperty("workPriority")
  private String workPriority = null;

  @JsonProperty("workType")
  private String workType = null;

  @JsonProperty("actualDuration")
  private Quantity actualDuration = null;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementRef> agreement = null;

  @JsonProperty("appointment")
  private AppointmentRef appointment = null;

  @JsonProperty("currentDuration")
  private Quantity currentDuration = null;

  @JsonProperty("deliveryTimeSlot")
  private TimePeriod deliveryTimeSlot = null;

  @JsonProperty("note")
  private Note note = null;

  @JsonProperty("place")
  @Valid
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("plannedDuration")
  private Quantity plannedDuration = null;

  @JsonProperty("quantity")
  private Quantity quantity = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("scheduledDuration")
  private Quantity scheduledDuration = null;

  @JsonProperty("state")
  private WorkStateType state = null;

  @JsonProperty("work")
  @Valid
  private List<WorkRefOrValue> work = null;

  @JsonProperty("workCharacteristic")
  @Valid
  private List<Characteristic> workCharacteristic = null;

  @JsonProperty("workOrderItem")
  @Valid
  private List<RelatedWorkOrderItem> workOrderItem = null;

  @JsonProperty("workPrice")
  @Valid
  private List<WorkPrice> workPrice = null;

  @JsonProperty("workRelationship")
  @Valid
  private List<WorkRelationship> workRelationship = null;

  @JsonProperty("workSpecification")
  private WorkSpecificationRef workSpecification = null;

  @JsonProperty("workforceEmployeeAssignment")
  @Valid
  private List<WorkforceEmployeeAssignment> workforceEmployeeAssignment = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public Work id(String id) {
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

  public Work href(String href) {
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

  public Work completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date when the order was completed
   * @return completionDate
  **/
  @ApiModelProperty(value = "Date when the order was completed")

  @Valid

  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public Work description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Is the description of the work unit. It could be the same as the description of the work specification.
   * @return description
  **/
  @ApiModelProperty(value = "Is the description of the work unit. It could be the same as the description of the work specification.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Work expectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  /**
   * Date when the requester expects the work to be completed
   * @return expectedCompletionDate
  **/
  @ApiModelProperty(value = "Date when the requester expects the work to be completed")

  @Valid

  public OffsetDateTime getExpectedCompletionDate() {
    return expectedCompletionDate;
  }

  public void setExpectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

  public Work name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the work unit. It could be the same as the name of the work specification.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the work unit. It could be the same as the name of the work specification.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Work orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Date at which the work order which triggered this unit of work's creation/change/termination was created.
   * @return orderDate
  **/
  @ApiModelProperty(value = "Date at which the work order which triggered this unit of work's creation/change/termination was created.")

  @Valid

  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public Work percentageComplete(Float percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }

  /**
   * Get percentageComplete
   * @return percentageComplete
  **/
  @ApiModelProperty(value = "")


  public Float getPercentageComplete() {
    return percentageComplete;
  }

  public void setPercentageComplete(Float percentageComplete) {
    this.percentageComplete = percentageComplete;
  }

  public Work workPriority(String workPriority) {
    this.workPriority = workPriority;
    return this;
  }

  /**
   * Get workPriority
   * @return workPriority
  **/
  @ApiModelProperty(value = "")


  public String getWorkPriority() {
    return workPriority;
  }

  public void setWorkPriority(String workPriority) {
    this.workPriority = workPriority;
  }

  public Work workType(String workType) {
    this.workType = workType;
    return this;
  }

  /**
   * Get workType
   * @return workType
  **/
  @ApiModelProperty(value = "")


  public String getWorkType() {
    return workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public Work actualDuration(Quantity actualDuration) {
    this.actualDuration = actualDuration;
    return this;
  }

  /**
   * Get actualDuration
   * @return actualDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getActualDuration() {
    return actualDuration;
  }

  public void setActualDuration(Quantity actualDuration) {
    this.actualDuration = actualDuration;
  }

  public Work agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public Work addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public Work appointment(AppointmentRef appointment) {
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

  public Work currentDuration(Quantity currentDuration) {
    this.currentDuration = currentDuration;
    return this;
  }

  /**
   * Get currentDuration
   * @return currentDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getCurrentDuration() {
    return currentDuration;
  }

  public void setCurrentDuration(Quantity currentDuration) {
    this.currentDuration = currentDuration;
  }

  public Work deliveryTimeSlot(TimePeriod deliveryTimeSlot) {
    this.deliveryTimeSlot = deliveryTimeSlot;
    return this;
  }

  /**
   * Get deliveryTimeSlot
   * @return deliveryTimeSlot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TimePeriod getDeliveryTimeSlot() {
    return deliveryTimeSlot;
  }

  public void setDeliveryTimeSlot(TimePeriod deliveryTimeSlot) {
    this.deliveryTimeSlot = deliveryTimeSlot;
  }

  public Work note(Note note) {
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

  public Work place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public Work addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public Work plannedDuration(Quantity plannedDuration) {
    this.plannedDuration = plannedDuration;
    return this;
  }

  /**
   * Get plannedDuration
   * @return plannedDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getPlannedDuration() {
    return plannedDuration;
  }

  public void setPlannedDuration(Quantity plannedDuration) {
    this.plannedDuration = plannedDuration;
  }

  public Work quantity(Quantity quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public Work relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Work addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public Work scheduledDuration(Quantity scheduledDuration) {
    this.scheduledDuration = scheduledDuration;
    return this;
  }

  /**
   * Get scheduledDuration
   * @return scheduledDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getScheduledDuration() {
    return scheduledDuration;
  }

  public void setScheduledDuration(Quantity scheduledDuration) {
    this.scheduledDuration = scheduledDuration;
  }

  public Work state(WorkStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WorkStateType getState() {
    return state;
  }

  public void setState(WorkStateType state) {
    this.state = state;
  }

  public Work work(List<WorkRefOrValue> work) {
    this.work = work;
    return this;
  }

  public Work addWorkItem(WorkRefOrValue workItem) {
    if (this.work == null) {
      this.work = new ArrayList<WorkRefOrValue>();
    }
    this.work.add(workItem);
    return this;
  }

  /**
   * Get work
   * @return work
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkRefOrValue> getWork() {
    return work;
  }

  public void setWork(List<WorkRefOrValue> work) {
    this.work = work;
  }

  public Work workCharacteristic(List<Characteristic> workCharacteristic) {
    this.workCharacteristic = workCharacteristic;
    return this;
  }

  public Work addWorkCharacteristicItem(Characteristic workCharacteristicItem) {
    if (this.workCharacteristic == null) {
      this.workCharacteristic = new ArrayList<Characteristic>();
    }
    this.workCharacteristic.add(workCharacteristicItem);
    return this;
  }

  /**
   * Get workCharacteristic
   * @return workCharacteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getWorkCharacteristic() {
    return workCharacteristic;
  }

  public void setWorkCharacteristic(List<Characteristic> workCharacteristic) {
    this.workCharacteristic = workCharacteristic;
  }

  public Work workOrderItem(List<RelatedWorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
    return this;
  }

  public Work addWorkOrderItemItem(RelatedWorkOrderItem workOrderItemItem) {
    if (this.workOrderItem == null) {
      this.workOrderItem = new ArrayList<RelatedWorkOrderItem>();
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

  public List<RelatedWorkOrderItem> getWorkOrderItem() {
    return workOrderItem;
  }

  public void setWorkOrderItem(List<RelatedWorkOrderItem> workOrderItem) {
    this.workOrderItem = workOrderItem;
  }

  public Work workPrice(List<WorkPrice> workPrice) {
    this.workPrice = workPrice;
    return this;
  }

  public Work addWorkPriceItem(WorkPrice workPriceItem) {
    if (this.workPrice == null) {
      this.workPrice = new ArrayList<WorkPrice>();
    }
    this.workPrice.add(workPriceItem);
    return this;
  }

  /**
   * Get workPrice
   * @return workPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkPrice> getWorkPrice() {
    return workPrice;
  }

  public void setWorkPrice(List<WorkPrice> workPrice) {
    this.workPrice = workPrice;
  }

  public Work workRelationship(List<WorkRelationship> workRelationship) {
    this.workRelationship = workRelationship;
    return this;
  }

  public Work addWorkRelationshipItem(WorkRelationship workRelationshipItem) {
    if (this.workRelationship == null) {
      this.workRelationship = new ArrayList<WorkRelationship>();
    }
    this.workRelationship.add(workRelationshipItem);
    return this;
  }

  /**
   * Get workRelationship
   * @return workRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkRelationship> getWorkRelationship() {
    return workRelationship;
  }

  public void setWorkRelationship(List<WorkRelationship> workRelationship) {
    this.workRelationship = workRelationship;
  }

  public Work workSpecification(WorkSpecificationRef workSpecification) {
    this.workSpecification = workSpecification;
    return this;
  }

  /**
   * Get workSpecification
   * @return workSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WorkSpecificationRef getWorkSpecification() {
    return workSpecification;
  }

  public void setWorkSpecification(WorkSpecificationRef workSpecification) {
    this.workSpecification = workSpecification;
  }

  public Work workforceEmployeeAssignment(List<WorkforceEmployeeAssignment> workforceEmployeeAssignment) {
    this.workforceEmployeeAssignment = workforceEmployeeAssignment;
    return this;
  }

  public Work addWorkforceEmployeeAssignmentItem(WorkforceEmployeeAssignment workforceEmployeeAssignmentItem) {
    if (this.workforceEmployeeAssignment == null) {
      this.workforceEmployeeAssignment = new ArrayList<WorkforceEmployeeAssignment>();
    }
    this.workforceEmployeeAssignment.add(workforceEmployeeAssignmentItem);
    return this;
  }

  /**
   * Get workforceEmployeeAssignment
   * @return workforceEmployeeAssignment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkforceEmployeeAssignment> getWorkforceEmployeeAssignment() {
    return workforceEmployeeAssignment;
  }

  public void setWorkforceEmployeeAssignment(List<WorkforceEmployeeAssignment> workforceEmployeeAssignment) {
    this.workforceEmployeeAssignment = workforceEmployeeAssignment;
  }

  public Work baseType(String baseType) {
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

  public Work schemaLocation(String schemaLocation) {
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

  public Work type(String type) {
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
    Work work = (Work) o;
    return Objects.equals(this.id, work.id) &&
        Objects.equals(this.href, work.href) &&
        Objects.equals(this.completionDate, work.completionDate) &&
        Objects.equals(this.description, work.description) &&
        Objects.equals(this.expectedCompletionDate, work.expectedCompletionDate) &&
        Objects.equals(this.name, work.name) &&
        Objects.equals(this.orderDate, work.orderDate) &&
        Objects.equals(this.percentageComplete, work.percentageComplete) &&
        Objects.equals(this.workPriority, work.workPriority) &&
        Objects.equals(this.workType, work.workType) &&
        Objects.equals(this.actualDuration, work.actualDuration) &&
        Objects.equals(this.agreement, work.agreement) &&
        Objects.equals(this.appointment, work.appointment) &&
        Objects.equals(this.currentDuration, work.currentDuration) &&
        Objects.equals(this.deliveryTimeSlot, work.deliveryTimeSlot) &&
        Objects.equals(this.note, work.note) &&
        Objects.equals(this.place, work.place) &&
        Objects.equals(this.plannedDuration, work.plannedDuration) &&
        Objects.equals(this.quantity, work.quantity) &&
        Objects.equals(this.relatedParty, work.relatedParty) &&
        Objects.equals(this.scheduledDuration, work.scheduledDuration) &&
        Objects.equals(this.state, work.state) &&
        Objects.equals(this.work, work.work) &&
        Objects.equals(this.workCharacteristic, work.workCharacteristic) &&
        Objects.equals(this.workOrderItem, work.workOrderItem) &&
        Objects.equals(this.workPrice, work.workPrice) &&
        Objects.equals(this.workRelationship, work.workRelationship) &&
        Objects.equals(this.workSpecification, work.workSpecification) &&
        Objects.equals(this.workforceEmployeeAssignment, work.workforceEmployeeAssignment) &&
        Objects.equals(this.baseType, work.baseType) &&
        Objects.equals(this.schemaLocation, work.schemaLocation) &&
        Objects.equals(this.type, work.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, completionDate, description, expectedCompletionDate, name, orderDate, percentageComplete, workPriority, workType, actualDuration, agreement, appointment, currentDuration, deliveryTimeSlot, note, place, plannedDuration, quantity, relatedParty, scheduledDuration, state, work, workCharacteristic, workOrderItem, workPrice, workRelationship, workSpecification, workforceEmployeeAssignment, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Work {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    workPriority: ").append(toIndentedString(workPriority)).append("\n");
    sb.append("    workType: ").append(toIndentedString(workType)).append("\n");
    sb.append("    actualDuration: ").append(toIndentedString(actualDuration)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    currentDuration: ").append(toIndentedString(currentDuration)).append("\n");
    sb.append("    deliveryTimeSlot: ").append(toIndentedString(deliveryTimeSlot)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    plannedDuration: ").append(toIndentedString(plannedDuration)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    scheduledDuration: ").append(toIndentedString(scheduledDuration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workCharacteristic: ").append(toIndentedString(workCharacteristic)).append("\n");
    sb.append("    workOrderItem: ").append(toIndentedString(workOrderItem)).append("\n");
    sb.append("    workPrice: ").append(toIndentedString(workPrice)).append("\n");
    sb.append("    workRelationship: ").append(toIndentedString(workRelationship)).append("\n");
    sb.append("    workSpecification: ").append(toIndentedString(workSpecification)).append("\n");
    sb.append("    workforceEmployeeAssignment: ").append(toIndentedString(workforceEmployeeAssignment)).append("\n");
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

