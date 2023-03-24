-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 24 mars 2023 à 23:54
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
(16, 'Macaroni', 'Mazarine', 'Femme', '1982-06-01', '', '75016', 'Paris', '0118060182'),
(18, 'Ossobucco', 'Omer', 'Homme', '1981-07-03', '', '75018', 'Paris', '0117070381'),
(22, 'Spaghetti', 'Sophie', 'Femme', '1979-09-07', '', '75002', 'Paris', '0115090779'),
(23, 'Tortellini', 'Théodule', 'Homme', NULL, '', '75003', 'Paris', '0114210880'),
(41, 'Pomadoro', 'Pistache', 'Femme', NULL, '', '75001', 'Paris', '0116141178'),
(53, 'Cannelloni', 'Célestine', 'Femme', NULL, '', '75003', 'Paris', '0171737579'),
(57, 'Ravioli', 'Romuald', 'Homme', NULL, '', '75017', 'Paris', '0109210781'),
(63, 'Baccalaõ', 'Brutus', 'Homme', '1979-11-09', '', '75003', 'Paris', '0145464748'),
(64, 'Tortilla', 'Tania', 'Femme', NULL, '', '75004', 'Paris', '0122270181'),
(70, 'Vermicellini', 'Véronique', 'Femme', NULL, '', '75010', 'Paris', '0128220381'),
(71, 'Tagliatelli', 'Thomas', 'Homme', NULL, '', '75011', 'Paris', '0129170482'),
(77, 'Ghappati', 'Gontrand', 'Homme', '1981-12-02', '', '75017', 'Paris', '0135120281'),
(84, 'Busecca', 'Bruce', 'Homme', '1981-11-07', '', '75004', 'Paris', '0187868584'),
(85, 'Carpaccio', 'Clémentine', 'Femme', NULL, '', '75005', 'Paris', '0142130781'),
(87, 'Chipolata', 'Charlotte', 'Femme', NULL, '', '75007', 'Paris', '0144220379'),
(91, 'Broccoli', 'Basile', 'Homme', '1981-02-07', '', '75011', 'Paris', '0176757473'),
(92, 'Farfalle', 'Fernande', 'Femme', NULL, '', '75012', 'Paris', '0148141281'),
(93, 'Lasagne', 'Lazare', 'Homme', NULL, '', '75013', 'Paris', '0149130481'),
(95, 'Risotto', 'Rolande', 'Femme', NULL, '', '75015', 'Paris', '0151170280'),
(96, 'Polenta', 'Paule', 'Femme', NULL, '', '75016', 'Paris', '0152290379'),
(97, 'Tapioca', 'Thérèse', 'Femme', '1980-08-05', '', '75017', 'Paris', '0153080580'),
(100, 'Mozzarella', 'Milène', 'Femme', '1979-09-10', '', '75020', 'Paris', '0156091079'),
(102, 'Caponata', 'Clovis', 'Homme', '1980-07-06', '', '75002', 'Paris', '0158070680'),
(106, 'Clafouti', 'Cornelia', 'Femme', NULL, '', '75006', 'Paris', '0162210281'),
(110, 'Fettucine', 'Félicie', 'Femme', '1981-06-05', '', '75010', 'Paris', '0110060581'),
(111, 'Rigatoni', 'Rita', 'Femme', NULL, '', '75011', 'Paris', '0161280681'),
(112, 'Cappelletti', 'Clémence', 'Femme', '1981-12-10', '', '75012', 'Paris', '0165091011'),
(113, 'Antipasta', 'Amadeus', 'Homme', NULL, '', '75013', 'Paris', '0123242526'),
(114, 'Scaloppine', 'Scarlet', 'Femme', NULL, '', '75014', 'Paris', '0127091283'),
(115, 'Anguilla', 'Amandine', 'Femme', NULL, '', '75015', 'Paris', '0112131415'),
(116, 'Bagnacauda', 'Brigitte', 'Femme', NULL, '', '75016', 'Paris', '0156575859'),
(117, 'Funghi', 'Fiona', 'Femme', NULL, '', '75017', 'Paris', '0187767583'),
(118, 'Melanzane', 'Mélanie', 'Femme', NULL, '', '75018', 'Paris', '0154467985'),
(119, 'Fagioli', 'Ferdinand', 'Homme', NULL, '', '75019', 'Paris', '0189888786'),
(120, 'Vongole', 'Véronica', 'Femme', NULL, '', '75020', 'Paris', '0145464748'),
(121, 'Pesce', 'Pascaline', 'Femme', NULL, '', '75001', 'Paris', '0131323334'),
(122, 'Cozze', 'Charline', 'Femme', NULL, '', '75002', 'Paris', '0117191613'),
(123, 'Stracciatella', 'Sabrina', 'Femme', '1975-05-05', '', '75003', 'Paris', '0131649728'),
(124, 'Minestrone', 'Martina', 'Femme', NULL, '', '75004', 'Paris', '0195969798'),
(125, 'Pavese', 'Pietro', 'Homme', '1979-08-07', '', '75005', 'Paris', '0107080910'),
(126, 'Fonduta', 'Florence', 'Femme', '1979-09-09', '', '75006', 'Paris', '0103050709'),
(127, 'Carozza', 'Cunégonde', 'Femme', NULL, '', '75007', 'Paris', '0105090307'),
(128, 'Calzone', 'Corentin', 'Homme', NULL, '', '75008', 'Paris', '0186848280'),
(129, 'Tortino', 'Terrence', 'Homme', '1980-05-12', '', '75009', 'Paris', '0104070205'),
(130, 'Carciofi', 'Christian', 'Homme', NULL, '', '75010', 'Paris', '0103060908'),
(131, 'Scampi', 'Simone', 'Femme', '1982-01-05', '', '75011', 'Paris', '0104050607'),
(132, 'Limone', 'Léon', 'Homme', '1981-08-09', '', '75012', 'Paris', '0192969498'),
(133, 'Bisi', 'Bénédicte', 'Femme', '1979-07-08', '', '75013', 'Paris', '0165646362'),
(134, 'Uova', 'Ursule', 'Femme', NULL, '', '75014', 'Paris', '0103050709'),
(135, 'Carbonara', 'Camille', 'Femme', '1979-11-10', '', '75015', 'Paris', '0151535759'),
(136, 'Uccelletto', 'Ulla', 'Femme', NULL, '', '75016', 'Paris', '0108060402'),
(137, 'Cavoli', 'Constant', 'Homme', NULL, '', '75017', 'Paris', '0104040404'),
(138, 'Prosciutto', 'Priscilla', 'Femme', NULL, '', '75018', 'Paris', '0151525354'),
(139, 'Peperonata', 'Patricia', 'Femme', '1972-08-05', '', '75019', 'Paris', '0159575553'),
(140, 'Spinaci', 'Steve', 'Homme', '1979-06-04', '', '75020', 'Paris', '0186848280'),
(141, 'Parmigiana', 'Patrick', 'Homme', NULL, '', '75001', 'Paris', '0102050809'),
(142, 'Tegame', 'Thierry', 'Homme', '1976-06-16', '', '75002', 'Paris', '0104060709'),
(143, 'Zucchini', 'Zoé', 'Femme', NULL, '', '75003', 'Paris', '0108070504'),
(144, 'Aragosta', 'Armande', 'Femme', NULL, '', '75004', 'Paris', '0134353637'),
(145, 'Trotelle', 'Teresa', 'Femme', NULL, '', '75005', 'Paris', '0160824281'),
(146, 'Cacciucco', 'Christelle', 'Femme', '1980-09-11', '', '57006', 'Paris', '0197959391'),
(147, 'Ostriche', 'Ornella', 'Femme', NULL, '', '75007', 'Paris', '0194989692'),
(148, 'Triglie', 'Théodule', 'Homme', NULL, '', '75008', 'Paris', '0168646662'),
(149, 'Pollo', 'Polo', 'Homme', NULL, '', '75009', 'Paris', '0174859652'),
(150, 'Cacciatora', 'Carmen', 'Femme', '1979-09-09', '', '75010', 'Paris', '0198979695'),
(151, 'Peperoni', 'Pierre', 'Homme', '1981-11-11', '', '75011', 'Paris', '0197643231'),
(152, 'Vitello', 'Vincent', 'Homme', '1982-12-02', '', '75012', 'Paris', '0189452365'),
(153, 'Cima', 'Céline', 'Femme', NULL, '', '75013', 'Paris', '0131649782'),
(154, 'Polpette', 'Pauline', 'Femme', NULL, '', '75014', 'Paris', '0148592615'),
(155, 'Manzo', 'Marceline', 'Femme', NULL, '', '75015', 'Paris', '0136353433'),
(156, 'Abbacchi', 'Albert', 'Homme', '2022-12-07', '44rue Paulbert', '75018', 'Paris', '102030405'),
(157, 'Vaccinara', 'Valentine', 'Femme', NULL, '', '75017', 'Paris', '0134373895'),
(158, 'hhh', 'hhh', 'Homme', NULL, 'hhh', 'hhh', 'hh', 'hhh'),
(159, 'd', 'd', 'd', '2023-03-14', 'dd', 'd', 'd', 'd'),
(160, 'ggg', 'ggg', 'Homme', NULL, 'g', 'g', 'g', 'g');

-- --------------------------------------------------------

--
-- Structure de la table `identifiant`
--

CREATE TABLE `identifiant` (
  `codeMoniteur` int(11) DEFAULT NULL,
  `codeEleve` int(11) DEFAULT NULL,
  `mail` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `statut` varchar(20) NOT NULL DEFAULT 'eleve'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `identifiant`
--

INSERT INTO `identifiant` (`codeMoniteur`, `codeEleve`, `mail`, `mdp`, `statut`) VALUES
(NULL, 156, 'ab@ab.com', 'ab', 'eleve'),
(11, NULL, 'am@am.com', 'am', 'moniteur'),
(NULL, 8, 'Gnoki@Gnoki.com', 'Gnoki', 'eleve'),
(NULL, NULL, 'admin@admin.com', 'admin', 'admin'),
(NULL, 8, 'Gnoki@Gnoki.com', 'Gnoki', 'eleve'),
(NULL, 16, 'Macaroni@Macaroni.com', 'Macaroni', 'eleve'),
(NULL, 18, 'Ossobucco@Ossobucco.com', 'Ossobucco', 'eleve'),
(NULL, 22, 'Spaghetti@Spaghetti.com', 'Spaghetti', 'eleve'),
(NULL, 23, 'Tortellini@Tortellini.com', 'Tortellini', 'eleve'),
(NULL, 41, 'Pomadoro@Pomadoro.com', 'Pomadoro', 'eleve'),
(NULL, 53, 'Cannelloni@Cannelloni.com', 'Cannelloni', 'eleve'),
(NULL, 57, 'Ravioli@Ravioli.com', 'Ravioli', 'eleve'),
(NULL, 63, 'Baccalaõ@Baccalaõ.com', 'Baccalaõ', 'eleve'),
(NULL, 64, 'Tortilla@Tortilla.com', 'Tortilla', 'eleve'),
(NULL, 70, 'Vermicellini@Vermicellini.com', 'Vermicellini', 'eleve'),
(NULL, 71, 'Tagliatelli@Tagliatelli.com', 'Tagliatelli', 'eleve'),
(NULL, 77, 'Ghappati@Ghappati.com', 'Ghappati', 'eleve'),
(NULL, 84, 'Busecca@Busecca.com', 'Busecca', 'eleve'),
(NULL, 85, 'Carpaccio@Carpaccio.com', 'Carpaccio', 'eleve'),
(NULL, 87, 'Chipolata@Chipolata.com', 'Chipolata', 'eleve'),
(NULL, 91, 'Broccoli@Broccoli.com', 'Broccoli', 'eleve'),
(NULL, 92, 'Farfalle@Farfalle.com', 'Farfalle', 'eleve'),
(NULL, 93, 'Lasagne@Lasagne.com', 'Lasagne', 'eleve'),
(NULL, 95, 'Risotto@Risotto.com', 'Risotto', 'eleve'),
(NULL, 96, 'Polenta@Polenta.com', 'Polenta', 'eleve'),
(NULL, 97, 'Tapioca@Tapioca.com', 'Tapioca', 'eleve'),
(NULL, 100, 'Mozzarella@Mozzarella.com', 'Mozzarella', 'eleve'),
(NULL, 102, 'Caponata@Caponata.com', 'Caponata', 'eleve'),
(NULL, 106, 'Clafouti@Clafouti.com', 'Clafouti', 'eleve'),
(NULL, 110, 'Fettucine@Fettucine.com', 'Fettucine', 'eleve'),
(NULL, 111, 'Rigatoni@Rigatoni.com', 'Rigatoni', 'eleve'),
(NULL, 112, 'Cappelletti@Cappelletti.com', 'Cappelletti', 'eleve'),
(NULL, 113, 'Antipasta@Antipasta.com', 'Antipasta', 'eleve'),
(NULL, 114, 'Scaloppine@Scaloppine.com', 'Scaloppine', 'eleve'),
(NULL, 115, 'Anguilla@Anguilla.com', 'Anguilla', 'eleve'),
(NULL, 116, 'Bagnacauda@Bagnacauda.com', 'Bagnacauda', 'eleve'),
(NULL, 117, 'Funghi@Funghi.com', 'Funghi', 'eleve'),
(NULL, 118, 'Melanzane@Melanzane.com', 'Melanzane', 'eleve'),
(NULL, 119, 'Fagioli@Fagioli.com', 'Fagioli', 'eleve'),
(NULL, 120, 'Vongole@Vongole.com', 'Vongole', 'eleve'),
(NULL, 121, 'Pesce@Pesce.com', 'Pesce', 'eleve'),
(NULL, 122, 'Cozze@Cozze.com', 'Cozze', 'eleve'),
(NULL, 123, 'Stracciatella@Stracciatella.com', 'Stracciatella', 'eleve'),
(NULL, 124, 'Minestrone@Minestrone.com', 'Minestrone', 'eleve'),
(NULL, 125, 'Pavese@Pavese.com', 'Pavese', 'eleve'),
(NULL, 126, 'Fonduta@Fonduta.com', 'Fonduta', 'eleve'),
(NULL, 127, 'Carozza@Carozza.com', 'Carozza', 'eleve'),
(NULL, 128, 'Calzone@Calzone.com', 'Calzone', 'eleve'),
(NULL, 129, 'Tortino@Tortino.com', 'Tortino', 'eleve'),
(NULL, 130, 'Carciofi@Carciofi.com', 'Carciofi', 'eleve'),
(NULL, 131, 'Scampi@Scampi.com', 'Scampi', 'eleve'),
(NULL, 132, 'Limone@Limone.com', 'Limone', 'eleve'),
(NULL, 133, 'Bisi@Bisi.com', 'Bisi', 'eleve'),
(NULL, 134, 'Uova@Uova.com', 'Uova', 'eleve'),
(NULL, 135, 'Carbonara@Carbonara.com', 'Carbonara', 'eleve'),
(NULL, 136, 'Uccelletto@Uccelletto.com', 'Uccelletto', 'eleve'),
(NULL, 137, 'Cavoli@Cavoli.com', 'Cavoli', 'eleve'),
(NULL, 138, 'Prosciutto@Prosciutto.com', 'Prosciutto', 'eleve'),
(NULL, 139, 'Peperonata@Peperonata.com', 'Peperonata', 'eleve'),
(NULL, 140, 'Spinaci@Spinaci.com', 'Spinaci', 'eleve'),
(NULL, 141, 'Parmigiana@Parmigiana.com', 'Parmigiana', 'eleve'),
(NULL, 142, 'Tegame@Tegame.com', 'Tegame', 'eleve'),
(NULL, 143, 'Zucchini@Zucchini.com', 'Zucchini', 'eleve'),
(NULL, 144, 'Aragosta@Aragosta.com', 'Aragosta', 'eleve'),
(NULL, 145, 'Trotelle@Trotelle.com', 'Trotelle', 'eleve'),
(NULL, 146, 'Cacciucco@Cacciucco.com', 'Cacciucco', 'eleve'),
(NULL, 147, 'Ostriche@Ostriche.com', 'Ostriche', 'eleve'),
(NULL, 148, 'Triglie@Triglie.com', 'Triglie', 'eleve'),
(NULL, 149, 'Pollo@Pollo.com', 'Pollo', 'eleve'),
(NULL, 150, 'Cacciatora@Cacciatora.com', 'Cacciatora', 'eleve'),
(NULL, 151, 'Peperoni@Peperoni.com', 'Peperoni', 'eleve'),
(NULL, 152, 'Vitello@Vitello.com', 'Vitello', 'eleve'),
(NULL, 153, 'Cima@Cima.com', 'Cima', 'eleve'),
(NULL, 154, 'Polpette@Polpette.com', 'Polpette', 'eleve'),
(NULL, 155, 'Manzo@Manzo.com', 'Manzo', 'eleve'),
(NULL, 156, 'Abbacchi@Abbacchi.com', 'Abbacchi', 'eleve'),
(NULL, 157, 'Vaccinara@Vaccinara.com', 'Vaccinara', 'eleve'),
(8, NULL, 'Béal@Béal.com', 'Béal', 'moniteur'),
(11, NULL, 'Ambrosi@Ambrosi.com', 'Ambrosi', 'moniteur'),
(14, NULL, 'Catard@Catard.com', 'Catard', 'moniteur'),
(15, NULL, 'Ezard@Ezard.com', 'Ezard', 'moniteur'),
(NULL, NULL, 'a', 'a', 'eleve'),
(NULL, NULL, 'a', 'a', 'eleve'),
(NULL, NULL, 'w', 'w', 'eleve'),
(NULL, 160, 'gggg', 'ggg', 'eleve'),
(NULL, 160, 'gggg', 'ggg', 'eleve');

-- --------------------------------------------------------

--
-- Structure de la table `lecon`
--

CREATE TABLE `lecon` (
  `CodeLecon` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `Heure` varchar(50) DEFAULT '00:00:00',
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
(128, '2020-12-16', '15:00:00', 14, 126, '567 EF 21', 0),
(140, '2023-03-14', '00:00:00', 8, 156, '890 HJ 21', 0),
(141, '2023-03-25', '16h-18h', 8, 156, '890 HJ 21', 0),
(142, '2023-03-29', '12h-14h', 15, 156, '123 AB 21', 0),
(143, '2023-03-01', '15h-18h', 14, 156, '345 CD 21', 0),
(144, '2023-03-02', '8h-10h', 14, 156, '345 CD 21', 0),
(145, '2024-03-29', '15h-18h', 14, 156, '345 CD 21', 0);

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
(10, 11, 2, NULL),
(21, 20, 1, '2023-03-14'),
(23, 22, 1, '2023-03-16');

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
(1, 'Ambrosi', 'Pierre', 'Homme', '1969-01-04', '23, rue du Lycée', '75019', 'Paris', '0180234567'),
(8, 'Béal', 'Géraldine', 'Femme', '1972-01-23', '12, avenue du Collège', '75004', 'Paris', '0180123456'),
(11, 'Ambrosi', 'Pierre', 'Homme', '1969-01-04', '23, rue du Lycée', '75019', 'Paris', '0180234567'),
(14, 'Catard', 'Olivier', 'Homme', '1963-09-12', '34, boulevard de l\'Université', '75005', 'Paris', '0180345677'),
(15, 'Ezard', 'Régine', 'Femme', '1978-04-06', '45, rue des Écoles', '75020', 'Paris', '0180456789');

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
  ADD KEY `CodeCategorie` (`CodeCategorie`),
  ADD KEY `CodeMoniteur_2` (`CodeMoniteur`);

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
-- AUTO_INCREMENT pour la table `eleve`
--
ALTER TABLE `eleve`
  MODIFY `CodeEleve` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=161;

--
-- AUTO_INCREMENT pour la table `lecon`
--
ALTER TABLE `lecon`
  MODIFY `CodeLecon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=146;

--
-- AUTO_INCREMENT pour la table `moniteur`
--
ALTER TABLE `moniteur`
  MODIFY `CodeMoniteur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `identifiant`
--
ALTER TABLE `identifiant`
  ADD CONSTRAINT `identifiant_ibfk_2` FOREIGN KEY (`codeEleve`) REFERENCES `eleve` (`CodeEleve`),
  ADD CONSTRAINT `identifiant_ibfk_3` FOREIGN KEY (`codeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD CONSTRAINT `lecon_ibfk_1` FOREIGN KEY (`CodeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `lecon_ibfk_3` FOREIGN KEY (`Immatriculation`) REFERENCES `vehicule` (`Immatriculation`),
  ADD CONSTRAINT `lecon_ibfk_4` FOREIGN KEY (`CodeEleve`) REFERENCES `eleve` (`CodeEleve`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `licence`
--
ALTER TABLE `licence`
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
