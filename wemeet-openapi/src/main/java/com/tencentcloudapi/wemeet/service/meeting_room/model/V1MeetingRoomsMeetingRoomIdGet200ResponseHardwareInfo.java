/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 会议室硬件信息
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo {
    @JsonProperty(value = "active_time")
    private String activeTime;

    @JsonProperty(value = "camera_model")
    private String cameraModel;

    @JsonProperty(value = "cpu_info")
    private String cpuInfo;

    @JsonProperty(value = "cpu_usage")
    private String cpuUsage;

    @JsonProperty(value = "device_model")
    private String deviceModel;

    @JsonProperty(value = "enable_video_mirror")
    private Boolean enableVideoMirror;

    @JsonProperty(value = "factory")
    private String factory;

    @JsonProperty(value = "firmware_version")
    private String firmwareVersion;

    @JsonProperty(value = "gpu_info")
    private String gpuInfo;

    @JsonProperty(value = "health_status")
    private String healthStatus;

    @JsonProperty(value = "ip")
    private String ip;

    @JsonProperty(value = "mac")
    private String mac;

    @JsonProperty(value = "meeting_room_status")
    private Long meetingRoomStatus;

    @JsonProperty(value = "memory_info")
    private String memoryInfo;

    @JsonProperty(value = "microphone_info")
    private String microphoneInfo;

    @JsonProperty(value = "monitor_frequency")
    private Long monitorFrequency;

    @JsonProperty(value = "net_type")
    private String netType;

    @JsonProperty(value = "rooms_version")
    private String roomsVersion;

    @JsonProperty(value = "sn")
    private String sn;

    @JsonProperty(value = "speaker_info")
    private String speakerInfo;

    @JsonProperty(value = "system_type")
    private String systemType;

    /**
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo() {
    }

    /**
     * @param activeTime 激活时间
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo activeTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    /**
     * @return activeTime 激活时间
     **/
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * @param activeTime 激活时间
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }
    /**
     * @param cameraModel 摄像头型号
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo cameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
        return this;
    }
    /**
     * @return cameraModel 摄像头型号
     **/
    public String getCameraModel() {
        return cameraModel;
    }

    /**
     * @param cameraModel 摄像头型号
     */
    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }
    /**
     * @param cpuInfo CPU信息
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo cpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }
    /**
     * @return cpuInfo CPU信息
     **/
    public String getCpuInfo() {
        return cpuInfo;
    }

    /**
     * @param cpuInfo CPU信息
     */
    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }
    /**
     * @param cpuUsage CPU最大占用率
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo cpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }
    /**
     * @return cpuUsage CPU最大占用率
     **/
    public String getCpuUsage() {
        return cpuUsage;
    }

    /**
     * @param cpuUsage CPU最大占用率
     */
    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
    /**
     * @param deviceModel 设备型号
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo deviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    /**
     * @return deviceModel 设备型号
     **/
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * @param deviceModel 设备型号
     */
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    /**
     * @param enableVideoMirror 是否开启视频镜像
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo enableVideoMirror(Boolean enableVideoMirror) {
        this.enableVideoMirror = enableVideoMirror;
        return this;
    }
    /**
     * @return enableVideoMirror 是否开启视频镜像
     **/
    public Boolean getEnableVideoMirror() {
        return enableVideoMirror;
    }

    /**
     * @param enableVideoMirror 是否开启视频镜像
     */
    public void setEnableVideoMirror(Boolean enableVideoMirror) {
        this.enableVideoMirror = enableVideoMirror;
    }
    /**
     * @param factory 厂家
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo factory(String factory) {
        this.factory = factory;
        return this;
    }
    /**
     * @return factory 厂家
     **/
    public String getFactory() {
        return factory;
    }

    /**
     * @param factory 厂家
     */
    public void setFactory(String factory) {
        this.factory = factory;
    }
    /**
     * @param firmwareVersion 固件版本
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo firmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }
    /**
     * @return firmwareVersion 固件版本
     **/
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * @param firmwareVersion 固件版本
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    /**
     * @param gpuInfo GPU信息
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo gpuInfo(String gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }
    /**
     * @return gpuInfo GPU信息
     **/
    public String getGpuInfo() {
        return gpuInfo;
    }

    /**
     * @param gpuInfo GPU信息
     */
    public void setGpuInfo(String gpuInfo) {
        this.gpuInfo = gpuInfo;
    }
    /**
     * @param healthStatus 健康状况
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo healthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    /**
     * @return healthStatus 健康状况
     **/
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus 健康状况
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    /**
     * @param ip ip地址
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo ip(String ip) {
        this.ip = ip;
        return this;
    }
    /**
     * @return ip ip地址
     **/
    public String getIp() {
        return ip;
    }

    /**
     * @param ip ip地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * @param mac MAC地址
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo mac(String mac) {
        this.mac = mac;
        return this;
    }
    /**
     * @return mac MAC地址
     **/
    public String getMac() {
        return mac;
    }

    /**
     * @param mac MAC地址
     */
    public void setMac(String mac) {
        this.mac = mac;
    }
    /**
     * @param meetingRoomStatus 会议室状态
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo meetingRoomStatus(Long meetingRoomStatus) {
        this.meetingRoomStatus = meetingRoomStatus;
        return this;
    }
    /**
     * @return meetingRoomStatus 会议室状态
     **/
    public Long getMeetingRoomStatus() {
        return meetingRoomStatus;
    }

    /**
     * @param meetingRoomStatus 会议室状态
     */
    public void setMeetingRoomStatus(Long meetingRoomStatus) {
        this.meetingRoomStatus = meetingRoomStatus;
    }
    /**
     * @param memoryInfo 内存信息
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo memoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }
    /**
     * @return memoryInfo 内存信息
     **/
    public String getMemoryInfo() {
        return memoryInfo;
    }

    /**
     * @param memoryInfo 内存信息
     */
    public void setMemoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
    }
    /**
     * @param microphoneInfo 麦克风信息
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo microphoneInfo(String microphoneInfo) {
        this.microphoneInfo = microphoneInfo;
        return this;
    }
    /**
     * @return microphoneInfo 麦克风信息
     **/
    public String getMicrophoneInfo() {
        return microphoneInfo;
    }

    /**
     * @param microphoneInfo 麦克风信息
     */
    public void setMicrophoneInfo(String microphoneInfo) {
        this.microphoneInfo = microphoneInfo;
    }
    /**
     * @param monitorFrequency 显示器刷新率
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo monitorFrequency(Long monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
        return this;
    }
    /**
     * @return monitorFrequency 显示器刷新率
     **/
    public Long getMonitorFrequency() {
        return monitorFrequency;
    }

    /**
     * @param monitorFrequency 显示器刷新率
     */
    public void setMonitorFrequency(Long monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
    }
    /**
     * @param netType 网络类型
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo netType(String netType) {
        this.netType = netType;
        return this;
    }
    /**
     * @return netType 网络类型
     **/
    public String getNetType() {
        return netType;
    }

    /**
     * @param netType 网络类型
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }
    /**
     * @param roomsVersion Rooms版本
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo roomsVersion(String roomsVersion) {
        this.roomsVersion = roomsVersion;
        return this;
    }
    /**
     * @return roomsVersion Rooms版本
     **/
    public String getRoomsVersion() {
        return roomsVersion;
    }

    /**
     * @param roomsVersion Rooms版本
     */
    public void setRoomsVersion(String roomsVersion) {
        this.roomsVersion = roomsVersion;
    }
    /**
     * @param sn 序列号
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo sn(String sn) {
        this.sn = sn;
        return this;
    }
    /**
     * @return sn 序列号
     **/
    public String getSn() {
        return sn;
    }

    /**
     * @param sn 序列号
     */
    public void setSn(String sn) {
        this.sn = sn;
    }
    /**
     * @param speakerInfo 扬声器信息
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo speakerInfo(String speakerInfo) {
        this.speakerInfo = speakerInfo;
        return this;
    }
    /**
     * @return speakerInfo 扬声器信息
     **/
    public String getSpeakerInfo() {
        return speakerInfo;
    }

    /**
     * @param speakerInfo 扬声器信息
     */
    public void setSpeakerInfo(String speakerInfo) {
        this.speakerInfo = speakerInfo;
    }
    /**
     * @param systemType 设备系统
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo systemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    /**
     * @return systemType 设备系统
     **/
    public String getSystemType() {
        return systemType;
    }

    /**
     * @param systemType 设备系统
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo = (V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo) o;
        return Objects.equals(this.activeTime, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.activeTime) &&
            Objects.equals(this.cameraModel, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.cameraModel) &&
            Objects.equals(this.cpuInfo, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.cpuInfo) &&
            Objects.equals(this.cpuUsage, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.cpuUsage) &&
            Objects.equals(this.deviceModel, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.deviceModel) &&
            Objects.equals(this.enableVideoMirror, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.enableVideoMirror) &&
            Objects.equals(this.factory, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.factory) &&
            Objects.equals(this.firmwareVersion, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.firmwareVersion) &&
            Objects.equals(this.gpuInfo, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.gpuInfo) &&
            Objects.equals(this.healthStatus, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.healthStatus) &&
            Objects.equals(this.ip, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.ip) &&
            Objects.equals(this.mac, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.mac) &&
            Objects.equals(this.meetingRoomStatus, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.meetingRoomStatus) &&
            Objects.equals(this.memoryInfo, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.memoryInfo) &&
            Objects.equals(this.microphoneInfo, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.microphoneInfo) &&
            Objects.equals(this.monitorFrequency, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.monitorFrequency) &&
            Objects.equals(this.netType, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.netType) &&
            Objects.equals(this.roomsVersion, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.roomsVersion) &&
            Objects.equals(this.sn, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.sn) &&
            Objects.equals(this.speakerInfo, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.speakerInfo) &&
            Objects.equals(this.systemType, v1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo.systemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTime, cameraModel, cpuInfo, cpuUsage, deviceModel, enableVideoMirror, factory, firmwareVersion, gpuInfo, healthStatus, ip, mac, meetingRoomStatus, memoryInfo, microphoneInfo, monitorFrequency, netType, roomsVersion, sn, speakerInfo, systemType);
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
        sb.append("class V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo {\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    cameraModel: ").append(toIndentedString(cameraModel)).append("\n");
        sb.append("    cpuInfo: ").append(toIndentedString(cpuInfo)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
        sb.append("    enableVideoMirror: ").append(toIndentedString(enableVideoMirror)).append("\n");
        sb.append("    factory: ").append(toIndentedString(factory)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    gpuInfo: ").append(toIndentedString(gpuInfo)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    meetingRoomStatus: ").append(toIndentedString(meetingRoomStatus)).append("\n");
        sb.append("    memoryInfo: ").append(toIndentedString(memoryInfo)).append("\n");
        sb.append("    microphoneInfo: ").append(toIndentedString(microphoneInfo)).append("\n");
        sb.append("    monitorFrequency: ").append(toIndentedString(monitorFrequency)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    roomsVersion: ").append(toIndentedString(roomsVersion)).append("\n");
        sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
        sb.append("    speakerInfo: ").append(toIndentedString(speakerInfo)).append("\n");
        sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

