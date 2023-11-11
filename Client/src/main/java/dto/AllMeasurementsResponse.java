package dto;

import java.util.List;

public class AllMeasurementsResponse {
    private List<MeasurementDTO> measurements;

    public AllMeasurementsResponse() {
    }

    public AllMeasurementsResponse(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }

    public List<MeasurementDTO> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }
}
