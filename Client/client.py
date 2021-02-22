import zeep
import os
import io
import PIL.Image as Image
import pathlib

wsdl = 'http://localhost:8000/fileService?wsdl'
client = zeep.Client(wsdl=wsdl)
with open("static/clientImage.jpg", "rb") as image:
  f = image.read()
  b = bytearray(f)

client.service.upload('clientImage.jpg', b)
b_image = client.service.download('server.jpg')
image = Image.open(io.BytesIO(b_image))
image.save(f'{pathlib.Path(__file__).parent.absolute()}/downloaded/byServer.jpg')
