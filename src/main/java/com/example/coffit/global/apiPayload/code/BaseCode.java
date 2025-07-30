package com.example.coffit.global.apiPayload.code;

import com.example.coffit.global.apiPayload.dto.ReasonDTO;

public interface BaseCode {
    ReasonDTO getReason();

    ReasonDTO getReasonHttpStatus();
}
