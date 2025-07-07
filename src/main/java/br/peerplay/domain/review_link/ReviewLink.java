package br.peerplay.domain.review_link;

import br.peerplay.domain.video.Video;
import br.peerplay.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "review_links")
public class ReviewLink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name = "url_token", nullable = false)
    private String urlToken;

    @Column(name = "access_type", nullable = false)
    private String accessType;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private LocalDateTime createdAt;
}
