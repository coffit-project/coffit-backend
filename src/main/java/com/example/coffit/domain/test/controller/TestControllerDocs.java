package com.example.coffit.domain.test.controller;

import com.example.coffit.global.apiPayload.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Null;

@Tag(name = "테스트 API입니다", description = "테스트 API입니다")
public interface TestControllerDocs {
    @Operation(summary = "1이면 성공, 2면 에러 발생", description = "입력값으로 1 → 성공, 2 → 예외 발생 테스트")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "정상 응답",
                    content = @Content(mediaType = "application/json",
                            examples = @ExampleObject(value = """
                                {
                                  "isSuccess": true,
                                  "code": "COMMON200",
                                  "message": "성공입니다.",
                                  "result": "성공한 값입니다"
                                }
                            """))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "입력값이 2인 경우 예외 발생",
                    content = @Content(mediaType = "application/json",
                            examples = @ExampleObject(value = """
                                {
                                  "isSuccess": false,
                                  "code": "TEST400",
                                  "message": "2는 허용되지 않는 값입니다."
                                }
                            """)))
    })
    ApiResponse<String> checkInput(int value);
}

