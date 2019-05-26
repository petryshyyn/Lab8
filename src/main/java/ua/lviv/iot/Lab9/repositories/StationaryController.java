package ua.lviv.iot.Lab9.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab9.model.Stationary;

import java.util.List;

@RestController
public class StationaryController {

    @Autowired
    private StationaryRepository stationaryRepository;

    @RequestMapping(value = "/stationary", method = RequestMethod.GET)
    public List<Stationary> getStationaryGoodes() {
        return (List<Stationary>) stationaryRepository.findAll();
    }

    @RequestMapping(value = "/stationary/{id}", method = RequestMethod.GET)
    public Stationary getStationaryGoods(@PathVariable Integer id) {
        return stationaryRepository.findById(id).get();
    }

    @RequestMapping(value = "/stationary/{id}", method = RequestMethod.PUT)
    public Stationary replaceStationary(@RequestBody Stationary newStationary, @PathVariable Integer id) {
        return stationaryRepository.findById(id)
                .map(stationary -> {
                    stationary.setManufactureOfGoods(newStationary.getManufactureOfGoods());
                    stationary.setPriceOfGoods(newStationary.getPriceOfGoods());
                    stationary.setQualityOfGoods(newStationary.getQualityOfGoods());
                    stationary.setTypeOfGoods(newStationary.getTypeOfGoods());
                    return stationaryRepository.save(stationary);
                }).orElseGet(() -> {
                    newStationary.setId(id);
                    return stationaryRepository.save(newStationary);
                });
    }

    @RequestMapping(value = "/stationary", method = RequestMethod.POST)
    public Stationary postStationaryGoods(@RequestBody Stationary stationary) {
        return stationaryRepository.save(stationary);
    }

    @RequestMapping(value = "/stationary/{id}", method = RequestMethod.DELETE)
    public Stationary deleteEquity(@PathVariable Integer id) {
        Stationary temp = getStationaryGoods(id);
        stationaryRepository.deleteById(id);
        return temp;
    }
}
