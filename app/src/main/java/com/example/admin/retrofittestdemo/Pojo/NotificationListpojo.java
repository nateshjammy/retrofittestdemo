package com.example.admin.retrofittestdemo.Pojo;

import android.icu.util.Output;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NotificationListpojo {

    @SerializedName("Output")
    @Expose
    private List<Output> output = null;

    public List<Output> getOutput() {
        return output;
    }

    public void setOutput(List<Output> output) {
        this.output = output;
    }


    public class Output {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("feedback_details")
        @Expose
        private List<FeedbackDetail> feedbackDetails = null;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<FeedbackDetail> getFeedbackDetails() {
            return feedbackDetails;
        }

        public void setFeedbackDetails(List<FeedbackDetail> feedbackDetails) {
            this.feedbackDetails = feedbackDetails;
        }

    }

    public class FeedbackDetail {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("data")
        @Expose
        private List<Datum> data = null;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

    }


    public class Datum {

        @SerializedName("order_date")
        @Expose
        private Integer orderDate;
        @SerializedName("notification_id")
        @Expose
        private String notificationId;
        @SerializedName("feedback_id")
        @Expose
        private Integer feedbackId;
        @SerializedName("feedback_ticket_id")
        @Expose
        private String feedbackTicketId;
        @SerializedName("branch_id")
        @Expose
        private Integer branchId;
        @SerializedName("ticket_status")
        @Expose
        private String ticketStatus;
        @SerializedName("branch_name")
        @Expose
        private String branchName;
        @SerializedName("branch_code")
        @Expose
        private String branchCode;
        @SerializedName("customer_name")
        @Expose
        private String customerName;
        @SerializedName("customer_mobile")
        @Expose
        private String customerMobile;
        @SerializedName("customer_email")
        @Expose
        private String customerEmail;
        @SerializedName("rating")
        @Expose
        private String rating;
        @SerializedName("read_status")
        @Expose
        private String readStatus;
        @SerializedName("feedback")
        @Expose
        private String feedback;
        @SerializedName("bunch_id")
        @Expose
        private String bunchId;
        @SerializedName("notification_date")
        @Expose
        private String notificationDate;
        @SerializedName("notification_time")
        @Expose
        private String notificationTime;
        @SerializedName("notification_time_order")
        @Expose
        private Integer notificationTimeOrder;
        @SerializedName("bunch_no")
        @Expose
        private String bunchNo;
        @SerializedName("call_history_details")
        @Expose
        private List<Object> callHistoryDetails = null;
        @SerializedName("invoice_no")
        @Expose
        private String invoiceNo;
        @SerializedName("invoice_date_time")
        @Expose
        private String invoiceDateTime;
        @SerializedName("register_no")
        @Expose
        private String registerNo;
        @SerializedName("service_type")
        @Expose
        private String serviceType;
        @SerializedName("model")
        @Expose
        private String model;
        @SerializedName("service_advisor_name")
        @Expose
        private String serviceAdvisorName;
        @SerializedName("technician_name")
        @Expose
        private String technicianName;
        @SerializedName("final_inspector_name")
        @Expose
        private String finalInspectorName;
        @SerializedName("job_card_no")
        @Expose
        private String jobCardNo;

        public Integer getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Integer orderDate) {
            this.orderDate = orderDate;
        }

        public String getNotificationId() {
            return notificationId;
        }

        public void setNotificationId(String notificationId) {
            this.notificationId = notificationId;
        }

        public Integer getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(Integer feedbackId) {
            this.feedbackId = feedbackId;
        }

        public String getFeedbackTicketId() {
            return feedbackTicketId;
        }

        public void setFeedbackTicketId(String feedbackTicketId) {
            this.feedbackTicketId = feedbackTicketId;
        }

        public Integer getBranchId() {
            return branchId;
        }

        public void setBranchId(Integer branchId) {
            this.branchId = branchId;
        }

        public String getTicketStatus() {
            return ticketStatus;
        }

        public void setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
        }

        public String getBranchName() {
            return branchName;
        }

        public void setBranchName(String branchName) {
            this.branchName = branchName;
        }

        public String getBranchCode() {
            return branchCode;
        }

        public void setBranchCode(String branchCode) {
            this.branchCode = branchCode;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerMobile() {
            return customerMobile;
        }

        public void setCustomerMobile(String customerMobile) {
            this.customerMobile = customerMobile;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getReadStatus() {
            return readStatus;
        }

        public void setReadStatus(String readStatus) {
            this.readStatus = readStatus;
        }

        public String getFeedback() {
            return feedback;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public String getBunchId() {
            return bunchId;
        }

        public void setBunchId(String bunchId) {
            this.bunchId = bunchId;
        }

        public String getNotificationDate() {
            return notificationDate;
        }

        public void setNotificationDate(String notificationDate) {
            this.notificationDate = notificationDate;
        }

        public String getNotificationTime() {
            return notificationTime;
        }

        public void setNotificationTime(String notificationTime) {
            this.notificationTime = notificationTime;
        }

        public Integer getNotificationTimeOrder() {
            return notificationTimeOrder;
        }

        public void setNotificationTimeOrder(Integer notificationTimeOrder) {
            this.notificationTimeOrder = notificationTimeOrder;
        }

        public String getBunchNo() {
            return bunchNo;
        }

        public void setBunchNo(String bunchNo) {
            this.bunchNo = bunchNo;
        }

        public List<Object> getCallHistoryDetails() {
            return callHistoryDetails;
        }

        public void setCallHistoryDetails(List<Object> callHistoryDetails) {
            this.callHistoryDetails = callHistoryDetails;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public void setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
        }

        public String getInvoiceDateTime() {
            return invoiceDateTime;
        }

        public void setInvoiceDateTime(String invoiceDateTime) {
            this.invoiceDateTime = invoiceDateTime;
        }

        public String getRegisterNo() {
            return registerNo;
        }

        public void setRegisterNo(String registerNo) {
            this.registerNo = registerNo;
        }

        public String getServiceType() {
            return serviceType;
        }

        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getServiceAdvisorName() {
            return serviceAdvisorName;
        }

        public void setServiceAdvisorName(String serviceAdvisorName) {
            this.serviceAdvisorName = serviceAdvisorName;
        }

        public String getTechnicianName() {
            return technicianName;
        }

        public void setTechnicianName(String technicianName) {
            this.technicianName = technicianName;
        }

        public String getFinalInspectorName() {
            return finalInspectorName;
        }

        public void setFinalInspectorName(String finalInspectorName) {
            this.finalInspectorName = finalInspectorName;
        }

        public String getJobCardNo() {
            return jobCardNo;
        }

        public void setJobCardNo(String jobCardNo) {
            this.jobCardNo = jobCardNo;
        }

    }
}
