package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum WorkforceEmployeeAssignmentStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  INPROGRESS("inProgress"),
  
  CANCELLED("cancelled"),
  
  COMPLETED("completed"),
  
  FAILED("failed"),
  
  PARTIAL("partial");

  private String value;

  WorkforceEmployeeAssignmentStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WorkforceEmployeeAssignmentStateType fromValue(String text) {
    for (WorkforceEmployeeAssignmentStateType b : WorkforceEmployeeAssignmentStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

