/**
 *
 */
package iscteiul.ista.battleship;

public class Barge extends Ship {
    private static final Integer SIZE = 1;
    private static final String NAME = "Barca";

    /**
     * @param bearing - barge bearing
     * @param pos     - upper left position of the barge
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }
    /**
 * Representa uma coordenada ou disparo na grelha quadriculada de jogo.
 * Guarda a posicao (linha e coluna) e o estado do tiro no tabuleiro.
 * 
 * @author Goncalo Goncalves
 * @version 1.0
 */

    @Override
    public Integer getSize() {
        return SIZE;
    }

}
