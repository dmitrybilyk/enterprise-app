Yarn vs npm: Yarn (faster historically, now similar) uses same package.json 
but own commands (e.g., yarn add react vs npm i react). Yarn supports plugins, 
workspaces better for monorepos. Both integrate identically with Gradle—plugin runs their CLIs.


rm -rf node_modules yarn.lock
yarn cache clean
./gradlew :frontend:yarnInstall

uvicorn departments:app --reload

verdaccio

nano ~/.config/verdaccio/config.yaml

curl -i
-H "Authorization: Bearer YzRhZjMyZjk4NDkzZmViYTIxZmNjYzhmMzJiN2NjNzY6MWY1ZmFlZGUzNmY3NGRlZWJk"
http://localhost:4873/axios

curl -I
-H "Authorization: Bearer YzRhZjMyZjk4NDkzZmViYTIxZmNjYzhmMzJiN2NjNzY6MWY1ZmFlZGUzNmY3NGRlZWJk"
http://localhost:4873/axios/-/axios-1.6.8.tgz

curl
-H "Authorization: Bearer YzRhZjMyZjk4NDkzZmViYTIxZmNjYzhmMzJiN2NjNzY6MWY1ZmFlZGUzNmY3NGRlZWJk"
-o axios.tgz
http://localhost:4873/axios/-/axios-1.6.8.tgz