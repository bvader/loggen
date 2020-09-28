
# scheduler

A simple Spring Boot non-interactive application to generate logs 

```
git clone https://github.com/bvader/loggen.git
cd loggen
./mvnw clean package -Dmaven.test.skip=true
cf push
```

You can run with local ELK stack as well.
`./run-w-apm.sh`
