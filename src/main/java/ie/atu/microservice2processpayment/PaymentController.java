package ie.atu.microservice2processpayment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    public String makePayment(Person person)
    {
        return "You called Microservice 2 - Got Person";
    }

}
