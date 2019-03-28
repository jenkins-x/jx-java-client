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
import org.openapitools.client.model.IoK8sApiCoreV1ConfigMapEnvSource;
import org.openapitools.client.model.IoK8sApiCoreV1SecretEnvSource;

/**
 * EnvFromSource represents the source of a set of ConfigMaps
 */
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class IoK8sApiCoreV1EnvFromSource {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private IoK8sApiCoreV1ConfigMapEnvSource configMapRef = null;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private IoK8sApiCoreV1SecretEnvSource secretRef = null;

  public IoK8sApiCoreV1EnvFromSource configMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }

  public void setConfigMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }

  public IoK8sApiCoreV1EnvFromSource prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   * @return prefix
  **/
  @ApiModelProperty(value = "An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public IoK8sApiCoreV1EnvFromSource secretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiCoreV1SecretEnvSource getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EnvFromSource ioK8sApiCoreV1EnvFromSource = (IoK8sApiCoreV1EnvFromSource) o;
    return Objects.equals(this.configMapRef, ioK8sApiCoreV1EnvFromSource.configMapRef) &&
        Objects.equals(this.prefix, ioK8sApiCoreV1EnvFromSource.prefix) &&
        Objects.equals(this.secretRef, ioK8sApiCoreV1EnvFromSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvFromSource {\n");
    
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

