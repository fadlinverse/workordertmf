package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PartyRefOrValue;
import io.swagger.model.TimeSlot;
import io.swagger.model.WorkforceEmployeeAssignmentStateType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents an assignment of a particular WorforceEmployeeRole for a particular unit of work in a specific timeframe. For example, assignment of a person in a network engineer role to a trouble shooting unit of work for at least 2 hours. The assignment is associated with a TimeSlot.
 */
@ApiModel(description = "Represents an assignment of a particular WorforceEmployeeRole for a particular unit of work in a specific timeframe. For example, assignment of a person in a network engineer role to a trouble shooting unit of work for at least 2 hours. The assignment is associated with a TimeSlot.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class WorkforceEmployeeAssignment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("skillType")
  private String skillType = null;

  @JsonProperty("state")
  private WorkforceEmployeeAssignmentStateType state = null;

  @JsonProperty("timeSlot")
  @Valid
  private List<TimeSlot> timeSlot = null;

  @JsonProperty("workforceEmployee")
  private PartyRefOrValue workforceEmployee = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public WorkforceEmployeeAssignment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkforceEmployeeAssignment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkforceEmployeeAssignment skillType(String skillType) {
    this.skillType = skillType;
    return this;
  }

  /**
   * Ex: primarySkill, secondarySkill
   * @return skillType
  **/
  @ApiModelProperty(required = true, value = "Ex: primarySkill, secondarySkill")
  @NotNull


  public String getSkillType() {
    return skillType;
  }

  public void setSkillType(String skillType) {
    this.skillType = skillType;
  }

  public WorkforceEmployeeAssignment state(WorkforceEmployeeAssignmentStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Ex: primarySkill, secondarySkill
   * @return state
  **/
  @ApiModelProperty(value = "Ex: primarySkill, secondarySkill")

  @Valid

  public WorkforceEmployeeAssignmentStateType getState() {
    return state;
  }

  public void setState(WorkforceEmployeeAssignmentStateType state) {
    this.state = state;
  }

  public WorkforceEmployeeAssignment timeSlot(List<TimeSlot> timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

  public WorkforceEmployeeAssignment addTimeSlotItem(TimeSlot timeSlotItem) {
    if (this.timeSlot == null) {
      this.timeSlot = new ArrayList<TimeSlot>();
    }
    this.timeSlot.add(timeSlotItem);
    return this;
  }

  /**
   * Get timeSlot
   * @return timeSlot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TimeSlot> getTimeSlot() {
    return timeSlot;
  }

  public void setTimeSlot(List<TimeSlot> timeSlot) {
    this.timeSlot = timeSlot;
  }

  public WorkforceEmployeeAssignment workforceEmployee(PartyRefOrValue workforceEmployee) {
    this.workforceEmployee = workforceEmployee;
    return this;
  }

  /**
   * Get workforceEmployee
   * @return workforceEmployee
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PartyRefOrValue getWorkforceEmployee() {
    return workforceEmployee;
  }

  public void setWorkforceEmployee(PartyRefOrValue workforceEmployee) {
    this.workforceEmployee = workforceEmployee;
  }

  public WorkforceEmployeeAssignment baseType(String baseType) {
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

  public WorkforceEmployeeAssignment schemaLocation(String schemaLocation) {
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

  public WorkforceEmployeeAssignment type(String type) {
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
    WorkforceEmployeeAssignment workforceEmployeeAssignment = (WorkforceEmployeeAssignment) o;
    return Objects.equals(this.id, workforceEmployeeAssignment.id) &&
        Objects.equals(this.description, workforceEmployeeAssignment.description) &&
        Objects.equals(this.skillType, workforceEmployeeAssignment.skillType) &&
        Objects.equals(this.state, workforceEmployeeAssignment.state) &&
        Objects.equals(this.timeSlot, workforceEmployeeAssignment.timeSlot) &&
        Objects.equals(this.workforceEmployee, workforceEmployeeAssignment.workforceEmployee) &&
        Objects.equals(this.baseType, workforceEmployeeAssignment.baseType) &&
        Objects.equals(this.schemaLocation, workforceEmployeeAssignment.schemaLocation) &&
        Objects.equals(this.type, workforceEmployeeAssignment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, skillType, state, timeSlot, workforceEmployee, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkforceEmployeeAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skillType: ").append(toIndentedString(skillType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    workforceEmployee: ").append(toIndentedString(workforceEmployee)).append("\n");
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

