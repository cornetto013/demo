package com.example.demo.controller;

import com.google.api.client.http.HttpStatusCodes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.units.qual.A;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Tag(name = "Test Controller", description = "Test Controller")
public class TestController {

    @GetMapping
    @Operation(summary = "Test", description = "Test")
    public ResponseEntity test() {

        System.out.println(Boolean.FALSE.equals(true));
        //return ResponseEntity.status(HttpStatusCodes.STATUS_CODE_SERVER_ERROR).body("test");
        if(!StringUtils.isBlank("test")) {
            return ResponseEntity.status(HttpStatus.OK).body("test");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("test");
        }

        //return "test";
    }

    private static void someTestMethod(@Valid @NotNull String test) {
        System.out.println(test);
    }


    public static void main(String[] args) {
//        System.out.println(Instant.now().toEpochMilli());
//        System.out.println("asds " + BooleanUtils.isTrue(null) + " dsada");
//        String s = "[{\"phoneNumber\":\"9987918430\",\"ameyoCustomerId\":\"113369991\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"9152918430\",\"ameyoCustomerId\":\"113370036\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"8286763327\",\"ameyoCustomerId\":\"113370074\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"9867234567\",\"ameyoCustomerId\":\"113370095\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"9144228415\",\"ameyoCustomerId\":\"113370112\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"7231888228\",\"ameyoCustomerId\":\"113370128\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"9967015974\",\"ameyoCustomerId\":\"113370138\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false},{\"phoneNumber\":\"8108763327\",\"ameyoCustomerId\":\"113370146\",\"ameyoAttemptsValue\":1,\"actualAttemptsCount\":1,\"attemptsSinceLastUpload\":1,\"shouldSyncWithCampaignMaxAttempts\":false,\"isPurged\":false}]";
//        Type ameyoContactStateTypeToken = new TypeToken<List<AmeyoContactState>>() {}.getType();
//        List<AmeyoContactState> ameyoContactStates =  new Gson().fromJson(s, ameyoContactStateTypeToken);
//        System.out.println(ameyoContactStates);
//
//        AmeyoContactState ameyoContactState = AmeyoContactState.builder().ameyoAttemptsValue(1).phoneNumber("32425542523").build();
//        System.out.println(ameyoContactState);

        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "10", "9");
        List<String> list2 = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        System.out.println(CollectionUtils.isEqualCollection(list, list2));
        StringUtils.isBlank("test");
        //someTestMethod(null);
        //System.out.println(list.size());

    }


        // The rest of the function implementation goes here
        // As the provided Kotlin code does not have a complete implementation,
        // I am unable to provide the equivalent Java code for the rest of the function.
    }

