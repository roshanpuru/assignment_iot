# Note: 
1. Security is not implemented but one can use basic authentication or oAuth2.0 JWT token based authentication.
2. For testing various test cases can be written i.e. Junit, Integration, e2e test cases.

# Build & Run
1. Build the jar and run it via command line.
2. API EndPoint:
    http://<Host>:<Port>/rewards/user/{name}/month/{month}
    month is inetger [1-12]

# Data (Embedded Database)
    1. Data can be prepared by modifying src/main/resources/data.sql file