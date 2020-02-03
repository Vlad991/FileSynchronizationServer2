package com.filesynch.converter;

import com.filesynch.dto.FileInfoDTO;
import com.filesynch.entity.FileInfoReceived;

public class FileInfoReceivedConverter {
    private ClientInfoConverter clientInfoConverter;

    public FileInfoReceivedConverter(ClientInfoConverter clientInfoConverter) {
        this.clientInfoConverter = clientInfoConverter;
    }

    public FileInfoDTO convertToDto(FileInfoReceived fileInfo) {
        FileInfoDTO fileInfoDTO = new FileInfoDTO();
        fileInfoDTO.setName(fileInfo.getName());
        fileInfoDTO.setSize(fileInfo.getSize());
        fileInfoDTO.setClient(clientInfoConverter.convertToDto(fileInfo.getClient()));
        return fileInfoDTO;
    }

    public FileInfoReceived convertToEntity(FileInfoDTO fileInfoDTO) {
        FileInfoReceived fileInfo = new FileInfoReceived();
        fileInfo.setName(fileInfoDTO.getName());
        fileInfo.setSize(fileInfoDTO.getSize());
        fileInfo.setClient(clientInfoConverter.convertToEntity(fileInfoDTO.getClient()));
        return fileInfo;
    }
}
