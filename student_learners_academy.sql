CREATE DATABASE  IF NOT EXISTS `student` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `student`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: student
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `class_mst`
--

DROP TABLE IF EXISTS `class_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class_mst` (
  `Id` bigint NOT NULL,
  `ClassName` varchar(45) NOT NULL,
  `ClassTeacher` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_mst`
--

LOCK TABLES `class_mst` WRITE;
/*!40000 ALTER TABLE `class_mst` DISABLE KEYS */;
INSERT INTO `class_mst` VALUES (1,'Ninth','Rahul Gupta'),(2,'Tenth','Anamika Sharma'),(3,'Eleventh','Rahul Kumar'),(4,'Twelfth','Abhishek Kurup');
/*!40000 ALTER TABLE `class_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_mst`
--

DROP TABLE IF EXISTS `student_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_mst` (
  `StudentId` bigint NOT NULL,
  `FName` varchar(45) DEFAULT NULL,
  `LName` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `class_id` bigint DEFAULT NULL,
  PRIMARY KEY (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_mst`
--

LOCK TABLES `student_mst` WRITE;
/*!40000 ALTER TABLE `student_mst` DISABLE KEYS */;
INSERT INTO `student_mst` VALUES (1,'Ahbi','Ram','Male',1),(2,'Kapil','Sharma','Male',1),(3,'Pooja','Sahu','Female',1),(4,'Bipin','Jha','Male',2),(5,'Jyotika','Mani','Female',2),(6,'Joy','Lobo','Male',2),(7,'Nandhmori','Ramarao','Male',3),(8,'Akhila','Mani','Female',3),(9,'Sunny','Sharma','Male',3),(10,'Abhilasha','Gupta','Female',4),(11,'Kirti','Senone','Female',4),(12,'Deepika','Ravi','Female',4);
/*!40000 ALTER TABLE `student_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_mst`
--

DROP TABLE IF EXISTS `subject_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_mst` (
  `SubId` bigint NOT NULL,
  `SubName` varchar(45) DEFAULT NULL,
  `TeacherName` varchar(45) DEFAULT NULL,
  `ClassName` varchar(45) DEFAULT NULL,
  `teacher_id` bigint DEFAULT NULL,
  `class_id` bigint DEFAULT NULL,
  PRIMARY KEY (`SubId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_mst`
--

LOCK TABLES `subject_mst` WRITE;
/*!40000 ALTER TABLE `subject_mst` DISABLE KEYS */;
INSERT INTO `subject_mst` VALUES (1,'Mathematics','Mr. Rahul Kumar','Ninth',2,1),(2,'English','Mrs. Anamika Sharma','Ninth',4,1),(3,'Hindi','Mr. Rahul Gupta','Ninth',3,1),(4,'Physics','Mr. Rahul Gupta','Eleventh',3,3),(5,'Chemistry','Mr. Rahul Kumar','Eleventh',2,3),(6,'Biology','Mr. Abhishek Kurup','Eleventh',5,3),(7,'Mathematics','Mr. Rahul Kumar','Tenth',2,2),(8,'English','Mrs. Anamika Sharma','Tenth',4,2),(9,'Hindi','Mr. Rahul Gupta','Tenth',3,2),(10,'Physics','Mr. Rahul Gupta','Twelfth',3,4),(11,'Chemistry','Mr. Rahul Kumar','Twelfth',2,4),(12,'Biology','Mr. Abhishek Kurup','Twelfth',5,4),(13,'Advance Mathematics','Mr. Manoj Pesa','Twelfth',1,4),(14,'Advance Mathematics','Mr. Manoj Pesa','Eleventh',1,3);
/*!40000 ALTER TABLE `subject_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_mst`
--

DROP TABLE IF EXISTS `teacher_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher_mst` (
  `TeacherId` bigint NOT NULL AUTO_INCREMENT,
  `TeacherName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TeacherId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_mst`
--

LOCK TABLES `teacher_mst` WRITE;
/*!40000 ALTER TABLE `teacher_mst` DISABLE KEYS */;
INSERT INTO `teacher_mst` VALUES (1,'Mr. Manoj Pesa'),(2,'Mr. Rahul Kumar'),(3,'Mr. Rahul Gupta'),(4,'Mrs. Anamika Sharma'),(5,'Mr. Abhishek Kurup');
/*!40000 ALTER TABLE `teacher_mst` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-14  4:06:29
