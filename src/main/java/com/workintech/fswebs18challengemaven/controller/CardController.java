package com.workintech.fswebs18challengemaven.controller;

import com.workintech.fswebs18challengemaven.entity.Card;
import com.workintech.fswebs18challengemaven.entity.Type;
import com.workintech.fswebs18challengemaven.exceptions.CardException;
import com.workintech.fswebs18challengemaven.repository.CardRepository;
import com.workintech.fswebs18challengemaven.util.CardValidation;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cards")
@AllArgsConstructor
public class CardController {
    private final CardRepository cardRepository;

    @PostMapping
    public Card save(@RequestBody Card card) {
//        CardValidation.validateCard(card);
        return cardRepository.save(card);
    }

    @GetMapping
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    @GetMapping("/byColor/{color}")
    public List<Card> getByColor(@PathVariable("color") String color) {
//        if(!Type.values().toString().contains(color)) {
//            throw new CardException("Invalid color", HttpStatus.NOT_FOUND);
//        }
        return cardRepository.findByColor(color);
    }


    @Transactional
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Card update( @RequestBody Card card) {
//        Optional<Card> cardOptional = cardRepository.findById(id);
//        if (!cardOptional.isPresent()) {
//            throw new CardException("Card not found", HttpStatus.NOT_FOUND);
//        }
//        card.setId(id);
        return cardRepository.update(card);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        cardRepository.remove(id);
    }

    @GetMapping("/byValue/{value}")
    public List<Card> getByValue(@PathVariable("value") Integer value) {
        return cardRepository.findByValue(value);
    }

    @GetMapping("/byType/{type}")
    public List<Card> getByType(@PathVariable("type") String type) {
        return cardRepository.findByType(type);
    }
}
