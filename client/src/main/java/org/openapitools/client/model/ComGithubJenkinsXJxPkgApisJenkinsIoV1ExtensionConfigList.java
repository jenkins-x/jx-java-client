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
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig;

/**
 * ExtensionsConfigList contains a list of ExtensionConfig items
 */
@ApiModel(description = "ExtensionsConfigList contains a list of ExtensionConfig items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList {
  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig> extensions = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig>();

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList extensions(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList addExtensionsItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfig> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList = (ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList) o;
    return Objects.equals(this.extensions, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionConfigList {\n");
    
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

