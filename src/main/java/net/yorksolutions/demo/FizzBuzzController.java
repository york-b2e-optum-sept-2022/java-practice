package net.yorksolutions.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:3000/fizzbuzz
@RestController
public class FizzBuzzController {

    @GetMapping("/fizzbuzz/{num}")
    public String fizzBuzzPath(@PathVariable int num) {
        return FizzBuzz.staticPlay(num);
    }

    @GetMapping("/fizzbuzz2")
    public String fizzBuzzReqParam(@RequestParam int bar) {
        return FizzBuzz.staticPlay(bar);
    }

}
