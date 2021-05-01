FROM hub.xiaoma.com/base



CMD java -jar /${JAR_NAME}.jar --spring.profiles.active=${PROFILE}