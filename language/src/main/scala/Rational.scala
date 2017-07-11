
/**
 * 分数を表現するプリミティブクラス
 *
 * @param n 分子
 * @param d 分母
 */
class Rational(n: Int, d:Int) {

  /** 現在持っている分子、分母の値を理解しやすい形で出力する */
  override def toString = n + "/" + d
}
