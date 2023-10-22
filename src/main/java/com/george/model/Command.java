package com.george.model;

import java.util.List;

public class Command {

    private Status status;
    private List<Stop> stops;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public static class Stop {

        private int valveIndex;
        private int durationMinutes;

        public int getValveIndex() {
            return valveIndex;
        }

        public void setValveIndex(int valveIndex) {
            this.valveIndex = valveIndex;
        }

        public int getDurationMinutes() {
            return durationMinutes;
        }

        public void setDurationMinutes(int durationMinutes) {
            this.durationMinutes = durationMinutes;
        }

        @Override
        public String toString() {
            return valveIndex + " " + durationMinutes;
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(status.getSymbol());
        if (stops != null) {
            for (Stop stop : stops) {
                stringBuilder.append(" ");
                stringBuilder.append(stop);
            }
        }
        return stringBuilder.toString();
    }

}
