-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2022 at 02:56 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `goodsleep`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `spAddAdmi` (IN `nombre` VARCHAR(30), IN `apellido` VARCHAR(30), IN `celular` CHAR(9), IN `correo` VARCHAR(45), IN `id_empresa` INT)  begin
declare codA char(5);
declare cuenta int;
select right(max(id_admi),4)+1 into cuenta from admi;
set codA=concat('A',Lpad(cuenta,4,'0'));
insert into admi values(codA,nombre ,apellido ,celular ,correo , id_empresa );
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `spAddReserva` (`id_cliente` INT, `fechaInicial` DATE, `fechaFinal` DATE, `codHabitacion` VARCHAR(5), `subtotal` DOUBLE, `codServA` VARCHAR(5), `cant_personas` INT, `precioTotal` DOUBLE, `estado` VARCHAR(20))  begin
declare codR varchar(5);
declare cuenta int;
select right(max(id_reserva),4)+1 into cuenta from reservahabitacion;
set codR=concat('R',Lpad(cuenta,4,'0'));
insert into reservahabitacion values(codR, id_cliente,fechaInicial,fechaFinal,codHabitacion,subtotal,codServA,cant_personas,precioTotal,estado);
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admi`
--

CREATE TABLE `admi` (
  `id_admi` varchar(5) NOT NULL DEFAULT 'A0000',
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `celular` char(9) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `id_empresa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admi`
--

INSERT INTO `admi` (`id_admi`, `nombre`, `apellido`, `celular`, `correo`, `id_empresa`) VALUES
('A0000', 'Danna', 'vila', '999697141', 'u10215589@utp.edu.pe', 1),
('A0001', 'Alonso', 'Nicho', '999697141', 'u19215589@utp.edu.pe', 1);

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `codCategoria` varchar(5) NOT NULL,
  `nombreCat` varchar(30) NOT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`codCategoria`, `nombreCat`, `descripcion`, `precio`) VALUES
('C0001', 'Diamante', 'La categoria mas alta', 600),
('C0002', 'Oro', 'Segunda categoría', 400),
('C0003', 'Plata', 'Tercera categoría', 200);

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `tipoDoc` varchar(30) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `tipoDoc`, `nombre`, `apellido`, `celular`, `correo`) VALUES
(123123, 'DNI', 'FA', 'DANNA', '9898', 'VILA');

-- --------------------------------------------------------

--
-- Table structure for table `empresa`
--

CREATE TABLE `empresa` (
  `id_empresa` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empresa`
--

INSERT INTO `empresa` (`id_empresa`, `nombre`) VALUES
(1, 'Good Sleep');

-- --------------------------------------------------------

--
-- Table structure for table `habitacion`
--

CREATE TABLE `habitacion` (
  `codHabitacion` varchar(5) NOT NULL,
  `codCategoria` varchar(5) NOT NULL,
  `piso` int(11) DEFAULT NULL,
  `id_empresa` int(11) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `habitacion`
--

INSERT INTO `habitacion` (`codHabitacion`, `codCategoria`, `piso`, `id_empresa`, `estado`) VALUES
('D0001', 'C0001', 1, 1, 'DISPONIBLE'),
('D0002', 'C0001', 2, 1, 'DISPONIBLE'),
('P0001', 'C0003', 1, 1, 'DISPONIBLE'),
('P0002', 'C0003', 2, 1, 'DISPONIBLE'),
('R0001', 'C0002', 1, 1, 'DISPONIBLE'),
('R0002', 'C0002', 2, 1, 'DISPONIBLE');

-- --------------------------------------------------------

--
-- Table structure for table `reservahabitacion`
--

CREATE TABLE `reservahabitacion` (
  `id_reserva` varchar(5) NOT NULL DEFAULT '',
  `id_cliente` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFinal` date DEFAULT NULL,
  `codHabitacion` varchar(5) DEFAULT NULL,
  `subTotal` double DEFAULT NULL,
  `codservA` varchar(5) DEFAULT NULL,
  `cant_personas` int(11) DEFAULT NULL,
  `precioTotal` double DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservahabitacion`
--

INSERT INTO `reservahabitacion` (`id_reserva`, `id_cliente`, `fechaInicio`, `fechaFinal`, `codHabitacion`, `subTotal`, `codservA`, `cant_personas`, `precioTotal`, `estado`) VALUES
('R0000', 123123, '0000-00-00', '0000-00-00', 'D0001', 600, 'S0003', 1, 600, 'PAGADO'),
('R0001', 123123, '0000-00-00', '0000-00-00', 'D0001', 600, 'S0003', 1, 600, 'PAGADO'),
('R0002', 123123, '0000-00-00', '0000-00-00', 'D0001', 600, 'S0003', 1, 600, 'PAGADO'),
('R0003', 123123, '2022-04-12', '2022-04-15', 'D0001', 600, 'S0003', 1, 600, 'PAGADO');

-- --------------------------------------------------------

--
-- Table structure for table `servicioadicional`
--

CREATE TABLE `servicioadicional` (
  `codServA` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `servicioadicional`
--

INSERT INTO `servicioadicional` (`codServA`, `descripcion`, `precio`) VALUES
('S0001', 'Transporte al areopuerto', 40),
('S0002', 'Tour Hotel', 50),
('S0003', 'Ninguno', 0);

-- --------------------------------------------------------

--
-- Table structure for table `usuarioadmi`
--

CREATE TABLE `usuarioadmi` (
  `usuario` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_admi` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `usuariocliente`
--

CREATE TABLE `usuariocliente` (
  `usuario` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admi`
--
ALTER TABLE `admi`
  ADD PRIMARY KEY (`id_admi`),
  ADD KEY `id_empresa` (`id_empresa`);

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`codCategoria`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id_empresa`);

--
-- Indexes for table `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`codHabitacion`),
  ADD KEY `codCategoria` (`codCategoria`),
  ADD KEY `id_empresa` (`id_empresa`);

--
-- Indexes for table `reservahabitacion`
--
ALTER TABLE `reservahabitacion`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `codservA` (`codservA`);

--
-- Indexes for table `servicioadicional`
--
ALTER TABLE `servicioadicional`
  ADD PRIMARY KEY (`codServA`);

--
-- Indexes for table `usuarioadmi`
--
ALTER TABLE `usuarioadmi`
  ADD PRIMARY KEY (`usuario`),
  ADD KEY `id_admi` (`id_admi`);

--
-- Indexes for table `usuariocliente`
--
ALTER TABLE `usuariocliente`
  ADD PRIMARY KEY (`usuario`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admi`
--
ALTER TABLE `admi`
  ADD CONSTRAINT `admi_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`);

--
-- Constraints for table `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`codCategoria`) REFERENCES `categoria` (`codCategoria`),
  ADD CONSTRAINT `habitacion_ibfk_2` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`);

--
-- Constraints for table `reservahabitacion`
--
ALTER TABLE `reservahabitacion`
  ADD CONSTRAINT `reservahabitacion_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `reservahabitacion_ibfk_2` FOREIGN KEY (`codservA`) REFERENCES `servicioadicional` (`codServA`);

--
-- Constraints for table `usuarioadmi`
--
ALTER TABLE `usuarioadmi`
  ADD CONSTRAINT `usuarioadmi_ibfk_1` FOREIGN KEY (`id_admi`) REFERENCES `admi` (`id_admi`);

--
-- Constraints for table `usuariocliente`
--
ALTER TABLE `usuariocliente`
  ADD CONSTRAINT `usuariocliente_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
