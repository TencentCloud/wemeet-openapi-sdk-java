/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 编辑会议室基本信息
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsModifyPutRequestMeetingRoomInfo {
    @JsonProperty(value = "building")
    private String building;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "desc")
    private String desc;

    @JsonProperty(value = "device")
    private List<String> device;

    @JsonProperty(value = "floor")
    private String floor;

    @JsonProperty(value = "meeting_room_name", required = true)
    private String meetingRoomName;

    @JsonProperty(value = "meeting_room_type", required = true)
    private Long meetingRoomType;

    @JsonProperty(value = "mra_address")
    private String mraAddress;

    @JsonProperty(value = "mra_register_account")
    private String mraRegisterAccount;

    @JsonProperty(value = "participant_number")
    private Long participantNumber;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "use_password")
    private Boolean usePassword;

    /**
     * @param meetingRoomName 会议室名称。长度不超过36个字符。 (required)
     * @param meetingRoomType 会议室类型。 0：rooms 会议室 1：无类型会议室 2：SIP 会议室 4：H.323 会议室 (required)
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo(@NotNull String meetingRoomName, @NotNull Long meetingRoomType) {
        this.meetingRoomName = meetingRoomName;
        this.meetingRoomType = meetingRoomType;
    }

    /**
     * @param building 建筑。若非输入城市下现有建筑则自动创建该建筑与楼层。长度不超过36个字符或18个汉字。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo building(String building) {
        this.building = building;
        return this;
    }
    /**
     * @return building 建筑。若非输入城市下现有建筑则自动创建该建筑与楼层。长度不超过36个字符或18个汉字。
     **/
    public String getBuilding() {
        return building;
    }

    /**
     * @param building 建筑。若非输入城市下现有建筑则自动创建该建筑与楼层。长度不超过36个字符或18个汉字。
     */
    public void setBuilding(String building) {
        this.building = building;
    }
    /**
     * @param city 城市。若非已添加城市则自动创建城市及建筑与楼层。长度不超过36个字符或18个汉字。city、building、floor 需同时传入或都不传入。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo city(String city) {
        this.city = city;
        return this;
    }
    /**
     * @return city 城市。若非已添加城市则自动创建城市及建筑与楼层。长度不超过36个字符或18个汉字。city、building、floor 需同时传入或都不传入。
     **/
    public String getCity() {
        return city;
    }

    /**
     * @param city 城市。若非已添加城市则自动创建城市及建筑与楼层。长度不超过36个字符或18个汉字。city、building、floor 需同时传入或都不传入。
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @param desc 描述（base64）。长度不超过1000个字符。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo desc(String desc) {
        this.desc = desc;
        return this;
    }
    /**
     * @return desc 描述（base64）。长度不超过1000个字符。
     **/
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc 描述（base64）。长度不超过1000个字符。
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**
     * @param device 会议室设备，输入非现有类型内容则无效。设备类型有：TV，投影，会议电话机，MIC，视频电视，PC，无线投屏。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo device(List<String> device) {
        this.device = device;
        return this;
    }
    /**
     * @return device 会议室设备，输入非现有类型内容则无效。设备类型有：TV，投影，会议电话机，MIC，视频电视，PC，无线投屏。
     **/
    public List<String> getDevice() {
        return device;
    }

    /**
     * @param device 会议室设备，输入非现有类型内容则无效。设备类型有：TV，投影，会议电话机，MIC，视频电视，PC，无线投屏。
     */
    public void setDevice(List<String> device) {
        this.device = device;
    }
    /**
     * @param floor 楼层。若非输入建筑下现有楼层则自动创建楼层。输入应为数字或字母，长度不超过36个字符。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo floor(String floor) {
        this.floor = floor;
        return this;
    }
    /**
     * @return floor 楼层。若非输入建筑下现有楼层则自动创建楼层。输入应为数字或字母，长度不超过36个字符。
     **/
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor 楼层。若非输入建筑下现有楼层则自动创建楼层。输入应为数字或字母，长度不超过36个字符。
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }
    /**
     * @param meetingRoomName 会议室名称。长度不超过36个字符。 (required)
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo meetingRoomName(@NotNull String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
        return this;
    }
    /**
     * @return meetingRoomName 会议室名称。长度不超过36个字符。
     **/
    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    /**
     * @param meetingRoomName 会议室名称。长度不超过36个字符。 (required)
     */
    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }
    /**
     * @param meetingRoomType 会议室类型。 0：rooms 会议室 1：无类型会议室 2：SIP 会议室 4：H.323 会议室 (required)
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo meetingRoomType(@NotNull Long meetingRoomType) {
        this.meetingRoomType = meetingRoomType;
        return this;
    }
    /**
     * @return meetingRoomType 会议室类型。 0：rooms 会议室 1：无类型会议室 2：SIP 会议室 4：H.323 会议室
     **/
    public Long getMeetingRoomType() {
        return meetingRoomType;
    }

    /**
     * @param meetingRoomType 会议室类型。 0：rooms 会议室 1：无类型会议室 2：SIP 会议室 4：H.323 会议室 (required)
     */
    public void setMeetingRoomType(Long meetingRoomType) {
        this.meetingRoomType = meetingRoomType;
    }
    /**
     * @param mraAddress 会议室信令地址。会议室类型为2或4时必填写，与mra_register_account 二选一。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo mraAddress(String mraAddress) {
        this.mraAddress = mraAddress;
        return this;
    }
    /**
     * @return mraAddress 会议室信令地址。会议室类型为2或4时必填写，与mra_register_account 二选一。
     **/
    public String getMraAddress() {
        return mraAddress;
    }

    /**
     * @param mraAddress 会议室信令地址。会议室类型为2或4时必填写，与mra_register_account 二选一。
     */
    public void setMraAddress(String mraAddress) {
        this.mraAddress = mraAddress;
    }
    /**
     * @param mraRegisterAccount SIP/ H.323注册账号。会议室类型为2或4时填写。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo mraRegisterAccount(String mraRegisterAccount) {
        this.mraRegisterAccount = mraRegisterAccount;
        return this;
    }
    /**
     * @return mraRegisterAccount SIP/ H.323注册账号。会议室类型为2或4时填写。
     **/
    public String getMraRegisterAccount() {
        return mraRegisterAccount;
    }

    /**
     * @param mraRegisterAccount SIP/ H.323注册账号。会议室类型为2或4时填写。
     */
    public void setMraRegisterAccount(String mraRegisterAccount) {
        this.mraRegisterAccount = mraRegisterAccount;
    }
    /**
     * @param participantNumber 容纳人数。不超过9位数。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo participantNumber(Long participantNumber) {
        this.participantNumber = participantNumber;
        return this;
    }
    /**
     * @return participantNumber 容纳人数。不超过9位数。
     **/
    public Long getParticipantNumber() {
        return participantNumber;
    }

    /**
     * @param participantNumber 容纳人数。不超过9位数。
     */
    public void setParticipantNumber(Long participantNumber) {
        this.participantNumber = participantNumber;
    }
    /**
     * @param password 使用管理员密码时必须填写管理员密码（base64）。若不使用密码，该字段无效。输入应为1-16位的数字、字母或字符。
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo password(String password) {
        this.password = password;
        return this;
    }
    /**
     * @return password 使用管理员密码时必须填写管理员密码（base64）。若不使用密码，该字段无效。输入应为1-16位的数字、字母或字符。
     **/
    public String getPassword() {
        return password;
    }

    /**
     * @param password 使用管理员密码时必须填写管理员密码（base64）。若不使用密码，该字段无效。输入应为1-16位的数字、字母或字符。
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param usePassword 会议室类型为1时选择是否使用管理员密码，默认为 false。 true：使用 false：不使用
     */
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo usePassword(Boolean usePassword) {
        this.usePassword = usePassword;
        return this;
    }
    /**
     * @return usePassword 会议室类型为1时选择是否使用管理员密码，默认为 false。 true：使用 false：不使用
     **/
    public Boolean getUsePassword() {
        return usePassword;
    }

    /**
     * @param usePassword 会议室类型为1时选择是否使用管理员密码，默认为 false。 true：使用 false：不使用
     */
    public void setUsePassword(Boolean usePassword) {
        this.usePassword = usePassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsModifyPutRequestMeetingRoomInfo v1MeetingRoomsModifyPutRequestMeetingRoomInfo = (V1MeetingRoomsModifyPutRequestMeetingRoomInfo) o;
        return Objects.equals(this.building, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.building) &&
            Objects.equals(this.city, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.city) &&
            Objects.equals(this.desc, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.desc) &&
            Objects.equals(this.device, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.device) &&
            Objects.equals(this.floor, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.floor) &&
            Objects.equals(this.meetingRoomName, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.meetingRoomName) &&
            Objects.equals(this.meetingRoomType, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.meetingRoomType) &&
            Objects.equals(this.mraAddress, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.mraAddress) &&
            Objects.equals(this.mraRegisterAccount, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.mraRegisterAccount) &&
            Objects.equals(this.participantNumber, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.participantNumber) &&
            Objects.equals(this.password, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.password) &&
            Objects.equals(this.usePassword, v1MeetingRoomsModifyPutRequestMeetingRoomInfo.usePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, city, desc, device, floor, meetingRoomName, meetingRoomType, mraAddress, mraRegisterAccount, participantNumber, password, usePassword);
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1MeetingRoomsModifyPutRequestMeetingRoomInfo {\n");
        sb.append("    building: ").append(toIndentedString(building)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
        sb.append("    meetingRoomName: ").append(toIndentedString(meetingRoomName)).append("\n");
        sb.append("    meetingRoomType: ").append(toIndentedString(meetingRoomType)).append("\n");
        sb.append("    mraAddress: ").append(toIndentedString(mraAddress)).append("\n");
        sb.append("    mraRegisterAccount: ").append(toIndentedString(mraRegisterAccount)).append("\n");
        sb.append("    participantNumber: ").append(toIndentedString(participantNumber)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    usePassword: ").append(toIndentedString(usePassword)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
