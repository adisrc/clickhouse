1. Pull clickhouse using this command:
docker run -d --name clickhouse-server \
  -p 8123:8123 \
  -p 9000:9000 \
  -p 9009:9009 \
  clickhouse/clickhouse-server

test using: docker exec -it clickhouse-server clickhouse-client

2. Run ingestion backend using
cd ingestion-backend
mvn clean install
./mvnw spring-boot:run 

3. cd your-react-app
npm install
npm start

4. Flat File → ClickHouse
Frontend:

Choose "Flat File" as source

Upload CSV or select local file

Choose delimiter (,, |, etc.)

Select target ClickHouse table

Select columns

Click Ingest

Backend:

Reads CSV using Java I/O

Maps selected columns

Inserts into ClickHouse using JDBC

ClickHouse → Flat File
Frontend:

Choose "ClickHouse" as source

Enter host, port, DB, user, JWT token

Click Connect

Select table

Select columns

Click Export

Backend:

Authenticates via JWT

Fetches data using selected columns

Saves as CSV/TSV locally

Step 5: Directory Structure
Example folder structure:

bash
Copy
Edit
