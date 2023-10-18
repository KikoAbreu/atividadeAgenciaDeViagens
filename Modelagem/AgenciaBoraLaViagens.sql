CREATE DATABASE AgenciaBoraLaViagens;

use AgenciaBoraLaViagens;

CREATE TABLE Cliente 
( 
 IdCliente INT PRIMARY KEY AUTO_INCREMENT,  
 NomeCliente VARCHAR(255) NOT NULL,  
 EmailCliente VARCHAR(255) NOT NULL,
 SenhaCliente VARCHAR(50) NOT NULL,  
 UNIQUE (EmailCliente)
);

CREATE TABLE Destino 
( 
 IdDestino INT PRIMARY KEY AUTO_INCREMENT,  
 NomeDestino  VARCHAR(255) NOT NULL,   
 UNIQUE (NomeDestino)
); 

CREATE TABLE Reserva 
( 
 IdReserva INT PRIMARY KEY AUTO_INCREMENT,  
 DataIda DATE NOT NULL,  
 DataVolta DATE NOT NULL,  
 IdCliente INT NOT NULL,  
 IdDestino INT NOT NULL  
 );

 ALTER TABLE Reserva ADD FOREIGN KEY(IdCliente) REFERENCES Cliente (IdCliente);
ALTER TABLE Reserva ADD FOREIGN KEY(IdDestino) REFERENCES Destino(IdDestino);

