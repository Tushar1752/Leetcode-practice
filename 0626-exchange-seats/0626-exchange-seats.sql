SELECT 
  CASE
  WHEn id % 2=1 AND id<(SELECT Max(id) From Seat) Then id+1
  WHEN id % 2 =0 Then id-1
  ELse id
  END AS id, student 
  FROM Seat
  Order BY id;