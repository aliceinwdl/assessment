-- Drop tables if they exist
DROP TABLE IF EXISTS lottery CASCADE;
DROP TABLE IF EXISTS user_ticket CASCADE;
DROP TABLE IF EXISTS user_profile CASCADE;

CREATE TABLE lottery (
    id SERIAL PRIMARY KEY,
    ticket_id VARCHAR(10) UNIQUE NOT NULL,
    ticket_price numeric(10,2) NOT NULL,
    ticket_amount numeric(10,2) NOT NULL
);

CREATE TABLE user_profile (
    id SERIAL PRIMARY KEY,
    user_id VARCHAR(10) UNIQUE NOT NULL,
    user_name VARCHAR(255) NOT NULL
);

CREATE TABLE user_ticket (
    id SERIAL PRIMARY KEY,
    user_id VARCHAR(10) REFERENCES user_profile(user_id) ON DELETE CASCADE,
    ticket_id VARCHAR(10) NOT NULL,
    ticket_price numeric(10,2) NOT NULL,
    ticket_amount numeric(10,2) NOT NULL
);



-- Initial data
INSERT INTO user_profile (user_id, user_name) VALUES('1234567890', 'Wanida');
INSERT INTO user_profile (user_id, user_name) VALUES('0123456789', 'User Test');

INSERT INTO lottery(ticket_id, ticket_price, ticket_amount) VALUES('000001', 80, 1);
INSERT INTO lottery(ticket_id, ticket_price, ticket_amount) VALUES('000002', 80, 1);
INSERT INTO lottery(ticket_id, ticket_price, ticket_amount) VALUES('000003', 80, 1);
INSERT INTO lottery(ticket_id, ticket_price, ticket_amount) VALUES('000004', 80, 1);
INSERT INTO lottery(ticket_id, ticket_price, ticket_amount) VALUES('000005', 80, 1);


-- Initial data
--INSERT INTO profile(email, name) VALUES('sample@email.com', 'John Doe');

--INSERT INTO wallet(wallet_name, active, profile_email) VALUES('JohnWallet1', true, 'sample@email.com');

--INSERT INTO wallet(wallet_name, active, profile_email) VALUES('JohnWallet2', false, 'sample@email.com');

