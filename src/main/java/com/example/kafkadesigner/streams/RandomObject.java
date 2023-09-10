package com.example.kafkadesigner.streams;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomObject {

  private String networkPartnerId;
  private String accountId;
}
