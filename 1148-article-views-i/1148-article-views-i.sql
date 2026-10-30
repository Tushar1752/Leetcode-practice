SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
Order BY author_id ASC