-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2017 at 05:48 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_db`
--

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `fmarks`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `fmarks` ()  BEGIN
DECLARE total int;
DECLARE usid varchar(10);
DECLARE DONE INT DEFAULT FALSE;
declare c cursor for 
  SELECT marks1 + marks2 + marks3 as total, usn FROM marks WHERE finalmarks is null for update;
  DECLARE CONTINUE HANDLER for NOT FOUND SET DONE=TRUE;
  open c;
MYLOOP:
  LOOP
  fetch c into total,usid;
  if DONE then 
   LEAVE MYLOOP; 
  end if;
   update marks set finalmarks=total where usn=usid ;
end LOOP;
close c;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE `marks` (
  `marks1` int(11) DEFAULT NULL,
  `marks2` int(11) DEFAULT NULL,
  `marks3` int(11) DEFAULT NULL,
  `finalmarks` int(11) DEFAULT NULL,
  `pid` int(11) NOT NULL,
  `teacher_id` varchar(5) NOT NULL,
  `usn` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`marks1`, `marks2`, `marks3`, `finalmarks`, `pid`, `teacher_id`, `usn`) VALUES
(10, 26, 60, 96, 101, '10000', '1sg15cs072'),
(10, 25, 60, 95, 101, '10000', '1sg15cs073');

--
-- Triggers `marks`
--
DROP TRIGGER IF EXISTS `markstrig`;
DELIMITER $$
CREATE TRIGGER `markstrig` BEFORE INSERT ON `marks` FOR EACH ROW BEGIN
    IF (NEW.marks1 > 10) THEN 
        SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Warning: marks1 > 10!';
   END IF;
   IF (NEW.marks2 > 30) THEN 
        SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Warning: marks2 > 30!';
   END IF;
   IF (NEW.marks3 > 60) THEN 
        SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Warning: marks3 > 60!';
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `pid` int(11) NOT NULL,
  `pname` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`pid`, `pname`) VALUES
(101, 'project mgmt sys');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `usn` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `sphone` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `st_mail` varchar(30) DEFAULT NULL,
  `tm_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`usn`, `name`, `dob`, `sphone`, `address`, `st_mail`, `tm_id`) VALUES
('1sg15cs072', 'prashant', '1995-10-20', '8217347833', 'bangalore	', 'prashant@gmail.com', 1001),
('1sg15cs073', 'pratik', '1995-11-18', '8217824920', 'bangalore', 'pratikkkr@gmail.com', 1001);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` varchar(5) NOT NULL,
  `tname` varchar(20) DEFAULT NULL,
  `tphone` varchar(10) DEFAULT NULL,
  `t_mail` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacher_id`, `tname`, `tphone`, `t_mail`) VALUES
('10000', 'veena k r', '99999', 'veena@sce.edu.in');

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `tm_id` int(11) NOT NULL,
  `tm_name` varchar(20) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `teacher_id` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`tm_id`, `tm_name`, `pid`, `teacher_id`) VALUES
(1001, '101pms', 101, '10000');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
CREATE TABLE `userdetails` (
  `user_name` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`user_name`, `password`) VALUES
('veena', 'veena');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`pid`,`teacher_id`,`usn`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`usn`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacher_id`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`tm_id`),
  ADD UNIQUE KEY `tm_id` (`tm_id`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`user_name`),
  ADD UNIQUE KEY `user_name` (`user_name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
