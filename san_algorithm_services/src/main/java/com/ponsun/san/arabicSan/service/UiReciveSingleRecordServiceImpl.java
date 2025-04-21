package com.ponsun.san.arabicSan.service;
import com.ponsun.san.arabicSan.data.ArabicSanData;
import com.ponsun.san.arabicSan.data.ResponseData;
import com.ponsun.san.arabicSan.data.UiReciveSingleRecordDto;
import com.ponsun.san.arabicSan.data.MultiParaSearchData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UiReciveSingleRecordServiceImpl implements UiReciveSingleRecordService {

    private final UiReciveSingleRecord uiReciveSingleRecordDto;
    private final ReciveSanAlRecord reciveSanAlRecord;

    @Override
    public List<UiReciveSingleRecordDto> getUiSingleParaAlgorithmRecords(MultiParaSearchData multiParaSearchData) {
        List<UiReciveSingleRecordDto> recordDTOList = uiReciveSingleRecordDto.uicalculateScoreSinglePara(multiParaSearchData);
//        List<UiReciveSingleRecordDto> recordDTOList = uiReciveSingleRecordDto.uicalculateScoreSingleParaTest(multiParaSearchData);
        return recordDTOList;
    }

    @Override
    public List<UiReciveSingleRecordDto> getSanctionsSearchAlgorithmRecords(MultiParaSearchData multiParaSearchData,List<ArabicSanData> sanList) {
        List<UiReciveSingleRecordDto> recordDTOList = uiReciveSingleRecordDto.calculateSanListScore(multiParaSearchData,sanList);
        return recordDTOList;
    }

    @Override
    public List<ResponseData> getAlgorithmRecords(MultiParaSearchData multiParaSearchData) {
        List<ResponseData> recordDTOList = reciveSanAlRecord.uicalculateScoreSinglePara(multiParaSearchData);
        return recordDTOList;
    }


}
