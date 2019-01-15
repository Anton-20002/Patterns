package Chain;

abstract class Chain {

  private Chain chain;
  abstract void action();

  void setCh(Chain chain){
    this.chain = chain;
  }

  void getChain() {
    action();
    if (chain!=null){
      chain.getChain();
    }
  }

}
