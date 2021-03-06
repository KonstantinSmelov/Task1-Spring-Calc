package com.example.controllers;

import com.example.logic.Calc;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    private Calc calc;

    @Operation(summary = "multiplying first by second")
    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "first", required = false) String first,
                           @RequestParam(value = "second", required = false) String second) {

        return calc.multiply(first, second);
    }

    @Operation(summary = "dividing first by second")
    @GetMapping("/divide")
    public String divide(@RequestParam(value = "first") String first,
                         @RequestParam(value = "second") String second) {

        return calc.divide(first, second);
    }

    @Operation(summary = "subtracting second from first")
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "first", required = false) String first,
                        @RequestParam(value = "second", required = false) String second) {

        return calc.minus(first, second);
    }

    @Operation(summary = "addition of first and second")
    @GetMapping("/plus")
    public String plus(@RequestParam(value = "first", required = false) String first,
                        @RequestParam(value = "second", required = false) String second) {

        return calc.plus(first, second);
    }
}
