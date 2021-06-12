drop database if exists asps;
create database asps;
create user 'asps'@'localhost' identified by 'project'; 

use asps;
drop table if exists camping;
CREATE TABLE camping
(
	campId varchar(3), cname varchar(20), cdesc text, cloc varchar(30),cbank varchar(30),cphone varchar(10), cemail varchar(200), cadd varchar(500), cut text, aquantity int, afield int, 
	acost int,bquantity int, bfield int, bcost int,cquantity int, cfield int, ccost int, image varchar(255), 
	PRIMARY KEY(campId)
) ;
INSERT INTO camping VALUES(
	'AAA','Πάρος Camp', 'Στην Νάουσα της Πάρου βρίσκεται το "Πάρος Camp", ένας οργανωμένος χώρος για camping μόλις 50m από την θάλασσα. Παρέχει υψηλής ποιότητες υπηρεσίες και σας υποδέχεται για ένα αξέχαστο καλοκαίρι.',
	'Πάρος','1000000000000000', '1231231234', 'paros@camp.gr', 'Νικόλαου Στέλλα 12, Νάουσα, 59200','Καφέ-Εστιατόριο, Mini Market, Bar, Ποδήλατα, Ενοικιαζόμενος Εξοπλισμός Camping, Δραστηριότητες για Παιδιά',
	20,5,7,30,6,9,10,15,15,'/images/paros.jpg'
);
INSERT INTO camping VALUES(
	'AAB','Ελαφόνησος Camp', 'Η Ελαφόνησος αποτελεί ιδανικό προορισμό για μικρούς και μεγάλους. Το "Ελαφόνησος Camp" κάνει ακόμη πιο απολαυστική την διαμονή σας, προσφέροντας κάθε άνεση που χρειάζεστε. Βρίσκεται 100m από την χρυσαφένια παραλία Σίμος.',
	'Ελαφόνησος','4565986598653265', '8931231234', 'elafonhsos@camp.gr', 'Παραλία Σίμος','Καφέ-Εστιατόριο, Ενοικιαζόμενος Εξοπλισμός Camping, Ενοικιαζόμενος Εξοπλισμός για water sports',
	15,5,6,10,6,8,5,15,12,'/images/elafonhsos.jpg'
);
INSERT INTO camping VALUES(
	'AAΓ','Φοινικούντας Camp', 'Στην νότια πλευρά του νομού Μεσσηνίας βρίσκεται το γραφικό χωριό της Φοινικούντας, το "Ελαφόνησος camp" απέχει μόλις 2χλμ από αυτό. Η παραλία με τα κρυστάλλινα νερά βρίσκεται σε απόσταση αναπνοής.',
	'Μεσσηνία','4520936598653265', '6501231234', 'foinikountas@camp.gr', 'Φοινικούντα 190, Μεσσηνία,24006', 'Καφέ-Εστιατόριο, Mini Market, Bar, Ποδήλατα, Ενοικιαζόμενος Εξοπλισμός Camping, Ενοικιαζόμενος Εξοπλισμός για water sports',
	30,5,5,20,6,8,20,15,12,'/images/foinikounta.jpg'
);

grant all on asps.* to 'asps'@'localhost';