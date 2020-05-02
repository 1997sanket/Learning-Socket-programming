# Socket-programming

1. Socket is an object, through which connection is established between server and client.    

2. The caller/sender dont need to know his own phone number (IP), but he must know the number of person he is calling.
   Here, he must know the IP address and the PORT number. 
   Eg: When we call an office, we dial a common phone number (IP), but when we connect, lady at the desk asks us 
   "Which department we want to speak to ? and gives us the extension (PORT) to connect to that department.

3. On server side, the telephone (Socket) needs to be connected to the extension, on which it will receive calls.

4. Socket is like a telephone picked up by the receiver.

5. Now from client side to send a message we use *OutputStream*, and on server side to receive the message we use *InputStream*.
   That's it, very simple program :)
 
