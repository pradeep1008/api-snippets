import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.Say;
import com.twilio.twiml.Sms;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.Method;


public class Example {
    public static void main(String[] args) {
        Say say = new Say.Builder("Our store is located at 123 Easy St.")
            .build();
        Sms sms = new Sms.Builder("Store Location: 123 Easy St.")
            .action("/smsHandler.php").method(Method.POST).build();
        VoiceResponse response = new VoiceResponse.Builder().say(say).sms(sms)
            .build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
