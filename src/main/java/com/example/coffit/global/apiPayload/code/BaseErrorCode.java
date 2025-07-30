package com.example.coffit.global.apiPayload.code;

import com.example.coffit.global.apiPayload.dto.ErrorReasonDTO;

public interface BaseErrorCode {
    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}
