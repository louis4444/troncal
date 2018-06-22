-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 22-06-2018 a las 05:23:59
-- Versión del servidor: 5.7.22
-- Versión de PHP: 7.1.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `id` int(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`id`, `nombre`, `contraseña`) VALUES
(1, 'luis', 'maikol');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Id` int(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Id`, `nombre`, `apellidos`, `direccion`, `correo`) VALUES
(1, 'luis miguel', 'martinez', 'urb wtobello', 'lmm6p@hotmail.com'),
(3, 'John', 'Cena', 'huhuh sw', 'huhuh@hotmail.com'),
(4, 'hugen', 'marikus', 'furenh Buh', 'lmmu@hotmail.com'),
(5, 'suprama', 'mkikm', 'Gfrngun', 'juuhhh'),
(7, 'heg', 'heg', 'eff', 'jeej'),
(8, 'dsfsdf', 'sdfsfdsdf', 'sdfsdfsdf', 'sdfsdfs'),
(9, 'sdfsdfsd', 'sdfsdfs', 'sdfsdfsd', 'sdfsfs'),
(10, 'sdada', 'sdaas', 'asdasd', 'dasdsad'),
(11, 'asdasd', 'asdasdas', 'asdasdasd', 'dasdasd'),
(12, 'asdasdasd', 'sadfff', 'asfff', 'safasf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordenadores`
--

CREATE TABLE `ordenadores` (
  `idpc` int(20) NOT NULL,
  `processador` varchar(30) NOT NULL,
  `placa` varchar(30) NOT NULL,
  `fuente` varchar(30) NOT NULL,
  `ram` varchar(30) NOT NULL,
  `tarjeta_grafica` varchar(30) NOT NULL,
  `discoduro` varchar(30) NOT NULL,
  `caja` varchar(30) NOT NULL,
  `montador` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ordenadores`
--

INSERT INTO `ordenadores` (`idpc`, `processador`, `placa`, `fuente`, `ram`, `tarjeta_grafica`, `discoduro`, `caja`, `montador`) VALUES
(1, 'amd9000', 'amdplaca2000', 'fuente600', 'ram12gb', 'gtx2000', 'ssd250gb', 'noxium25', 'msi'),
(2, 'i9000', 'i900intel', 'nox600w', 'ram8gb', 'gtx1800', 'ssd120gb', 'noxium35', 'alienware');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `ordenadores`
--
ALTER TABLE `ordenadores`
  ADD PRIMARY KEY (`idpc`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administradores`
--
ALTER TABLE `administradores`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `ordenadores`
--
ALTER TABLE `ordenadores`
  MODIFY `idpc` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
