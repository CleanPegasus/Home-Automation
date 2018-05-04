from firebase import firebase
import RPi.GPIO as GPIO



GPIO.setmode(GPIO.BCM)
GPIO.setup(18, GPIO.OUT)






firebase = firebase.FirebaseApplication('https://automation-47434.firebaseio.com/')

while(1):

    light1 = firebase.get('/Button2',None)
    

    light2 = firebase.get('/Button3',None)
    
      
    light3 = firebase.get('/Button4',None)


    if(light1==0):
        GPIO.output(18, GPIO.LOW)

    else:
        GPIO.output(18, GPIO.HIGH)
        

    if(light2==0):
        GPIO.output(19, GPIO.LOW)
    
    else:
        GPIO.output(19, GPIO.HIGH)


    if(light3==0):
        GPIO.output(20, GPIO.LOW)    

    else:
        GPIO.output(20, GPIO.HIGH)
    print("Hello World")
    

