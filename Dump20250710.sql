-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: grade_system
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grades` (
  `grade_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `grade` float DEFAULT NULL,
  PRIMARY KEY (`grade_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `grades_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grades`
--

LOCK TABLES `grades` WRITE;
/*!40000 ALTER TABLE `grades` DISABLE KEYS */;
INSERT INTO `grades` VALUES (1,101,'Java',85.5),(2,101,'DBMS',91),(3,102,'Networks',77),(4,201,'Java',85.5),(5,201,'DBMS',91),(6,202,'Networks',77),(7,202,'Microprocessors',68.5),(8,203,'Thermodynamics',74),(9,203,'Mechanics',81.5),(10,204,'Structures',88),(11,204,'Surveying',92.5),(12,1,'Java',85.5),(13,1,'DBMS',91),(14,2,'Networks',77),(15,2,'Microprocessors',68.5),(16,3,'Thermodynamics',74),(17,3,'Mechanics',81.5),(18,4,'Structures',88),(19,4,'Surveying',92.5),(20,5,' DBMS',90);
/*!40000 ALTER TABLE `grades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `student_id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `course` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'ABC','Computer Science'),(2,'KLM','Electrical'),(3,'DEF','Mechanical'),(4,'XYZ','Civil'),(5,'PQR',' DBMS'),(101,'Alice','Computer Science'),(102,'Bob','Electrical'),(201,'Alice','Computer Science'),(202,'Bob','Electrical'),(203,'Charlie','Mechanical'),(204,'Diana','Civil');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-10 20:10:47
