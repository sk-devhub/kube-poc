Sample Application: Todo
	- Based on Springboot - Application name: kube-poc
	- About Application	
		- Simple CRUD application  (crete, list, delete services)
		- Database: Postgres DB configured (Connects via service name, username & password generated)

	Steps:
		- Update the Postgres password in the application properties file.
			- Get the postgres password from the Kubernetes secrets.
		- Do the gradle build
		- Do the docker build
			docker build . -t kube-poc
		- Prepare the helm chart

Database: Postgres Operator
	- Install the Postgres via postgres operator
	- Deploy the Postgres cluster 
		- https://github.com/zalando/postgres-operator/blob/master/docs/quickstart.md#deployment-options
	- Postgres DB runs with default user name and random password

Run Kubernetes locally (Windows)
	- Install Docker for Desktop
	- Install the Kubernetes Dashboard (accessed via Kubeproxy, secrets)
		- Access the dashboard by running kubeproxy.
	- Install the Postgres DB cluster via operator
	- Helm install sample application 
