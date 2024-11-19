package LikeLion.WebPage.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS(200, "COM-000", "OK", HttpStatus.OK),
    VALIDATION_FAIL(400, "COM-001", "형식이 맞지 않습니다.", HttpStatus.BAD_REQUEST);




    final int code;
    final String errorCode;
    final String message;
    final HttpStatus httpStatus;
}
