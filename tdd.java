/*(1) Seja a seguinte classe e seu teste (exatamente o teste e a classe vistos em sala de aula, no final dos slides de TDD): */ 
class Dollar {
    int amount;
    Dollar(int amount) {
       this.amount= amount;
    }
    void times(int multiplier) {
       amount= amount * multiplier;
    }
 }	