using Twilio.TwiML;


class Example
{
    static void Main()
    {
        var response = new VoiceResponse();
        var gather = new Gather(input: "speech dtmf", numDigits: 1, timeout: 3);
        gather.Say("Please press 1 or say sales for sales.");
        response.Gather(gather);

        System.Console.WriteLine(response.ToString());
    }
}
