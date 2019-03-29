CREATE SCHEMA public VERSION '1.0';

CREATE TABLE show_table
(
    id INT NOT NULL PRIMARY KEY,
    track_name VARCHAR(512),
    artist_credit_name VARCHAR(512),
    track VARCHAR(10),
    length VARCHAR(10),
    release_name VARCHAR(512),
    recording_url VARCHAR(128),
    track_last_updated DATETIME
);

CREATE INDEX show_table_idx_track_name ON show_table (track_name, id);
CREATE INDEX show_table_idx_artstcrditnme ON show_table (artist_credit_name, id);
CREATE INDEX show_table_idx_track ON show_table (track, id);
CREATE INDEX show_table_idx_length ON show_table (length, id);
CREATE INDEX show_table_idx_release_name ON show_table (release_name, id);
CREATE INDEX show_table_idx_recording_url ON show_table (recording_url, id);
CREATE INDEX show_table_idx_tracklstupdtd ON show_table (track_last_updated, id);

