SELECT city.country_id,country,city FROM country
INNER JOIN city ON country.country_id=city.country_id
ORDER BY country_id ASC;

SELECT first_name,last_name,payment_id FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id;

SELECT rental_id,first_name,last_name FROM customer
INNER JOIN rental ON rental.rental_id = customer.customer_id;