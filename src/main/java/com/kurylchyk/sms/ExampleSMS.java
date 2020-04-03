package com.kurylchyk.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    public static final String ACCOUNT_SID = "ACb700d3613d6c6ed106d7d3ad3a691181";
    public static final String AUTH_TOKEN = "e7a3bea1f5754ca21b639c1194533e9e";


    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber("+380931092589"),
                new PhoneNumber("+15059089424"),str).create();

    }

}
