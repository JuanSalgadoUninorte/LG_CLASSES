-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2023 a las 05:43:01
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lg_classes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `class_01`
--

CREATE TABLE `class_01` (
  `id` int(11) NOT NULL,
  `StudentID` varchar(11) NOT NULL,
  `EnglishGrade` float NOT NULL,
  `SQLGrade` float NOT NULL,
  `JavaGrade` float NOT NULL,
  `MathGrade` float NOT NULL,
  `ClassCode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `class_01`
--

INSERT INTO `class_01` (`id`, `StudentID`, `EnglishGrade`, `SQLGrade`, `JavaGrade`, `MathGrade`, `ClassCode`) VALUES
(1, 'STD1', 79, 91, 94, 86, 1),
(2, 'STD2', 59, 81, 67, 79, 1),
(3, 'STD3', 88, 79, 87, 85, 1),
(4, 'STD4', 89, 93, 90, 75, 1),
(5, 'STD1', 89, 93, 90, 75, 2),
(6, 'STD2', 80, 78, 67, 73, 2),
(7, 'STD3', 88, 92, 89, 74, 2),
(8, 'STD4', 75, 75, 70, 80, 2),
(9, 'STD5', 75, 80, 80, 80, 2),
(10, 'STD6', 85, 80, 80, 85, 2),
(11, 'STD7', 85, 90, 90, 90, 2),
(12, 'STD8', 100, 100, 100, 100, 2),
(13, 'STD9', 85, 80, 80, 75, 2),
(14, 'STD10', 79, 81, 59, 67, 2),
(15, 'STD11', 68, 72, 65, 75, 2),
(16, 'STD12', 90, 93, 75, 89, 2),
(17, 'STD5', 99.01, 99.01, 99.01, 99.01, 1),
(18, 'STD1', 78.9, 100, 45.98, 12.09, 7),
(19, 'STD1', 19, 19, 19, 18, 19),
(20, 'STD1', 18, 18, 18, 10000, 17),
(21, 'STD1', 1234, 1234, 1234, 1234, 90);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `class_01`
--
ALTER TABLE `class_01`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `class_01`
--
ALTER TABLE `class_01`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
