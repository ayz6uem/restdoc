package com.wz1990.restdoc.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Group extends Node {

    @JsonProperty("item")
    List<Node> nodes = new ArrayList<>();

}