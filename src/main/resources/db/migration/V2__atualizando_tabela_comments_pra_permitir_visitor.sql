ALTER TABLE comments
ADD COLUMN visitor_id UUID REFERENCES reviewer_visitor(id);

ALTER TABLE comments
ADD CONSTRAINT only_one_author CHECK (
    (user_id IS NOT NULL AND visitor_id IS NULL) OR
    (user_id IS NULL AND visitor_id IS NOT NULL)
);