SELECT city.city_id,city,country FROM country
LEFT JOIN city ON country.country_id = city.city_id;

SELECT first_name,last_name,payment_id FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.payment_id;

SELECT rental_id,first_name,last_name FROM customer
FULL JOIN rental ON customer.customer_id = rental.rental_id;