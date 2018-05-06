from firebase import firebase
import RPi.GPIO as GPIO



GPIO.setmode(GPIO.BCM)
GPIO.setup(18, GPIO.OUT)
GPIO.setup(19, GPIO.OUT)
GPIO.setup(20, GPIO.OUT)

GPIO.setwarnings(False)





firebase = firebase.FirebaseApplication('https://automation-47434.firebaseio.com/')

while(1):

    

    light1 = firebase.get('/Switch1',None)
    print(light1)

    light2 = firebase.get('/Switch2',None)
    print(light2)
      
    light3 = firebase.get('/Switch3',None)
    print(light3)


    if(light1=="0"):
        GPIO.output(18, GPIO.LOW)

    else:
        GPIO.output(18, GPIO.HIGH)
        

    if(light2=="0"):
        GPIO.output(19, GPIO.LOW)
    
    else:
        GPIO.output(19, GPIO.HIGH)


    if(light3=="0"):
        GPIO.output(20, GPIO.LOW)    

    else:
        GPIO.output(20, GPIO.HIGH)
    print("Hello World")
    

