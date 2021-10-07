package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example implements Parcelable {

    public final static Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(android.os.Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    };
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("amount_captured")
    @Expose
    private Integer amountCaptured;
    @SerializedName("amount_refunded")
    @Expose
    private Integer amountRefunded;
    @SerializedName("application")
    @Expose
    private Object application;
    @SerializedName("application_fee")
    @Expose
    private Object applicationFee;
    @SerializedName("application_fee_amount")
    @Expose
    private Object applicationFeeAmount;
    @SerializedName("balance_transaction")
    @Expose
    private String balanceTransaction;
    @SerializedName("billing_details")
    @Expose
    private BillingDetails billingDetails;
    @SerializedName("calculated_statement_descriptor")
    @Expose
    private String calculatedStatementDescriptor;
    @SerializedName("captured")
    @Expose
    private Boolean captured;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("customer")
    @Expose
    private Object customer;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("destination")
    @Expose
    private Object destination;
    @SerializedName("dispute")
    @Expose
    private Object dispute;
    @SerializedName("disputed")
    @Expose
    private Boolean disputed;
    @SerializedName("failure_code")
    @Expose
    private Object failureCode;
    @SerializedName("failure_message")
    @Expose
    private Object failureMessage;
    @SerializedName("fraud_details")
    @Expose
    private FraudDetails fraudDetails;
    @SerializedName("invoice")
    @Expose
    private Object invoice;
    @SerializedName("livemode")
    @Expose
    private Boolean livemode;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("on_behalf_of")
    @Expose
    private Object onBehalfOf;
    @SerializedName("order")
    @Expose
    private Object order;
    @SerializedName("outcome")
    @Expose
    private Outcome outcome;
    @SerializedName("paid")
    @Expose
    private Boolean paid;
    @SerializedName("payment_intent")
    @Expose
    private Object paymentIntent;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("payment_method_details")
    @Expose
    private PaymentMethodDetails paymentMethodDetails;
    @SerializedName("receipt_email")
    @Expose
    private Object receiptEmail;
    @SerializedName("receipt_number")
    @Expose
    private Object receiptNumber;
    @SerializedName("receipt_url")
    @Expose
    private String receiptUrl;
    @SerializedName("refunded")
    @Expose
    private Boolean refunded;
    @SerializedName("refunds")
    @Expose
    private Refunds refunds;
    @SerializedName("review")
    @Expose
    private Object review;
    @SerializedName("shipping")
    @Expose
    private Object shipping;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("source_transfer")
    @Expose
    private Object sourceTransfer;
    @SerializedName("statement_descriptor")
    @Expose
    private Object statementDescriptor;
    @SerializedName("statement_descriptor_suffix")
    @Expose
    private Object statementDescriptorSuffix;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("transfer_data")
    @Expose
    private Object transferData;
    @SerializedName("transfer_group")
    @Expose
    private Object transferGroup;

    protected Example(android.os.Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.object = ((String) in.readValue((String.class.getClassLoader())));
        this.amount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.amountCaptured = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.amountRefunded = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.application = ((Object) in.readValue((Object.class.getClassLoader())));
        this.applicationFee = ((Object) in.readValue((Object.class.getClassLoader())));
        this.applicationFeeAmount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.balanceTransaction = ((String) in.readValue((String.class.getClassLoader())));
        this.billingDetails = ((BillingDetails) in.readValue((BillingDetails.class.getClassLoader())));
        this.calculatedStatementDescriptor = ((String) in.readValue((String.class.getClassLoader())));
        this.captured = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.created = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.customer = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.destination = ((Object) in.readValue((Object.class.getClassLoader())));
        this.dispute = ((Object) in.readValue((Object.class.getClassLoader())));
        this.disputed = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.failureCode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.failureMessage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.fraudDetails = ((FraudDetails) in.readValue((FraudDetails.class.getClassLoader())));
        this.invoice = ((Object) in.readValue((Object.class.getClassLoader())));
        this.livemode = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.metadata = ((Metadata) in.readValue((Metadata.class.getClassLoader())));
        this.onBehalfOf = ((Object) in.readValue((Object.class.getClassLoader())));
        this.order = ((Object) in.readValue((Object.class.getClassLoader())));
        this.outcome = ((Outcome) in.readValue((Outcome.class.getClassLoader())));
        this.paid = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.paymentIntent = ((Object) in.readValue((Object.class.getClassLoader())));
        this.paymentMethod = ((String) in.readValue((String.class.getClassLoader())));
        this.paymentMethodDetails = ((PaymentMethodDetails) in.readValue((PaymentMethodDetails.class.getClassLoader())));
        this.receiptEmail = ((Object) in.readValue((Object.class.getClassLoader())));
        this.receiptNumber = ((Object) in.readValue((Object.class.getClassLoader())));
        this.receiptUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.refunded = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.refunds = ((Refunds) in.readValue((Refunds.class.getClassLoader())));
        this.review = ((Object) in.readValue((Object.class.getClassLoader())));
        this.shipping = ((Object) in.readValue((Object.class.getClassLoader())));
        this.source = ((Source) in.readValue((Source.class.getClassLoader())));
        this.sourceTransfer = ((Object) in.readValue((Object.class.getClassLoader())));
        this.statementDescriptor = ((Object) in.readValue((Object.class.getClassLoader())));
        this.statementDescriptorSuffix = ((Object) in.readValue((Object.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.transferData = ((Object) in.readValue((Object.class.getClassLoader())));
        this.transferGroup = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Example() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountCaptured() {
        return amountCaptured;
    }

    public void setAmountCaptured(Integer amountCaptured) {
        this.amountCaptured = amountCaptured;
    }

    public Integer getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Object getApplication() {
        return application;
    }

    public void setApplication(Object application) {
        this.application = application;
    }

    public Object getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Object applicationFee) {
        this.applicationFee = applicationFee;
    }

    public Object getApplicationFeeAmount() {
        return applicationFeeAmount;
    }

    public void setApplicationFeeAmount(Object applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
    }

    public String getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(String balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    public String getCalculatedStatementDescriptor() {
        return calculatedStatementDescriptor;
    }

    public void setCalculatedStatementDescriptor(String calculatedStatementDescriptor) {
        this.calculatedStatementDescriptor = calculatedStatementDescriptor;
    }

    public Boolean getCaptured() {
        return captured;
    }

    public void setCaptured(Boolean captured) {
        this.captured = captured;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDestination() {
        return destination;
    }

    public void setDestination(Object destination) {
        this.destination = destination;
    }

    public Object getDispute() {
        return dispute;
    }

    public void setDispute(Object dispute) {
        this.dispute = dispute;
    }

    public Boolean getDisputed() {
        return disputed;
    }

    public void setDisputed(Boolean disputed) {
        this.disputed = disputed;
    }

    public Object getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(Object failureCode) {
        this.failureCode = failureCode;
    }

    public Object getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
    }

    public FraudDetails getFraudDetails() {
        return fraudDetails;
    }

    public void setFraudDetails(FraudDetails fraudDetails) {
        this.fraudDetails = fraudDetails;
    }

    public Object getInvoice() {
        return invoice;
    }

    public void setInvoice(Object invoice) {
        this.invoice = invoice;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Object getOnBehalfOf() {
        return onBehalfOf;
    }

    public void setOnBehalfOf(Object onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Object getPaymentIntent() {
        return paymentIntent;
    }

    public void setPaymentIntent(Object paymentIntent) {
        this.paymentIntent = paymentIntent;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public Object getReceiptEmail() {
        return receiptEmail;
    }

    public void setReceiptEmail(Object receiptEmail) {
        this.receiptEmail = receiptEmail;
    }

    public Object getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Object receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getReceiptUrl() {
        return receiptUrl;
    }

    public void setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public Refunds getRefunds() {
        return refunds;
    }

    public void setRefunds(Refunds refunds) {
        this.refunds = refunds;
    }

    public Object getReview() {
        return review;
    }

    public void setReview(Object review) {
        this.review = review;
    }

    public Object getShipping() {
        return shipping;
    }

    public void setShipping(Object shipping) {
        this.shipping = shipping;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Object getSourceTransfer() {
        return sourceTransfer;
    }

    public void setSourceTransfer(Object sourceTransfer) {
        this.sourceTransfer = sourceTransfer;
    }

    public Object getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(Object statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public Object getStatementDescriptorSuffix() {
        return statementDescriptorSuffix;
    }

    public void setStatementDescriptorSuffix(Object statementDescriptorSuffix) {
        this.statementDescriptorSuffix = statementDescriptorSuffix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getTransferData() {
        return transferData;
    }

    public void setTransferData(Object transferData) {
        this.transferData = transferData;
    }

    public Object getTransferGroup() {
        return transferGroup;
    }

    public void setTransferGroup(Object transferGroup) {
        this.transferGroup = transferGroup;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(object);
        dest.writeValue(amount);
        dest.writeValue(amountCaptured);
        dest.writeValue(amountRefunded);
        dest.writeValue(application);
        dest.writeValue(applicationFee);
        dest.writeValue(applicationFeeAmount);
        dest.writeValue(balanceTransaction);
        dest.writeValue(billingDetails);
        dest.writeValue(calculatedStatementDescriptor);
        dest.writeValue(captured);
        dest.writeValue(created);
        dest.writeValue(currency);
        dest.writeValue(customer);
        dest.writeValue(description);
        dest.writeValue(destination);
        dest.writeValue(dispute);
        dest.writeValue(disputed);
        dest.writeValue(failureCode);
        dest.writeValue(failureMessage);
        dest.writeValue(fraudDetails);
        dest.writeValue(invoice);
        dest.writeValue(livemode);
        dest.writeValue(metadata);
        dest.writeValue(onBehalfOf);
        dest.writeValue(order);
        dest.writeValue(outcome);
        dest.writeValue(paid);
        dest.writeValue(paymentIntent);
        dest.writeValue(paymentMethod);
        dest.writeValue(paymentMethodDetails);
        dest.writeValue(receiptEmail);
        dest.writeValue(receiptNumber);
        dest.writeValue(receiptUrl);
        dest.writeValue(refunded);
        dest.writeValue(refunds);
        dest.writeValue(review);
        dest.writeValue(shipping);
        dest.writeValue(source);
        dest.writeValue(sourceTransfer);
        dest.writeValue(statementDescriptor);
        dest.writeValue(statementDescriptorSuffix);
        dest.writeValue(status);
        dest.writeValue(transferData);
        dest.writeValue(transferGroup);
    }

    public int describeContents() {
        return 0;
    }

}
