package br.peerplay.domain.video;

import java.util.Date;
import java.util.UUID;

import br.peerplay.domain.folder.Folder;
import br.peerplay.domain.project.Project;
import br.peerplay.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "users") 
public class Video {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "uploader_id", nullable = false)
    private User uploader;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder parentFolder;

    @ManyToOne
    @JoinColumn(name = "projects_id", nullable = false)
    private Project parentProject;

    @Column(name = "s3_key", nullable = false)
    private String storageKey;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "date")
    private Date uploadDate;

    @Column(name = "duration_seconds", nullable = false)
    private int durationSeconds;

    @Column(name = "ai_notes_summary", nullable = false)
    private String aiNotesSummary;
}
