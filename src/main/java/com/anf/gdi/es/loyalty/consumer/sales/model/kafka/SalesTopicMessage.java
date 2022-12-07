package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "correlationId",
        "sourceSystemId",
        "triggerSystemId",
        "messageTimestamp",
        "saleTransactionMessage"
})

@Generated("jsonschema2pojo")
public class SalesTopicMessage {

    @JsonProperty("correlationId")
    @JsonPropertyDescription("The correlation id of the message")
    private String correlationId;
    @JsonProperty("sourceSystemId")
    @JsonPropertyDescription("The system which produced the message")
    private String sourceSystemId;
    @JsonProperty("triggerSystemId")
    @JsonPropertyDescription("The system which initially triggered the action")
    private String triggerSystemId;
    @JsonProperty("messageTimestamp")
    @JsonPropertyDescription("The timestamp of the message")
    private Date messageTimestamp;
    @JsonProperty("saleTransactionMessage")
    @JsonPropertyDescription("Sale Transaction Message")
    private SaleTransactionMessage saleTransactionMessage;

    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("sourceSystemId")
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    @JsonProperty("sourceSystemId")
    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    @JsonProperty("triggerSystemId")
    public String getTriggerSystemId() {
        return triggerSystemId;
    }

    @JsonProperty("triggerSystemId")
    public void setTriggerSystemId(String triggerSystemId) {
        this.triggerSystemId = triggerSystemId;
    }

    @JsonProperty("messageTimestamp")
    public Date getMessageTimestamp() {
        return messageTimestamp;
    }

    @JsonProperty("messageTimestamp")
    public void setMessageTimestamp(Date messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }

    @JsonProperty("saleTransactionMessage")
    public SaleTransactionMessage getSaleTransactionMessage() {
        return saleTransactionMessage;
    }

    @JsonProperty("saleTransactionMessage")
    public void setSaleTransactionMessage(SaleTransactionMessage saleTransactionMessage) {
        this.saleTransactionMessage = saleTransactionMessage;
    }

    @JsonIgnore
    public UUID getCorrelationIdAsUUID() {
        UUID correlationID = UUID.randomUUID();
        try {
            correlationID = UUID.fromString(this.getCorrelationId());
        } catch (Exception ex) {
            return correlationID;
        }
        return correlationID;
    }

}
