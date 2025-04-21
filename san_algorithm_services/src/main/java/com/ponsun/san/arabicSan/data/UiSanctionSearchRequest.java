package com.ponsun.san.arabicSan.data;

import lombok.Data;

import java.util.List;

@Data
public class UiSanctionSearchRequest {
    private MultiParaSearchData multiParaSearchData;
    private List<ArabicSanData> sanList;
}

