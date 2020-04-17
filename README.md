# AssetBookingSystem
A Spring boot application connected to a MySQL database through JPA and Hibernate. The database contains 2 table's, Assets and Bookings which are connected in a One to Many relationship. The main application uses Spring MVC. 

The main page displays a list of assets with buttons to book the asset or update the asset:

- The bookings page contains information of the asset, previous booking information and a form to fill out for new bookings. When a new booking is made, an email will be sent to the email address given in the form. This uses Spring mail.
- The update asset button will go to a pre populated form to change the assets details.

AspectJ has been added for logging.
