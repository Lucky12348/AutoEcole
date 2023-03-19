-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 02 jan. 2023 à 00:06
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `autoecole`
--

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `affiche_rdv`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `affiche_rdv` (
`Date` date
,`Heure` varchar(50)
,`Nom` varchar(50)
,`Libelle` varchar(50)
,`CodeEleve` int(11)
,`CodeMoniteur` int(11)
);

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `CodeCategorie` int(11) NOT NULL,
  `Libelle` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Prix` double(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`CodeCategorie`, `Libelle`, `Prix`) VALUES
(1, 'Automobile', 34.95),
(2, 'Poids lourd', 43.00),
(3, 'Bateau', 51.25),
(4, 'Moto', 38.15),
(5, 'Transport en commun', 40.50);

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

CREATE TABLE `eleve` (
  `CodeEleve` int(11) NOT NULL,
  `Nom` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Prenom` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Sexe` varchar(10) NOT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` text CHARACTER SET utf8 DEFAULT NULL,
  `CodePostal` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Ville` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Telephone` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `eleve`
--

INSERT INTO `eleve` (`CodeEleve`, `Nom`, `Prenom`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`) VALUES
(8, 'Gnoki', 'Garry', 'Homme', '1992-12-19', '75 rue des lin', '75123', 'Paris', '615141317'),
(16, 'Macaroni', 'Mazarine', '1', '1982-06-01', '', '75016', 'Paris', '0118060182'),
(18, 'Ossobucco', 'Omer', '0', '1981-07-03', '', '75018', 'Paris', '0117070381'),
(22, 'Spaghetti', 'Sophie', '1', '1979-09-07', '', '75002', 'Paris', '0115090779'),
(23, 'Tortellini', 'Théodule', '0', NULL, '', '75003', 'Paris', '0114210880'),
(41, 'Pomadoro', 'Pistache', '1', NULL, '', '75001', 'Paris', '0116141178'),
(53, 'Cannelloni', 'Célestine', '1', NULL, '', '75003', 'Paris', '0171737579'),
(57, 'Ravioli', 'Romuald', '0', NULL, '', '75017', 'Paris', '0109210781'),
(63, 'Baccalaõ', 'Brutus', '0', '1979-11-09', '', '75003', 'Paris', '0145464748'),
(64, 'Tortilla', 'Tania', '1', NULL, '', '75004', 'Paris', '0122270181'),
(70, 'Vermicellini', 'Véronique', '1', NULL, '', '75010', 'Paris', '0128220381'),
(71, 'Tagliatelli', 'Thomas', '0', NULL, '', '75011', 'Paris', '0129170482'),
(77, 'Ghappati', 'Gontrand', '0', '1981-12-02', '', '75017', 'Paris', '0135120281'),
(84, 'Busecca', 'Bruce', '0', '1981-11-07', '', '75004', 'Paris', '0187868584'),
(85, 'Carpaccio', 'Clémentine', '1', NULL, '', '75005', 'Paris', '0142130781'),
(87, 'Chipolata', 'Charlotte', '1', NULL, '', '75007', 'Paris', '0144220379'),
(91, 'Broccoli', 'Basile', '0', '1981-02-07', '', '75011', 'Paris', '0176757473'),
(92, 'Farfalle', 'Fernande', '1', NULL, '', '75012', 'Paris', '0148141281'),
(93, 'Lasagne', 'Lazare', '0', NULL, '', '75013', 'Paris', '0149130481'),
(95, 'Risotto', 'Rolande', '1', NULL, '', '75015', 'Paris', '0151170280'),
(96, 'Polenta', 'Paule', '1', NULL, '', '75016', 'Paris', '0152290379'),
(97, 'Tapioca', 'Thérèse', '1', '1980-08-05', '', '75017', 'Paris', '0153080580'),
(100, 'Mozzarella', 'Milène', '1', '1979-09-10', '', '75020', 'Paris', '0156091079'),
(102, 'Caponata', 'Clovis', '0', '1980-07-06', '', '75002', 'Paris', '0158070680'),
(106, 'Clafouti', 'Cornelia', '1', NULL, '', '75006', 'Paris', '0162210281'),
(110, 'Fettucine', 'Félicie', '1', '1981-06-05', '', '75010', 'Paris', '0110060581'),
(111, 'Rigatoni', 'Rita', '1', NULL, '', '75011', 'Paris', '0161280681'),
(112, 'Cappelletti', 'Clémence', '1', '1981-12-10', '', '75012', 'Paris', '0165091011'),
(113, 'Antipasta', 'Amadeus', '0', NULL, '', '75013', 'Paris', '0123242526'),
(114, 'Scaloppine', 'Scarlet', '1', NULL, '', '75014', 'Paris', '0127091283'),
(115, 'Anguilla', 'Amandine', '1', NULL, '', '75015', 'Paris', '0112131415'),
(116, 'Bagnacauda', 'Brigitte', '1', NULL, '', '75016', 'Paris', '0156575859'),
(117, 'Funghi', 'Fiona', '1', NULL, '', '75017', 'Paris', '0187767583'),
(118, 'Melanzane', 'Mélanie', '1', NULL, '', '75018', 'Paris', '0154467985'),
(119, 'Fagioli', 'Ferdinand', '0', NULL, '', '75019', 'Paris', '0189888786'),
(120, 'Vongole', 'Véronica', '1', NULL, '', '75020', 'Paris', '0145464748'),
(121, 'Pesce', 'Pascaline', '1', NULL, '', '75001', 'Paris', '0131323334'),
(122, 'Cozze', 'Charline', '1', NULL, '', '75002', 'Paris', '0117191613'),
(123, 'Stracciatella', 'Sabrina', '1', '1975-05-05', '', '75003', 'Paris', '0131649728'),
(124, 'Minestrone', 'Martina', '1', NULL, '', '75004', 'Paris', '0195969798'),
(125, 'Pavese', 'Pietro', '0', '1979-08-07', '', '75005', 'Paris', '0107080910'),
(126, 'Fonduta', 'Florence', '1', '1979-09-09', '', '75006', 'Paris', '0103050709'),
(127, 'Carozza', 'Cunégonde', '1', NULL, '', '75007', 'Paris', '0105090307'),
(128, 'Calzone', 'Corentin', '0', NULL, '', '75008', 'Paris', '0186848280'),
(129, 'Tortino', 'Terrence', '0', '1980-05-12', '', '75009', 'Paris', '0104070205'),
(130, 'Carciofi', 'Christian', '0', NULL, '', '75010', 'Paris', '0103060908'),
(131, 'Scampi', 'Simone', '1', '1982-01-05', '', '75011', 'Paris', '0104050607'),
(132, 'Limone', 'Léon', '0', '1981-08-09', '', '75012', 'Paris', '0192969498'),
(133, 'Bisi', 'Bénédicte', '1', '1979-07-08', '', '75013', 'Paris', '0165646362'),
(134, 'Uova', 'Ursule', '1', NULL, '', '75014', 'Paris', '0103050709'),
(135, 'Carbonara', 'Camille', '1', '1979-11-10', '', '75015', 'Paris', '0151535759'),
(136, 'Uccelletto', 'Ulla', '1', NULL, '', '75016', 'Paris', '0108060402'),
(137, 'Cavoli', 'Constant', '0', NULL, '', '75017', 'Paris', '0104040404'),
(138, 'Prosciutto', 'Priscilla', '1', NULL, '', '75018', 'Paris', '0151525354'),
(139, 'Peperonata', 'Patricia', '1', '1972-08-05', '', '75019', 'Paris', '0159575553'),
(140, 'Spinaci', 'Steve', '0', '1979-06-04', '', '75020', 'Paris', '0186848280'),
(141, 'Parmigiana', 'Patrick', '0', NULL, '', '75001', 'Paris', '0102050809'),
(142, 'Tegame', 'Thierry', '0', '1976-06-16', '', '75002', 'Paris', '0104060709'),
(143, 'Zucchini', 'Zoé', '1', NULL, '', '75003', 'Paris', '0108070504'),
(144, 'Aragosta', 'Armande', '1', NULL, '', '75004', 'Paris', '0134353637'),
(145, 'Trotelle', 'Teresa', '1', NULL, '', '75005', 'Paris', '0160824281'),
(146, 'Cacciucco', 'Christelle', '1', '1980-09-11', '', '57006', 'Paris', '0197959391'),
(147, 'Ostriche', 'Ornella', '1', NULL, '', '75007', 'Paris', '0194989692'),
(148, 'Triglie', 'Théodule', '0', NULL, '', '75008', 'Paris', '0168646662'),
(149, 'Pollo', 'Polo', '0', NULL, '', '75009', 'Paris', '0174859652'),
(150, 'Cacciatora', 'Carmen', '1', '1979-09-09', '', '75010', 'Paris', '0198979695'),
(151, 'Peperoni', 'Pierre', '0', '1981-11-11', '', '75011', 'Paris', '0197643231'),
(152, 'Vitello', 'Vincent', '0', '1982-12-02', '', '75012', 'Paris', '0189452365'),
(153, 'Cima', 'Céline', '1', NULL, '', '75013', 'Paris', '0131649782'),
(154, 'Polpette', 'Pauline', '1', NULL, '', '75014', 'Paris', '0148592615'),
(155, 'Manzo', 'Marceline', '1', NULL, '', '75015', 'Paris', '0136353433'),
(156, 'Abbacchi', 'Albert', 'Homme', '2022-12-07', '44rue Paulbert', '75018', 'Paris', '102030405'),
(157, 'Vaccinara', 'Valentine', '1', NULL, '', '75017', 'Paris', '0134373895');

-- --------------------------------------------------------

--
-- Structure de la table `identifiant`
--

CREATE TABLE `identifiant` (
  `codeMoniteur` int(11) DEFAULT NULL,
  `codeEleve` int(11) DEFAULT NULL,
  `mail` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `statut` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `identifiant`
--

INSERT INTO `identifiant` (`codeMoniteur`, `codeEleve`, `mail`, `mdp`, `statut`) VALUES
(NULL, 156, 'ab@ab.com', 'ab', 'eleve'),
(11, NULL, 'am@am.com', 'am', 'moniteur'),
(NULL, 8, 'gno@gno.fr', 'gno', 'eleve');

-- --------------------------------------------------------

--
-- Structure de la table `lecon`
--

CREATE TABLE `lecon` (
  `CodeLecon` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `Heure` varchar(50) DEFAULT NULL,
  `CodeMoniteur` int(11) DEFAULT NULL,
  `CodeEleve` int(11) DEFAULT NULL,
  `Immatriculation` varchar(50) DEFAULT NULL,
  `Reglee` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lecon`
--

INSERT INTO `lecon` (`CodeLecon`, `Date`, `Heure`, `CodeMoniteur`, `CodeEleve`, `Immatriculation`, `Reglee`) VALUES
(8, '2016-08-23', '10:00:00', 11, 22, '123 AB 21', 1),
(9, '2016-07-23', '10:00:00', 11, 63, '234 BC 21', 1),
(10, '2015-12-24', '10:00:00', 11, 63, '234 BC 21', 1),
(11, '2016-06-07', '10:00:00', 11, 63, '234 BC 21', 1),
(16, '2016-09-05', '10:00:00', 14, 156, '789 GH 21', 0),
(17, '2016-04-03', '10:00:00', 14, 156, '789 GH 21', 1),
(18, '2016-03-31', '10:00:00', 14, 113, '789 GH 21', 1),
(19, '2016-07-16', '10:00:00', 14, 113, '789 GH 21', 1),
(20, '2016-07-12', '10:00:00', 14, 113, '789 GH 21', 1),
(21, '2016-08-28', '10:00:00', 8, 113, '234 BC 21', 1),
(22, '2015-12-29', '10:00:00', 8, 8, '234 BC 21', 1),
(23, '2016-01-02', '10:00:00', 8, 16, '234 BC 21', 1),
(24, '2016-09-22', '10:00:00', 11, 22, '456 DE 21', 1),
(25, '2016-01-30', '10:00:00', 14, 23, '345 CD 21', 1),
(26, '2016-04-09', '10:00:00', 8, 18, '234 BC 21', 1),
(27, '2016-08-01', '10:00:00', 11, 8, '234 BC 21', 1),
(28, '2016-02-14', '10:00:00', 14, 16, '234 BC 21', 1),
(29, '2016-01-16', '10:00:00', 11, 23, '234 BC 21', 1),
(30, '2016-01-12', '10:00:00', 8, 53, '234 BC 21', 1),
(31, '2016-08-09', '10:00:00', 11, 22, '234 BC 21', 1),
(32, '2016-04-02', '10:00:00', 8, 8, '234 BC 21', 1),
(33, '2016-08-25', '10:00:00', 8, 8, '234 BC 21', 1),
(34, '2016-02-06', '10:00:00', 8, 8, '234 BC 21', 1),
(35, '2016-03-29', '10:00:00', 8, 8, '234 BC 21', 1),
(36, '2015-12-25', '10:00:00', 8, 8, '234 BC 21', 1),
(37, '2016-02-06', '10:00:00', 8, 8, '234 BC 21', 1),
(38, '2016-08-16', '10:00:00', 11, 8, '234 BC 21', 1),
(39, '2016-05-20', '10:00:00', 14, 16, '345 CD 21', 1),
(40, '2016-08-08', '10:00:00', 14, 53, '456 DE 21', 1),
(41, '2016-07-06', '10:00:00', 14, 18, '456 DE 21', 1),
(42, '2016-02-01', '10:00:00', 11, 148, '567 EF 21', 1),
(43, '2015-12-09', '10:00:00', 11, 57, '234 BC 21', 1),
(44, '2016-07-13', '10:00:00', 14, 71, '456 DE 21', 1),
(45, '2016-04-30', '10:00:00', 14, 71, '456 DE 21', 1),
(46, '2015-12-22', '10:00:00', 14, 71, '456 DE 21', 1),
(47, '2016-08-23', '10:00:00', 14, 71, '456 DE 21', 1),
(48, '2016-06-05', '10:00:00', 14, 71, '456 DE 21', 1),
(49, '2016-05-02', '10:00:00', 8, 116, '234 BC 21', 1),
(50, '2016-08-27', '10:00:00', 8, 96, '234 BC 21', 1),
(51, '2016-01-21', '10:00:00', 14, 41, '345 CD 21', 1),
(52, '2016-01-09', '10:00:00', 11, 115, '345 CD 21', 1),
(53, '2016-04-20', '10:00:00', 14, 128, '789 GH 21', 1),
(54, '2016-01-24', '10:00:00', 14, 128, '789 GH 21', 1),
(56, '2016-06-10', '10:00:00', 11, 148, '567 EF 21', 1),
(57, '2016-07-11', '10:00:00', 11, 148, '567 EF 21', 1),
(58, '2016-09-08', '10:00:00', 8, 85, '890 HJ 21', 1),
(59, '2016-08-07', '10:00:00', 8, 145, '890 HJ 21', 1),
(60, '2016-02-09', '10:00:00', 11, 8, '456 DE 21', 1),
(61, '2016-06-07', '10:00:00', 11, 8, '234 BC 21', 1),
(62, '2016-01-14', '10:00:00', 11, 157, '678 FG 21', 1),
(63, '2016-08-10', '10:00:00', 11, 157, '678 FG 21', 1),
(64, '2016-07-29', '10:00:00', 11, 157, '678 FG 21', 1),
(65, '2016-06-24', '10:00:00', 11, 157, '678 FG 21', 1),
(66, '2016-04-12', '10:00:00', 14, 157, '678 FG 21', 1),
(67, '2016-08-10', '10:00:00', 11, 132, '123 AB 21', 1),
(68, '2016-03-25', '10:00:00', 14, 8, '234 BC 21', 1),
(69, '2016-07-14', '10:00:00', 15, 16, '345 CD 21', 1),
(73, '2016-03-27', '10:00:00', 15, 8, '123 AB 21', 1),
(74, '2016-02-19', '10:00:00', 15, 8, '123 AB 21', 1),
(75, '2016-07-29', '10:00:00', 11, 8, '123 AB 21', 1),
(76, '2016-02-01', '10:00:00', 14, 16, '234 BC 21', 1),
(77, '2016-03-10', '10:00:00', 15, 18, '345 CD 21', 1),
(79, '2016-01-19', '10:00:00', 14, 8, '234 BC 21', 1),
(80, '2016-07-04', '10:00:00', 15, 16, '345 CD 21', 1),
(81, '2016-04-03', '10:00:00', 11, 8, '123 AB 21', 1),
(85, '2016-01-11', '10:00:00', 14, 16, '234 BC 21', 1),
(86, '2016-04-29', '10:00:00', 15, 18, '345 CD 21', 1),
(87, '2016-07-06', '10:00:00', 11, 8, '123 AB 21', 1),
(88, '2016-06-16', '10:00:00', 14, 16, '234 BC 21', 1),
(89, '2016-02-02', '10:00:00', 15, 18, '345 CD 21', 1),
(90, '2016-08-23', '10:00:00', 15, 18, '789 GH 21', 0),
(91, '2016-08-22', '10:00:00', 14, 18, '567 EF 21', 0),
(92, '2017-09-02', '13:56:00', 11, 63, '456 DE 21', 0),
(93, '2017-09-02', '13:58:00', 11, 129, '345 CD 21', 0),
(94, '2017-09-02', '14:00:00', 11, 64, '345 CD 21', 0),
(95, '2017-09-02', '14:09:00', 14, 64, '678 FG 21', 0),
(96, '2017-09-02', '15:00:00', 11, 70, '678 FG 21', 0),
(97, '2017-09-02', '14:13:00', 14, 84, '234 BC 21', 0),
(98, '2017-11-17', '09:15:00', 15, 156, '890 HJ 21', 0),
(99, '2017-08-23', '10:00:00', 8, 23, '567 EF 21', 0),
(100, '2017-09-02', '14:19:00', 11, 16, '567 EF 21', 0),
(101, '2017-09-02', '14:20:00', 14, 123, '345 CD 21', 0),
(102, '2017-09-02', '14:23:00', 14, 8, '456 DE 21', 0),
(103, '2017-09-02', '14:26:00', 11, 141, '456 DE 21', 0),
(104, '2017-09-02', '14:28:00', 8, 16, '345 CD 21', 0),
(105, '2017-09-02', '14:29:00', 11, 16, '456 DE 21', 0),
(106, '2017-09-02', '14:30:00', 14, 77, '345 CD 21', 0),
(107, '2017-09-02', '14:36:00', 14, 16, '234 BC 21', 0),
(108, '2017-09-02', '14:40:00', 14, 16, '234 BC 21', 0),
(109, '2017-09-05', '14:43:00', 11, 8, '456 DE 21', 0),
(110, '2017-09-02', '08:46:00', 11, 8, '345 CD 21', 0),
(111, '2017-09-05', '11:47:00', 8, 16, '345 CD 21', 0),
(112, '2017-09-02', '15:03:00', 11, 8, '456 DE 21', 0),
(113, '2017-09-29', '18:07:00', 11, 16, '234 BC 21', 0),
(114, '2017-11-14', '02:10:00', 11, 128, '789 GH 21', 0),
(115, '2017-09-02', '18:16:00', 11, 8, '345 CD 21', 0),
(116, '2017-09-02', '13:17:00', 11, 8, '345 CD 21', 0),
(117, '2017-11-02', '13:26:00', 11, 131, '345 CD 21', 0),
(118, '2015-11-11', '02:09:00', 15, 57, '789 GH 21', 0),
(119, '2020-09-09', '18:28:00', 11, 53, '456 DE 21', 0),
(120, '2017-09-22', '08:00:00', 8, 23, '567 EF 21', 0),
(121, '2017-09-22', '16:48:00', 11, 16, '345 CD 21', 0),
(122, '2017-09-22', '02:00:00', 11, 53, '567 EF 21', 0),
(123, '2017-09-27', '08:00:00', 14, 64, '678 FG 21', 0),
(124, '2018-08-17', '09:02:00', 11, 102, '456 DE 21', 0),
(125, '2020-06-24', '11:00:00', 14, 64, '789 GH 21', 0),
(126, '2020-12-16', '14:00:00', 14, 16, '345 CD 21', 0),
(127, '2020-12-16', '14:00:00', 15, 8, '678 FG 21', 0),
(128, '2020-12-16', '15:00:00', 14, 126, '567 EF 21', 0);

-- --------------------------------------------------------

--
-- Structure de la table `licence`
--

CREATE TABLE `licence` (
  `CodeLicence` int(11) NOT NULL,
  `CodeMoniteur` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL,
  `DateObtention` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `licence`
--

INSERT INTO `licence` (`CodeLicence`, `CodeMoniteur`, `CodeCategorie`, `DateObtention`) VALUES
(1, 11, 1, NULL),
(2, 11, 4, NULL),
(3, 11, 5, NULL),
(4, 8, 3, NULL),
(5, 14, 1, NULL),
(6, 14, 2, NULL),
(7, 14, 5, NULL),
(8, 15, 1, NULL),
(9, 15, 3, NULL),
(10, 11, 2, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `moniteur`
--

CREATE TABLE `moniteur` (
  `CodeMoniteur` int(11) NOT NULL,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `Sexe` varchar(10) DEFAULT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `CodePostal` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `moniteur`
--

INSERT INTO `moniteur` (`CodeMoniteur`, `Nom`, `Prenom`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`) VALUES
(8, 'Béal', 'Géraldine', '1', '1972-01-23', '12, avenue du Collège', '75004', 'Paris', '0180123456'),
(11, 'Ambrosi', 'Pierre', '2', '1969-01-04', '23, rue du Lycée', '75019', 'Paris', '0180234567'),
(14, 'Catard', 'Olivier', '2', '1963-09-12', '34, boulevard de l\'Université', '75005', 'Paris', '0180345677'),
(15, 'Ezard', 'Régine', '1', '1978-04-06', '45, rue des Écoles', '75020', 'Paris', '0180456789');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

CREATE TABLE `vehicule` (
  `Immatriculation` varchar(50) NOT NULL,
  `Marque` varchar(50) DEFAULT NULL,
  `Modele` varchar(50) DEFAULT NULL,
  `Annee` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vehicule`
--

INSERT INTO `vehicule` (`Immatriculation`, `Marque`, `Modele`, `Annee`, `CodeCategorie`) VALUES
('123 AB 21', 'Mercedes', 'Spania', 2000, 1),
('234 BC 21', 'Peugeot', 'Sisancys', 1996, 1),
('345 CD 21', 'Renault', 'Morgane', 1995, 1),
('456 DE 21', 'Peugeot', 'Catsansys', 1999, 1),
('567 EF 21', 'Kawasaki', 'Zephyr', 1997, 4),
('678 FG 21', 'Renault', 'Betton', 1999, 5),
('789 GH 21', 'Iveco', 'Roader', 1998, 2),
('890 HJ 21', 'Oceansea', 'Tempest', 1999, 3);

-- --------------------------------------------------------

--
-- Structure de la vue `affiche_rdv`
--
DROP TABLE IF EXISTS `affiche_rdv`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `affiche_rdv`  AS SELECT `lecon`.`Date` AS `Date`, `lecon`.`Heure` AS `Heure`, `moniteur`.`Nom` AS `Nom`, `categorie`.`Libelle` AS `Libelle`, `eleve`.`CodeEleve` AS `CodeEleve`, `moniteur`.`CodeMoniteur` AS `CodeMoniteur` FROM ((((`lecon` join `eleve` on(`lecon`.`CodeEleve` = `eleve`.`CodeEleve`)) join `moniteur` on(`lecon`.`CodeMoniteur` = `moniteur`.`CodeMoniteur`)) join `vehicule` on(`lecon`.`Immatriculation` = `vehicule`.`Immatriculation`)) join `categorie` on(`vehicule`.`CodeCategorie` = `categorie`.`CodeCategorie`))  ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`CodeCategorie`);

--
-- Index pour la table `eleve`
--
ALTER TABLE `eleve`
  ADD PRIMARY KEY (`CodeEleve`);

--
-- Index pour la table `identifiant`
--
ALTER TABLE `identifiant`
  ADD KEY `CodeMoniteur` (`codeMoniteur`),
  ADD KEY `CodeEleve` (`codeEleve`);

--
-- Index pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD PRIMARY KEY (`CodeLecon`),
  ADD KEY `CodeMoniteur` (`CodeMoniteur`),
  ADD KEY `CodeEleve` (`CodeEleve`),
  ADD KEY `Immatriculation` (`Immatriculation`);

--
-- Index pour la table `licence`
--
ALTER TABLE `licence`
  ADD PRIMARY KEY (`CodeLicence`),
  ADD KEY `CodeMoniteur` (`CodeMoniteur`,`CodeCategorie`),
  ADD KEY `CodeCategorie` (`CodeCategorie`);

--
-- Index pour la table `moniteur`
--
ALTER TABLE `moniteur`
  ADD PRIMARY KEY (`CodeMoniteur`);

--
-- Index pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`Immatriculation`),
  ADD KEY `CodeCategorie` (`CodeCategorie`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `lecon`
--
ALTER TABLE `lecon`
  MODIFY `CodeLecon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=135;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `identifiant`
--
ALTER TABLE `identifiant`
  ADD CONSTRAINT `identifiant_ibfk_1` FOREIGN KEY (`codeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `identifiant_ibfk_2` FOREIGN KEY (`codeEleve`) REFERENCES `eleve` (`CodeEleve`);

--
-- Contraintes pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD CONSTRAINT `lecon_ibfk_1` FOREIGN KEY (`CodeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `lecon_ibfk_2` FOREIGN KEY (`CodeEleve`) REFERENCES `eleve` (`CodeEleve`),
  ADD CONSTRAINT `lecon_ibfk_3` FOREIGN KEY (`Immatriculation`) REFERENCES `vehicule` (`Immatriculation`);

--
-- Contraintes pour la table `licence`
--
ALTER TABLE `licence`
  ADD CONSTRAINT `licence_ibfk_1` FOREIGN KEY (`CodeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `licence_ibfk_2` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`);

--
-- Contraintes pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD CONSTRAINT `vehicule_ibfk_1` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
