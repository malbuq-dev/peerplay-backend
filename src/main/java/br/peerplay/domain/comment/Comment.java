package br.peerplay.domain.comment;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.peerplay.domain.reviewer_visitor.ReviewerVisitor;
import br.peerplay.domain.user.User;
import br.peerplay.domain.video.Video;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User comentator;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private ReviewerVisitor visitorComentator;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    @JsonBackReference
    private Comment parentComment;

    @OneToMany(mappedBy = "parentComment")
    @JsonManagedReference
    private List<Comment> children;

    @Column(name = "timestamp_seconds", nullable = false)
    private int timestampSeconds;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private LocalDate createdAt;
}
