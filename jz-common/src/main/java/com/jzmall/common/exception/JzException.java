package com.jzmall.common.exception;

import com.jzmall.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class JzException extends RuntimeException {
    private ExceptionEnum exceptionEnum;
}
