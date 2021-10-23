##Sample Application: Todo
Based on Springboot - Application name: kube-poc
About Application	
1. Simple CRUD application  (crete, list, delete services)
2. Database: Postgres DB configured (Connects via service name, username & password generated)
3. Steps:
	Update the Postgres password in the application properties file. Get the postgres password from the Kubernetes secrets.
	Do the gradle build
	Do the docker build (docker build . -t kube-poc)
	Prepare the helm chart (cd deploy/helm, helm install web-stack ./web-stack-chart)


##Database: Postgres Operator
1. Install the Postgres via postgres operator
2. Deploy the Postgres cluster https://github.com/zalando/postgres-operator/blob/master/docs/quickstart.md#deployment-options
3. Postgres DB runs with default user name and random password

## Run Kubernetes locally (Windows)
1. Install Docker for Desktop
2. Install the Kubernetes Dashboard (accessed via Kubeproxy, secrets). Access the dashboard by running kubeproxy.
3. Install the Postgres DB cluster via operator
4. Helm install sample application # kube-tutorial

## Prerequetie
1. Make Kubernetes cluster up and running (For windows Docker for Desktop)
2. Make sure kubectl installed
3. Make sure helm installed
