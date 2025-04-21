package com.ponsun.san.arabicSan.service;

import com.ponsun.san.arabicSan.data.ArabicSanData;
import com.ponsun.san.arabicSan.data.ResponseData;
import com.ponsun.san.arabicSan.data.UiReciveSingleRecordDto;
import com.ponsun.san.arabicSan.data.MultiParaSearchData;

import java.util.List;

public interface UiReciveSingleRecordService {
    List<UiReciveSingleRecordDto> getUiSingleParaAlgorithmRecords(MultiParaSearchData multiParaSearchData);
    List<UiReciveSingleRecordDto> getSanctionsSearchAlgorithmRecords(MultiParaSearchData multiParaSearchData,List<ArabicSanData> sanList);

    List<ResponseData> getAlgorithmRecords(MultiParaSearchData multiParaSearchData);

//    List<UiReciveSingleRecordDto> getOnBoardingAlgorithmRecords(MultiParaSearchData multiParaSearchData);

}
