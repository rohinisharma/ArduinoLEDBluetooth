#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
  #include <avr/power.h>
#endif
#define PIN 6
#define NUMPIXELS 32
Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, PIN);
char c;
int j=0;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pixels.begin();

}

void loop() {
  
  // put your main code here, to run repeatedly:
  while(Serial.available()){
    c = Serial.read();
    if(c == 'a'){
      for( int i = 0; i<NUMPIXELS; i++){
        pixels.setPixelColor(i, LOW);
   
        pixels.show();
    }   
      
      pixels.setPixelColor(j,pixels.Color(255,255,255));
       pixels.setBrightness(75);
      pixels.show();
      j=j+1;
    }
    if(j == 16){
      j = 0; 
    }
  }

}
