package com.filesynch.converter;

import com.filesynch.dto.FileInfoDTO;
import com.filesynch.entity.FileInfoSent;

public class FileInfoSentConverter {
    private ClientInfoConverter clientInfoConverter;

    public FileInfoSentConverter(ClientInfoConverter clientInfoConverter) {
        this.clientInfoConverter = clientInfoConverter;
    }

    public FileInfoDTO convertToDto(FileInfoSent fileInfo) {
        FileInfoDTO fileInfoDTO = new FileInfoDTO();
        fileInfoDTO.setName(fileInfo.getName());
        fileInfoDTO.setSize(fileInfo.getSize());
        fileInfoDTO.setClient(clientInfoConverter.convertToDto(fileInfo.getClient()));
        return fileInfoDTO;
    }

    public FileInfoSent convertToEntity(FileInfoDTO fileInfoDTO) {
        FileInfoSent fileInfo = new FileInfoSent();
        fileInfo.setName(fileInfoDTO.getName());
        fileInfo.setSize(fileInfoDTO.getSize());
        fileInfo.setClient(clientInfoConverter.convertToEntity(fileInfoDTO.getClient()));
        return fileInfo;
    }
}
