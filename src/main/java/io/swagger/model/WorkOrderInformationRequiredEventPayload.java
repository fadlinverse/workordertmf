package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkOrder;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-11-01T02:52:33.254Z")


public class WorkOrderInformationRequiredEventPayload   {
  @JsonProperty("workOrder")
  private WorkOrder workOrder = null;

  public WorkOrderInformationRequiredEventPayload workOrder(WorkOrder workOrder) {
    this.workOrder = workOrder;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return workOrder
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public WorkOrder getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(WorkOrder workOrder) {
    this.workOrder = workOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderInformationRequiredEventPayload workOrderInformationRequiredEventPayload = (WorkOrderInformationRequiredEventPayload) o;
    return Objects.equals(this.workOrder, workOrderInformationRequiredEventPayload.workOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderInformationRequiredEventPayload {\n");
    
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
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

