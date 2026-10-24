SELECT DISTINCT user_id , COUNT(follower_id) AS followers_count from Followers
GROUP By user_id
order by user_id;