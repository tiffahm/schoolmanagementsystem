sudo docker build --tag sms ./
sudo docker stop smsapp
sudo docker rm smsapp
sudo docker run -d -p6000:6000 --name smsapp --network hackaio-net sms