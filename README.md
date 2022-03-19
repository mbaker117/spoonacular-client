# spoonacular-client
# Spoonacular Client
## Mohammed Baker

This is a spring boot project, it has two controllers:
- Spoonacular Recipe Conrtoller
- Recipes Controller

## How to run?

- Change the apiKey from the local-properties to  a vaild Spoonacular Api Key.
- No need to change the base Url.
- Run the Java application
- Access the swagger by using the following link (http://localhost:8082/swagger-ui/)
- Try the endpoints


## Deign Overview
### Controllers
- Spoonacular Recipe Conrtoller
- Recipes Controller
### Services
 There are three services in the system:
  - API Service which is responsible to call any third-party api.
  - Spoonacular Recipe Serivce which is the client for the spoonacular api.
  - Recipe Serivice which contains the required services.
 
## Exception
Creating a custom chceked exception for the system which is:
- SpoonacularException
The exception has custom type which will be used to determine the exception that occurs in any service. 

## Some Notes
- Since the search api has around 80 params, I've created a bean that has will the params and used it in the service. This will help if we want to add more params in the endpoint. For now I'm using the query param only.
- For the total calories calculation, I've found three ways to calculate it:
  - Using the includeNutrients param, the endpoint will retrive the nutrition and as mentioned in the documentation, we can multiply the value with the seving which will give us the total calories.
  - The second way, which is requried in the task, by calculting the calories for each ingeridents and retreive the total. For this approach we can use two ways:
    - First one by using the ingredents in the recipe.
    - Second which is the third way, is by using the ingredents api. However, this approach is not recommended.

## Lessons
- It was the first time that I deal with a huge and dynamic data, like the search api it can retrieve a lot of data depends on the params. 
- How to apply make the system flexiable to any enhancements in the future. 
- Mock test since, it was the second time that I wrote a mock test.
- How to determine that the right approch for the service.
- Find alternative solutions even if the solution is not recommended.
 



