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
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1App;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1ListMeta;

/**
 * AppList is a structure used by k8s to store lists of apps
 */
@ApiModel(description = "AppList is a structure used by k8s to store lists of apps")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1App> items = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1App>();

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList items(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1App> items) {
    this.items = items;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList addItemsItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1App itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1App> getItems() {
    return items;
  }

  public void setItems(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1App> items) {
    this.items = items;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList comGithubJenkinsXJxPkgApisJenkinsIoV1AppList = (ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList) o;
    return Objects.equals(this.apiVersion, comGithubJenkinsXJxPkgApisJenkinsIoV1AppList.apiVersion) &&
        Objects.equals(this.items, comGithubJenkinsXJxPkgApisJenkinsIoV1AppList.items) &&
        Objects.equals(this.kind, comGithubJenkinsXJxPkgApisJenkinsIoV1AppList.kind) &&
        Objects.equals(this.metadata, comGithubJenkinsXJxPkgApisJenkinsIoV1AppList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1AppList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

