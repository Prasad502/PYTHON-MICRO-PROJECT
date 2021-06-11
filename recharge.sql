-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2021 at 08:04 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recharge`
--

-- --------------------------------------------------------

--
-- Table structure for table `finalpay`
--

CREATE TABLE `finalpay` (
  `Transaction_Time` varchar(20) DEFAULT NULL,
  `Transaction_Date` varchar(20) DEFAULT NULL,
  `Mobile_No` varchar(10) NOT NULL,
  `Service_Provider` varchar(20) DEFAULT NULL,
  `Amount` int(20) DEFAULT NULL,
  `Plan` varchar(20) DEFAULT NULL,
  `card_number` varchar(16) DEFAULT NULL,
  `cvv` varchar(20) DEFAULT NULL,
  `card_date` varchar(20) DEFAULT NULL,
  `type_card` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `finalpay`
--

INSERT INTO `finalpay` (`Transaction_Time`, `Transaction_Date`, `Mobile_No`, `Service_Provider`, `Amount`, `Plan`, `card_number`, `cvv`, `card_date`, `type_card`) VALUES
('15:06:05', '2021-06-04', '9511652981', 'Jio', 4000, 'Prepaid', '1234567893698521', '123', '02/21', 'Visa');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('pras', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `ragister`
--

CREATE TABLE `ragister` (
  `Name` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `States` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Mobile` int(11) NOT NULL,
  `Email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ragister`
--

INSERT INTO `ragister` (`Name`, `Gender`, `States`, `Address`, `Mobile`, `Email`) VALUES
('pras', 'MALE', 'Uttar Pradesh', '1234567890', 0, 'asdawd@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `finalpay`
--
ALTER TABLE `finalpay`
  ADD PRIMARY KEY (`Mobile_No`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `ragister`
--
ALTER TABLE `ragister`
  ADD PRIMARY KEY (`Mobile`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
