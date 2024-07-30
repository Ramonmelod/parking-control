# Parking Control Java API

<div>
<img src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="java logo" width="200" height="auto">
<img src="https://user-images.githubusercontent.com/25181517/117201470-f6d56780-adec-11eb-8f7c-e70e376cfd07.png" alt="Spring logo" width="200" height="auto">
</div>
<img src="https://user-images.githubusercontent.com/25181517/117208740-bfb78400-adf5-11eb-97bb-09072b6bedfc.png" alt="postgresql logo" width="300" height="auto">

## Used technologies:

- `Spring`
- `Postgresql`

## Informations:

- This project is under construction.

## Description:

- Implemetantion of an API of Parking Control

## Get Started

- Downloand this application with the command:

```sh
git clone https://github.com/Ramonmelod/parking-control.git
```

- With docker run the command bellow to start a postgresql container:

```sh
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=local_password postgres:16.1-alpine3.19

```

- Using the postgresql client `psql`, that can be downloaded using apt in ubuntu, run the command to access the database running in the container:

```sh
psql --host=localhost --username=postgres --port=5432

```

- Now from the database run the command below to create the database that will be used by this applications:

```sql
CREATE DATABASE parking_control_db;

```

- Exit the dpostgres for to enter in the database created using the command:

```sh
psql --host=localhost --username=postgres --port=5432 -d parking_control_db
```

- You can make a post in the endpoint `http://localhost:8080/parking-spot`. If you wish use the following Json:

```json
{
  "parkingSpotNumber": "2058",
  "licensePlateCar": "RRS8562",
  "brandCar": "audi",
  "modelCar": "95",
  "colorCar": "black",
  "responsibleName": "Carlos Daniel",
  "apartament": "285",
  "block": "B"
}
```

- You can delete the inserted value by the post above with the command below:

```sql
DELETE FROM TB_PARKING_SPOT WHERE license_plate_car = 'RRS8562';
```
