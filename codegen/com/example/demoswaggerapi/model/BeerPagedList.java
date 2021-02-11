package com.example.demoswaggerapi.model;

import java.util.Objects;
import com.example.demoswaggerapi.model.BeerList;
import com.example.demoswaggerapi.model.PagedResponse;
import com.example.demoswaggerapi.model.PagedResponsePageable;
import com.example.demoswaggerapi.model.PagedResponsePageableSort;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BeerPagedList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-11T11:10:02.729335600-03:00[America/Sao_Paulo]")


public class BeerPagedList extends PagedResponse  {
  @JsonProperty("content")
  private BeerList content = null;

  public BeerPagedList content(BeerList content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(description = "")
  
    @Valid
    public BeerList getContent() {
    return content;
  }

  public void setContent(BeerList content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerPagedList beerPagedList = (BeerPagedList) o;
    return Objects.equals(this.content, beerPagedList.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerPagedList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
