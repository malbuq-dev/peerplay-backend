CREATE TABLE projects (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id UUID REFERENCES auth.users(id) ON DELETE CASCADE,
    title TEXT NOT NULL,
    thumb_picture_key TEXT NOT NULL
);

CREATE TABLE folders (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    projects_id UUID NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    parent_folder_id UUID REFERENCES folders(id) ON DELETE CASCADE,
    title TEXT NOT NULL,
    thumb_picture_key TEXT NOT NULL
);

CREATE TABLE videos (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    uploader_id UUID NOT NULL REFERENCES auth.users(id),
    folder_id UUID REFERENCES folders(id) ON DELETE CASCADE,
    projects_id UUID NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    s3_key TEXT NOT NULL,
    title TEXT NOT NULL,
    upload_date DATE DEFAULT CURRENT_DATE,
    duration_seconds INT NOT NULL,
    ai_notes_summary TEXT NOT NULL
);

CREATE TABLE comments (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    video_id UUID REFERENCES videos(id) ON DELETE CASCADE,
    user_id UUID REFERENCES auth.users(id),
    parent_comment_id UUID REFERENCES comments(id) ON DELETE CASCADE,
    timestamp_seconds INT NOT NULL,
    content TEXT,
    created_at DATE DEFAULT CURRENT_DATE
);

CREATE TABLE review_links (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    video_id UUID REFERENCES videos(id) ON DELETE CASCADE,
    created_by UUID REFERENCES auth.users(id),
    url_token TEXT NOT NULL,
    access_type TEXT NOT NULL,
    expires_at TIMESTAMP,
    created_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE reviewer_visitor (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL,
    email TEXT NOT NULL
);
