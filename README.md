# kube-tutorial
## Prerequetie
1. Make Kubernetes cluster up and running
2. Make sure kubectl installed
3. Make sure helm installed
4. Install Kubernetes Postgres Operator as mentioned below
https://github.com/zalando/postgres-operator/blob/master/docs/quickstart.md#deployment-options

# Helm Deploy
cd deploy/helm
helm install web-stack ./web-stack-chart
