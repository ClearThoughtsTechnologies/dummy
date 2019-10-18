This project provides API specification and an implementation with dummy static data. This is the phase-1 and it will be continuously developed.
The API specification is following OpenAPI-3.0.0 standard and depicted in APISpecification.yaml file. The APIs are written in Swagger editor (editor.swagger.io). One can import this file to the editor and get a pretified view.
The Spring project is directly downloaded from swagger editor and modified with the response code. Any one can run the project :
Go inside spring-server-generated folder. Run the following command.
./mvnw spring-boot:run
You will get some exception in command prompt while running this project. Dont worry. That is because of a Swagger defect. I can remove that exception, but became lazy.

The purpose of this API specification is to finalize the contract between UI and backend. The generated project will help UI developer with the API available live with dummy data. The backend can be developed with its own business logic parallely while UI development will not be stuck as backend is not ready.

To see the the available API and its contract
	- You can see the YAML file.
	- Run the spring boot project at your localhost. Open url localhost:8080/v1 in your browser. You can see all available API and its input output format. You can play with those API from the browser itself.

To access the API URL from outside like PostMan or Javascript code, make sure that the Request header contain the content-type:application/json header along with that. Otherwise you may get 501-Not implemented error.