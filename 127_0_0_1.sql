-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 02, 2020 at 11:11 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mmt_garages`
--
CREATE DATABASE IF NOT EXISTS `mmt_garages` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `mmt_garages`;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_Code` int(255) NOT NULL,
  `Customer_Name` varchar(80) NOT NULL,
  `CNIC_Number` varchar(80) NOT NULL,
  `Date_of_Birth` varchar(10) NOT NULL,
  `Gender` varchar(80) NOT NULL,
  `Phone_Number` varchar(80) NOT NULL,
  `Email_Address` varchar(80) NOT NULL,
  `Car_Name` varchar(80) NOT NULL,
  `Car_Model` varchar(80) NOT NULL,
  `Car_Registration_Number` varchar(80) NOT NULL,
  `Address` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_Code`, `Customer_Name`, `CNIC_Number`, `Date_of_Birth`, `Gender`, `Phone_Number`, `Email_Address`, `Car_Name`, `Car_Model`, `Car_Registration_Number`, `Address`) VALUES
(9, 'Manish Tambe', '123', '2003-01-01', 'male', '9371089365', 'tambemanish1@gmail.com', 'Tata Tiago', 'XM', 'MH12NE7680', 'Shaniwar Peth,Pune-411030'),
(11, 'Chinmay Beldar', '567', '2002-03-10', 'male', '9370183965', 'chimaybeldar@gmail.com', ' Tata Nano', 'XE', 'MH12RS1256', 'chalisgaov Vidharbh'),
(12, 'Prasad Labade', '789', '2002-11-06', 'male', '9370183695', 'digitalchamp2016@gmail.com', ' Maruti Aulto', 'XZ', 'MH12TR16786', 'Panvel Mumbai'),
(13, 'Atharv Natu', '980', '2002-12-07', 'male', '9370813695', 'atharvnatu@gmail.com', ' Maruti Celerio', 'XT', 'MH12SD1458', 'Suncity Pune'),
(15, 'Manasi Tambe', '989', '1997-08-03', 'Female', '9833456778', 'mmt0897@gmail.com', 'Tata Tiago', 'XZ', 'MH12NJ9870', '512,Shaniwar Peth,Pune-411030'),
(18, 'Piyush Patil', '089', '2002-06-12', 'male', '9370876695', 'piyushpatil@gmail.com', ' Maruti Brizza', 'XE', 'MH12TR4185', 'Ambegaov Pune'),
(19, 'Omkar Edgovker', '501', '2003-01-07', 'Male', '9800789007', 'omkaredgaovker@gmail.com', 'Maruti Eco', 'XL', 'MH12NJ8901', 'Sadashiv peth,Pune-411030'),
(21, 'Anuj Bhuwad', '813', '2002-01-04', 'Male', '7699060892', 'anujbhuwad2@gmail.com', 'Ford', 'Icon', 'MH12NK0134', 'Sadhashiv Peth,Pune-51231');

-- --------------------------------------------------------

--
-- Table structure for table `detail`
--

CREATE TABLE `detail` (
  `Car_Code` int(255) NOT NULL,
  `Car_Name` varchar(50) NOT NULL,
  `Car_Model` varchar(50) NOT NULL,
  `Registration_Number` varchar(50) NOT NULL,
  `Date_of_Entry` varchar(50) NOT NULL,
  `Time_of_Entry` time NOT NULL,
  `Owner_Name` varchar(50) NOT NULL,
  `Owner_CNIC_Number` varchar(50) NOT NULL,
  `Car_Color` varchar(50) NOT NULL,
  `Extra_Details` varchar(50) NOT NULL,
  `Exiting_Time` time DEFAULT NULL,
  `Exiting_Date` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail`
--

INSERT INTO `detail` (`Car_Code`, `Car_Name`, `Car_Model`, `Registration_Number`, `Date_of_Entry`, `Time_of_Entry`, `Owner_Name`, `Owner_CNIC_Number`, `Car_Color`, `Extra_Details`, `Exiting_Time`, `Exiting_Date`) VALUES
(1, 'Hundai i20', 'Asta', 'MH12NH8901', '2020-07-06', '12:40:06', 'Abhiraj Londhe', '1243', 'Silver', '', '12:47:11', '2020-07-06'),
(2, 'Tata Tiago', 'XM', 'MH12NE7680', '2020-07-06', '12:49:55', 'Manish Tambe', '1234', 'Silver', '', '01:42:27', '2020-07-09'),
(3, 'Maruti Aulto', 'LS', 'MH47JH1290', '2020-07-06', '13:08:00', 'Prasad Labade', '5671', 'Silver', '', '13:09:00', '2020-07-06'),
(4, 'Maruti Eco', 'XL', 'MH12NJ8901', '2020-07-07', '19:25:58', 'Omkar Edgaoker', '501', 'Silver', '', '19:39:11', '2020-07-08'),
(5, 'BMW', 'X1', 'MH12HG1000', '2020-07-10', '17:50:38', 'Anuj Bhuwad', '700', 'Black', '', '17:51:45', '2020-07-10'),
(6, 'Ford', 'Icon', 'MH12HG1000', '2020-08-24', '21:48:10', 'Anuj Bhuwad', '700', 'Gray', '', '21:53:23', '2020-08-24');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Employee_Code` int(255) NOT NULL,
  `Employee_Name` varchar(50) NOT NULL,
  `CNIC_Number` varchar(50) NOT NULL,
  `Designation` varchar(50) NOT NULL,
  `Date_of_Birth` date NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Phone_Number` varchar(50) NOT NULL,
  `Email_Address` varchar(50) NOT NULL,
  `Date_of_Joining` date NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Extra_Detail` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Employee_Code`, `Employee_Name`, `CNIC_Number`, `Designation`, `Date_of_Birth`, `Gender`, `Phone_Number`, `Email_Address`, `Date_of_Joining`, `Address`, `Extra_Detail`) VALUES
(1, 'Manish Tambe', '123', 'Denting Painting', '2003-01-01', 'Male', '9371089365', 'tambemanish1@gmail.com', '2020-07-02', 'Shaniwar Peth,Pune-411030', ''),
(2, 'Prasad Labade', '3421', 'Manager', '2002-12-06', 'Male', '9822427889', 'digitalchamp2016@gmail.com', '2020-07-03', 'Panavel,Mumbai', '');

-- --------------------------------------------------------

--
-- Table structure for table `recept`
--

CREATE TABLE `recept` (
  `Car_Code` int(255) NOT NULL,
  `Sr_No` int(255) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Price` int(255) NOT NULL,
  `Machine_Fee` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `Item_Code` int(11) NOT NULL,
  `Item_Name` varchar(50) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Quantity` int(255) NOT NULL,
  `Buying_Price` int(255) NOT NULL,
  `Selling_Price` int(255) NOT NULL,
  `Car_Name` varchar(50) NOT NULL,
  `Time_Of_Entry` time NOT NULL,
  `Date_Of_Entry` varchar(50) NOT NULL,
  `Warranty` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`Item_Code`, `Item_Name`, `Category`, `Quantity`, `Buying_Price`, `Selling_Price`, `Car_Name`, `Time_Of_Entry`, `Date_Of_Entry`, `Warranty`) VALUES
(1, 'AC', 'Air Conditioning System', 16, 6000, 7000, 'Tata', '14:31:37', '2020-07-05', ''),
(2, '6 Mirrors Pack', 'Body Parts', 29, 18000, 20000, 'Tata', '14:32:27', '2020-07-05', ''),
(3, 'Side Mirror', 'Body Parts', 9, 1200, 1300, 'Hundai', '14:33:08', '2020-07-05', ''),
(4, 'Spoiler', 'Door and Windows', 17, 1000, 2000, 'Hundai', '14:34:22', '2020-07-05', ''),
(5, 'Grills', 'Body Parts', 27, 6000, 7000, 'Maruti Suzuki', '14:35:36', '2020-07-05', ''),
(6, 'Speaker', 'Door and Windows', 24, 7000, 8000, 'Fiat', '14:36:14', '2020-07-05', ''),
(7, 'NOS', 'Engine Parts', 18, 89000, 90000, 'BMW', '14:37:08', '2020-07-05', ''),
(8, 'Body Kit', 'Modification Parts', 9, 70000, 90000, 'Audi', '14:37:49', '2020-07-05', ''),
(9, 'Flasher Lights', 'Door and Windows', 18, 8000, 9000, 'Honda', '14:39:01', '2020-07-05', 'Yes');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_Code`),
  ADD UNIQUE KEY `CNIC_Number` (`CNIC_Number`),
  ADD UNIQUE KEY `Phone_Number` (`Phone_Number`),
  ADD UNIQUE KEY `Email_Address` (`Email_Address`),
  ADD UNIQUE KEY `Car_Registration_Number` (`Car_Registration_Number`);

--
-- Indexes for table `detail`
--
ALTER TABLE `detail`
  ADD PRIMARY KEY (`Car_Code`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Employee_Code`),
  ADD UNIQUE KEY `CNIC_Number` (`CNIC_Number`,`Phone_Number`,`Email_Address`);

--
-- Indexes for table `recept`
--
ALTER TABLE `recept`
  ADD PRIMARY KEY (`Sr_No`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`Item_Code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Customer_Code` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `detail`
--
ALTER TABLE `detail`
  MODIFY `Car_Code` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `Employee_Code` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `recept`
--
ALTER TABLE `recept`
  MODIFY `Sr_No` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `Item_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Database: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Table structure for table `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Table structure for table `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin DEFAULT NULL,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Table structure for table `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Table structure for table `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Table structure for table `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Table structure for table `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp(),
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Table structure for table `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Dumping data for table `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"recharge\",\"table\":\"finalpay\"},{\"db\":\"recharge\",\"table\":\"login\"},{\"db\":\"recharge\",\"table\":\"ragister\"},{\"db\":\"recharge\",\"table\":\"pay\"},{\"db\":\"mmt_garages\",\"table\":\"detail\"},{\"db\":\"mmt_garages\",\"table\":\"customer\"},{\"db\":\"mmt_garages\",\"table\":\"stock\"},{\"db\":\"vcustomer\",\"table\":\"customer\"},{\"db\":\"mmt_garages\",\"table\":\"recept\"}]');

-- --------------------------------------------------------

--
-- Table structure for table `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Table structure for table `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT 0,
  `x` float UNSIGNED NOT NULL DEFAULT 0,
  `y` float UNSIGNED NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

--
-- Dumping data for table `pma__table_uiprefs`
--

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'recharge', 'finalpay', '{\"sorted_col\":\"`finalpay`.`Amount`  ASC\"}', '2020-09-01 08:03:03'),
('root', 'recharge', 'ragister', '[]', '2020-08-31 08:03:15');

-- --------------------------------------------------------

--
-- Table structure for table `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin DEFAULT NULL,
  `data_sql` longtext COLLATE utf8_bin DEFAULT NULL,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Dumping data for table `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2020-09-02 09:10:52', '{\"Console\\/Mode\":\"collapse\"}');

-- --------------------------------------------------------

--
-- Table structure for table `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Table structure for table `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indexes for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indexes for table `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indexes for table `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indexes for table `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indexes for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indexes for table `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indexes for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indexes for table `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indexes for table `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indexes for table `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indexes for table `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indexes for table `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indexes for table `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Database: `recharge`
--
CREATE DATABASE IF NOT EXISTS `recharge` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `recharge`;

-- --------------------------------------------------------

--
-- Table structure for table `finalpay`
--

CREATE TABLE `finalpay` (
  `Transaction_Time` time DEFAULT NULL,
  `Transaction_Date` varchar(20) DEFAULT NULL,
  `Mobile_No` varchar(10) NOT NULL,
  `Service_Provider` varchar(20) DEFAULT NULL,
  `Amount` int(11) NOT NULL,
  `Plan` varchar(11) DEFAULT NULL,
  `card_number` varchar(16) NOT NULL,
  `cvv` varchar(3) NOT NULL,
  `card_date` varchar(11) NOT NULL,
  `type_card` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `finalpay`
--

INSERT INTO `finalpay` (`Transaction_Time`, `Transaction_Date`, `Mobile_No`, `Service_Provider`, `Amount`, `Plan`, `card_number`, `cvv`, `card_date`, `type_card`) VALUES
('06:47:27', '2020-09-02', '9371089365', 'Idea', 6000, 'PrePaid', '1234567812345678', '123', '1030-01-01', 'Mastercard');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(6) NOT NULL,
  `Password` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('Admin', '0000');

-- --------------------------------------------------------

--
-- Table structure for table `ragister`
--

CREATE TABLE `ragister` (
  `No` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `States` varchar(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `Email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ragister`
--

INSERT INTO `ragister` (`No`, `Name`, `Gender`, `States`, `Address`, `Mobile`, `Email`) VALUES
(1, 'Manish Tambe', 'Male', 'Maharastra', 'pune', '9371089365', 't6ambemanish1@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `finalpay`
--
ALTER TABLE `finalpay`
  ADD PRIMARY KEY (`Mobile_No`),
  ADD UNIQUE KEY `Mobile_No` (`Mobile_No`,`card_number`,`cvv`,`type_card`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`),
  ADD UNIQUE KEY `Username` (`Username`,`Password`),
  ADD UNIQUE KEY `Username_2` (`Username`,`Password`);

--
-- Indexes for table `ragister`
--
ALTER TABLE `ragister`
  ADD PRIMARY KEY (`No`),
  ADD UNIQUE KEY `Mobile` (`Mobile`,`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ragister`
--
ALTER TABLE `ragister`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
--
-- Database: `vcustomer`
--
CREATE DATABASE IF NOT EXISTS `vcustomer` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vcustomer`;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(20) NOT NULL,
  `rollno` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `rollno`) VALUES
('Manish', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
