# anz-email
## Air New Zealand Email Assessment


The 3 apis that were completed are:
- Retrieve the contents of the users inbox - ```GET localhost:8080/v1/email/```
- write a draft mail and save it for later - ```PUT localhost:8080/v1/email/```
- 
The incomplete ones are
- send an email
- retrieve contents of a single email
- update the contents of one or more email

The postman collection has been included in the commit for functionally testing the apis. This is under ```src/test/resources```.

I used basic auth as a means in which this api could be used by multiple users. Currently it's making use of an in memory store which is storing only 1 user. However, If a db is implemented, we could validate each user and query the emails for each of the specific users