package com.filesynch.entity;

import com.filesynch.dto.FilePartStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "file_parts_received")
public class FilePartReceived {
    @Id
    private Long hashKey;
    @ManyToOne
    @JoinColumn(name = "file_info_id")
    private FileInfoReceived fileInfo;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private FilePartStatus status;
    @Column(name = "index_number")
    private int order;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientInfo client;
}
