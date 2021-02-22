import zeep
import os
import io
import PIL.Image as Image

wsdl = 'http://localhost:8000/fileService?wsdl'
client = zeep.Client(wsdl=wsdl)
with open("example.jpg", "rb") as image:
  f = image.read()
  b = bytearray(f)

client.service.upload('example.jpg', b)
b_image = client.service.download('server.jpg')
image = Image.open(io.BytesIO(b_image))
image.save("/home/rharuow/Documents/IFRN/DSD/SOAP/Client/downloaded/byServer.jpg")

# import xmlrpclib
# import SOAPpy, getpass, datetime
# import urllib, cStringIO
# from PIL import Image
# from urllib import urlopen 
# import os
# import io
# from array import array
# """ create a proxy object with methods that can be used to invoke
#     corresponding RPC calls on the remote server """
# soapy = SOAPpy.WSDL.Proxy('http://localhost:8000/fileService?wsdl') 

