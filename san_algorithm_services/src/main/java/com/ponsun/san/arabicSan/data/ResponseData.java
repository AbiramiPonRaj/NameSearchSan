package com.ponsun.san.arabicSan.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseData {
    @JsonProperty("sessionID")
    private Integer sessionID;

    @JsonProperty("uid")
    private String uID;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty("maxWeightageScore")
    private Integer maxWeightageScore;

    @JsonProperty("algorithm1WeightageScore")
    private Integer algorithm1WeightageScore;

    @JsonProperty("algorithm2WeightageScore")
    private Integer algorithm2WeightageScore;

    @JsonProperty("algorithm3WeightageScore")
    private Integer algorithm3WeightageScore;

    @JsonProperty("algorithm4WeightageScore")
    private Integer algorithm4WeightageScore;

    @JsonProperty("algorithm5WeightageScore")
    private Integer algorithm5WeightageScore;

    @JsonProperty("matchedName")
    private String matchedName;

    public ResponseData(Integer sessionID, String UID, String sourceName, Integer maxWeightageScore, Integer algorithm1WeightageScore, Integer algorithm2WeightageScore, Integer algorithm3WeightageScore, Integer algorithm4WeightageScore, Integer algorithm5WeightageScore, String matchedName) {
        this.sessionID = sessionID;
        this.uID = UID;
        this.sourceName = sourceName;
        this.maxWeightageScore = maxWeightageScore;
        this.algorithm1WeightageScore = algorithm1WeightageScore;
        this.algorithm2WeightageScore = algorithm2WeightageScore;
        this.algorithm3WeightageScore = algorithm3WeightageScore;
        this.algorithm4WeightageScore = algorithm4WeightageScore;
        this.algorithm5WeightageScore = algorithm5WeightageScore;
        this.matchedName = matchedName;
    }
    public static ResponseData newInstance(Integer sessionID, String uID, String sourceName, Integer maxWeightageScore, Integer algorithm1WeightageScore, Integer algorithm2WeightageScore, Integer algorithm3WeightageScore, Integer algorithm4WeightageScore, Integer algorithm5WeightageScore, String matchedName){
        return new ResponseData(sessionID, uID, sourceName, maxWeightageScore, algorithm1WeightageScore, algorithm2WeightageScore, algorithm3WeightageScore, algorithm4WeightageScore, algorithm5WeightageScore, matchedName);
    }
}
