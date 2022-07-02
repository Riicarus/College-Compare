package com.skyline.collegecompare.data.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * [FEATURE INFO]<br/>
 * College Info
 *
 * @author Skyline
 * @create 2022/7/2 10:59
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("college_info_table")
@ApiModel("College Info")
public class CollegeInfo {

    @TableId("id")
    @ApiModelProperty("unique and auto-increase id")
    private int id;

    @TableField("college_name")
    @ApiModelProperty("college name")
    private String collegeName;

    @TableField("province_name")
    @ApiModelProperty("name of province of the college")
    private String provinceName;

    @TableField("ranking")
    @ApiModelProperty("college ranking")
    private String ranking;

    @TableField("max_fractional_line")
    @ApiModelProperty("max fractional line in recent years, json, raw type: HashMap of year and grade")
    private String maxFractionalLineJson;

    @TableField("min_fractional_line")
    @ApiModelProperty("min fractional line in recent years, json, raw type: HashMap of year and grade")
    private String minFractionalLineJson;


    @TableField("min_admission_ranking")
    @ApiModelProperty("min admission ranking number in recent years, json, raw type: HashMap of year and ranking number")
    private String minAdmissionRankingJson;

    @TableField("enrollment_number")
    @ApiModelProperty("enrollment number in recent years, json, raw type: HashMap of year and enrollment number")
    private String enrollmentNumberJson;

    @TableField("hot_word")
    @ApiModelProperty("hot word of college, json, raw type: HashMap of word and rate")
    private String hotWord;

    @TableField("popular_major")
    @ApiModelProperty("popular major, json, raw type: List of majors order by desc")
    private String popularMajor;

    @TableField("gender_rate")
    @ApiModelProperty("gender rate of man and woman")
    private double genderRate;

    @TableField("employment_rate")
    @ApiModelProperty("employment rate")
    private double employmentRate;

    @TableField("domestic_admission_rate")
    @ApiModelProperty("domestic admission rate")
    private double domesticAdmissionRate;

    @TableField("going_abroad_rate")
    @ApiModelProperty("going abroad rate")
    private double goingAbroadRate;

    @TableField("search_popularity")
    @ApiModelProperty("search popularity in www.baidu.com")
    private int searchPopularity;

}
