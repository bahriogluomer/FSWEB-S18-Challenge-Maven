package com.workintech.fswebs18challengemaven.util;

import com.workintech.fswebs18challengemaven.entity.Card;
import com.workintech.fswebs18challengemaven.entity.Type;
import com.workintech.fswebs18challengemaven.exceptions.CardException;
import org.springframework.http.HttpStatus;

public class CardValidation {

    public static void validateCard(Card card) {

        if (card.getColor() == null) {
            throw new CardException("Invalid Color:", HttpStatus.BAD_REQUEST);
        }
        if (card.getType()!=null && card.getValue() != null && card.getValue()>0) {
            throw new CardException("Invalid Card:", HttpStatus.BAD_REQUEST);
        }
        assert card.getType() != null;
        if((card.getType().equals(Type.JOKER) && card.getValue() == null) || card.getValue() == 0) {
            throw new CardException("Joker Card:", HttpStatus.BAD_REQUEST);
        }
    }
}
