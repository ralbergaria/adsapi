
package org.ac.ads.adsapi.model.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardHoldersName",
    "cardNumber",
    "expirationDate",
    "verificationCode",
    "billingAddress"
})
@Getter
@Setter
public class PaymentDataDTO {

    @JsonProperty("cardHoldersName")
    public String cardHoldersName;
    @JsonProperty("cardNumber")
    public String cardNumber;
    @JsonProperty("expirationDate")
    public ExpirationDateDTO expirationDate;
    @JsonProperty("verificationCode")
    public Integer verificationCode;
    @JsonProperty("billingAddress")
    public BillingAddressDTO billingAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
