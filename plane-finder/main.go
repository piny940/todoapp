package main

import (
	"encoding/json"
	"net/http"
)

func main() {
	http.ListenAndServe(":7634", http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		body := map[string]interface{}{
			"id":                108,
			"callsign":          "AMF4263",
			"squawk":            "4136",
			"reg":               "N49UC",
			"flightno":          "",
			"route":             "LAN-DFW",
			"type":              "B190",
			"category":          "A1",
			"altitude":          20000,
			"heading":           235,
			"speed":             248,
			"lat":               38.865905,
			"lon":               -90.429382,
			"barometer":         0,
			"vert_rate":         0,
			"selected_altitude": 0,
			"polar_distance":    12.99378,
			"polar_bearing":     345.393951,
			"is_adsb":           true,
			"is_on_ground":      false,
			"last_seen_time":    "2020-11-11T21:44:04Z",
			"pos_update_time":   "2020-11-11T21:44:03Z",
			"bds40_seen_time":   nil,
		}
		json, err := json.Marshal(body)
		if err != nil {
			http.Error(w, "Internal Server Error", http.StatusInternalServerError)
			return
		}
		w.Write(json)
	}))
}
