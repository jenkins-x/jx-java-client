/*
 * Jenkins X
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IoK8sApiCoreV1NodeSelector;
import org.openapitools.client.model.IoK8sApiCoreV1PreferredSchedulingTerm;

/**
 * Node affinity is a group of node affinity scheduling rules.
 */
@ApiModel(description = "Node affinity is a group of node affinity scheduling rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class IoK8sApiCoreV1NodeAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "preferredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = null;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "requiredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution = null;

  public IoK8sApiCoreV1NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public IoK8sApiCoreV1NodeAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(IoK8sApiCoreV1PreferredSchedulingTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<IoK8sApiCoreV1PreferredSchedulingTerm>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @ApiModelProperty(value = "The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.")
  public List<IoK8sApiCoreV1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }

  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }

  public IoK8sApiCoreV1NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

   /**
   * Get requiredDuringSchedulingIgnoredDuringExecution
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }

  public void setRequiredDuringSchedulingIgnoredDuringExecution(IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeAffinity ioK8sApiCoreV1NodeAffinity = (IoK8sApiCoreV1NodeAffinity) o;
    return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution, ioK8sApiCoreV1NodeAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution, ioK8sApiCoreV1NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeAffinity {\n");
    
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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

