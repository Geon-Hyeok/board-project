-- article 테이블에 데이터 삽입
INSERT INTO article (title, content, created_at, created_by, hashtag, modified_at, modified_by)
VALUES
    ('Sample Title 1', 'Sample Content 1', NOW(), 'User1', 'Sample Hashtag 1', NOW(), 'User1'),
    ('Sample Title 2', 'Sample Content 2', NOW(), 'User2', 'Sample Hashtag 2', NOW(), 'User2');

-- article_comment 테이블에 데이터 삽입
INSERT INTO article_comment (content, created_at, created_by, modified_at, modified_by, article_id)
VALUES
    ('Comment for Article 1 by User3', NOW(), 'User3', NOW(), 'User3', 1),
    ('Comment for Article 2 by User4', NOW(), 'User4', NOW(), 'User4', 2);
