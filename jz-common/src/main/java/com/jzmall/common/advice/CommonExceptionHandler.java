package com.jzmall.common.advice;

import com.jzmall.common.exception.JzException;
import com.jzmall.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
// 通过@ControllerAdvice注解可以将对于控制器的全局配置放在同一个位置。
// 注解@Controller的类的方法可以使用@ExceptionHandler、@InitBinder、@ModelAttribute注解到方法上。
// @ControllerAdvice注解将作用在所有注解了@RequestMapping的控制器的方法上
public class CommonExceptionHandler {

    @ExceptionHandler(JzException.class)
    public ResponseEntity<ExceptionResult> handleException(JzException e) {
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
