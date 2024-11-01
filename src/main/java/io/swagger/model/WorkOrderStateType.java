package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Possible values for the state of the order
 */
public enum WorkOrderStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  INPROGRESS("inProgress"),
  
  CANCELLED("cancelled"),
  
  COMPLETED("completed"),
  
  FAILED("failed"),
  
  PARTIAL("partial"),
  
  ASSESSINGCANCELLATION("assessingCancellation"),
  
  PENDINGCANCELLATION("pendingCancellation");

  private String value;

  WorkOrderStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WorkOrderStateType fromValue(String text) {
    for (WorkOrderStateType b : WorkOrderStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

