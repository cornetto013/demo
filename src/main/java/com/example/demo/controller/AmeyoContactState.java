package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmeyoContactState {
    private String phoneNumber;
    private String ameyoCustomerId;
    private Integer ameyoAttemptsValue; // The attempts value currently on Ameyo for this contact. This can differ from actualAttemptsCount if the contact uploaded with a custom attempts value.
    private Integer actualAttemptsCount; // The actual attempts count for this contact.
    private Integer attemptsSinceLastUpload; // The number of actual attempts since the last upload.
    private Boolean shouldSyncWithCampaignMaxAttempts;
    private Boolean isPurged;
    private Boolean isConnected;

    public void incrementAttempts() {
        ameyoAttemptsValue++;
        actualAttemptsCount++;
        attemptsSinceLastUpload++;
    }
}
