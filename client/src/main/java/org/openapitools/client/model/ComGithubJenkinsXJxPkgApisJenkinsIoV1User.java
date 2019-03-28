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
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

/**
 * User represents a git user so we have a cache to find by email address
 */
@ApiModel(description = "User represents a git user so we have a cache to find by email address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1User {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails spec = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails user = null;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1User apiVersion(String apiVersion) {
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

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1User kind(String kind) {
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

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1User metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1User spec(ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails getSpec() {
    return spec;
  }

  public void setSpec(ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails spec) {
    this.spec = spec;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1User user(ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails getUser() {
    return user;
  }

  public void setUser(ComGithubJenkinsXJxPkgApisJenkinsIoV1UserDetails user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1User comGithubJenkinsXJxPkgApisJenkinsIoV1User = (ComGithubJenkinsXJxPkgApisJenkinsIoV1User) o;
    return Objects.equals(this.apiVersion, comGithubJenkinsXJxPkgApisJenkinsIoV1User.apiVersion) &&
        Objects.equals(this.kind, comGithubJenkinsXJxPkgApisJenkinsIoV1User.kind) &&
        Objects.equals(this.metadata, comGithubJenkinsXJxPkgApisJenkinsIoV1User.metadata) &&
        Objects.equals(this.spec, comGithubJenkinsXJxPkgApisJenkinsIoV1User.spec) &&
        Objects.equals(this.user, comGithubJenkinsXJxPkgApisJenkinsIoV1User.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1User {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

