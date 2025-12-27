INSERT INTO patient (patient_id, patient_name, patient_email, date_of_birth, created_at, version)
VALUES
    (gen_random_uuid(), 'Arjun Reddy', 'arjun.reddy@example.com', DATE '1995-03-12', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Sita Sharma', 'sita.sharma@example.com', DATE '1992-07-21', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Rahul Verma', 'rahul.verma@example.com', DATE '1988-11-05', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Priya Nair', 'priya.nair@example.com', DATE '1996-01-18', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Karthik Iyer', 'karthik.iyer@example.com', DATE '1990-09-30', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Ananya Gupta', 'ananya.gupta@example.com', DATE '1998-05-14', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Vikram Singh', 'vikram.singh@example.com', DATE '1985-12-02', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Meera Joshi', 'meera.joshi@example.com', DATE '1993-08-27', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Rohit Malhotra', 'rohit.malhotra@example.com', DATE '1991-04-10', CURRENT_TIMESTAMP, 0),

    (gen_random_uuid(), 'Neha Kapoor', 'neha.kapoor@example.com', DATE '1997-06-25', CURRENT_TIMESTAMP, 0);
