Travel Agency Application with Java 17 and Spring Boot.


You can put your database credentials in the application-dev.yml file. I used PostgreSQL. 

Base url : http://localhost:8090/v1

- Full fledged registration and login system
- Proper validation for each form
- Status Create, Update (With Public and Private Privacy).
- Location Master Data
- JWT 
- Global Exception Handling
- Added a test case. not covered all test cases here. 


## API Details

> Base Endpoint: http://localhost:8090/v1

> Location API

1. Location > Create
METHOD       :  Post
URI          :  /api/location
Req. Ex.     : {base}/api/location

Request Body Sample
{
   "name"  : "Izmir",
   "active": true
}


2. Location > Get All Active
METHOD     : Get
URI        : /api/location/getAll/active?page=0&pageSize=100
Req. Ex.   : {base}/api/getAll/active?page=0&pageSize=100

3. Location > Get All Inactive
METHOD     : Get
URI        : /api/location/getAll/inactive?page=0&pageSize=100
Req. Ex.   : {base}/api/location/getAll/inactive?page=0&pageSize=100

4. Location > Get By ID
METHOD     : GET
URI        : /api/location/get/{id}
Req. Ex.   : {base}/api/location/get/1

5. Location > Update
METHOD     : PUT
URI        : /api/location
Req. Ex.   : {base}/api/location

6. Location > Get Dropdown Data
METHOD      : Get
URI         : /api/location/getAll/active/dropdown
Req. Ex.    : {base}/api/location/getAll/active/dropdown

7. Location > Exists by name
METHOD      : Get
URI         : /api/location/exists/byName?name=name
Req. Ex.    : {base}/api/location/exists/byName?name=name


> Status API
1. Status > Create
METHOD       :  Post
URI          :  /api/status
Req. Ex.     : {base}/api/status

Request Body Sample
{
   "name"  : "Completed",
   "havePrivacy": true,
   "locationId": 1,
   "userId": 1
}


2. Status > Get All Active
METHOD     : Get
URI        : /api/status/getAll?page=0&pageSize=100
Req. Ex.   : {base}/api/status/getAll?page=0&pageSize=100


4. Status > Get By ID
METHOD     : GET
URI        : /api/status/get/{id}
Req. Ex.   : {base}/api/status/get/1

5. Status > Update

METHOD     : PUT
URI        : /api/status
Req. Ex.   : {base}/api/status

> User API

1. User > Exists by UserId
METHOD      : Get
URI         : /api/user/exists/byUserId?userId=1
Req. Ex.    : {base}/api/user/exists/byUserId?userId=1

2. User > Exists by Email
METHOD      : Get
URI         : /api/user/exists/byEmail?email=ilkmuratt@gmail.com
Req. Ex.    : {base}/api/user/exists/byEmail?email=ilkmuratt@gmail.com


> Auth API
1. Auth > SignIn
METHOD       :  Post
URI          :  /api/auth/signIn
Req. Ex.     : {base}/api/auth/signIn

Request Body Sample
{
   "name"  : "Completed",
   "havePrivacy": true,
   "locationId": 1,
   "userId": 1
}

2. Auth > SignUp
METHOD       :  Post
URI          :  /api/auth/singUp
Req. Ex.     : {base}/api/auth/signUp

Request Body Sample
{
   "name"  : "Completed",
   "havePrivacy": true,
   "locationId": 1,
   "userId": 1
}
