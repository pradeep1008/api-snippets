# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "AC32a3c49700934481addd5ce1659f04d2"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

credential = client.sip.credentials("CL32a3c49700934481addd5ce1659f04d2").update("SC32a3c49700934481addd5ce1659f04d2", password="07")
print credential.username