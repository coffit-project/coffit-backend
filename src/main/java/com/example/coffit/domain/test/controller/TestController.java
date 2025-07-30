package com.example.coffit.domain.test.controller;


import com.example.coffit.global.apiPayload.ApiResponse;
import com.example.coffit.global.apiPayload.exception.GeneralException;
import com.example.coffit.global.apiPayload.status.ErrorStatus;
import com.example.coffit.global.apiPayload.status.SuccessStatus;
import jakarta.validation.constraints.Null;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController implements TestControllerDocs{
    @GetMapping("/check")
    public ApiResponse<String> checkInput(@RequestParam int value) {
        if (value == 2) {
            throw new GeneralException(ErrorStatus._BAD_REQUEST);
        }
        return ApiResponse.of(SuccessStatus._OK);
    }
}

