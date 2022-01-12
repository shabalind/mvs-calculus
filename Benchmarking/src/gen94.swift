  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s1]]
  }
  struct s5 {
    var p0: s0
    var p1: s2
  }
  struct s6 {
    var p0: [s2]
  }
  struct s7 {
    var p0: s5
    var p1: s0
    var p2: s6
  }
  func f9(_ v0: s0) -> s0 {
    let v6: s1 = s1(p0: v0, p1: v0)
    let v15: s0 = v6.p0
    return v15
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s2, _ v2: s7, _ v3: Double) -> Double {
    let v7: s0 = f9(v0)
    var v11: Double = v3
    let v13: [[Double]] = v7.p0
    v11 = v3
    let v14: [Double] = v13[0]
    let v40: Double = v3 * v11
    let v28: Double = v40 - v11
    v11 = v28
    let v66: Double = v14[0]
    let v60: Double = v3 + v40
    var v64: [Double] = v14
    v64[0] = v11
    v64[0] = v60
    v64[0] = v66
    let v127: Double = v64[0]
    return v127
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]])
    let v1: s2 = s2(p0: s1(p0: s0(p0: [[1.0]]), p1: s0(p0: [[2.0]])), p1: [[s1(p0: s0(p0: [[3.0]]), p1: s0(p0: [[4.0]]))], [s1(p0: s0(p0: [[5.0]]), p1: s0(p0: [[6.0]]))], [s1(p0: s0(p0: [[7.0]]), p1: s0(p0: [[8.0]]))]])
    let v2: s7 = s7(p0: s5(p0: s0(p0: [[9.0]]), p1: s2(p0: s1(p0: s0(p0: [[10.0]]), p1: s0(p0: [[11.0]])), p1: [[s1(p0: s0(p0: [[12.0]]), p1: s0(p0: [[13.0]]))], [s1(p0: s0(p0: [[14.0]]), p1: s0(p0: [[15.0]]))], [s1(p0: s0(p0: [[16.0]]), p1: s0(p0: [[17.0]]))]])), p1: s0(p0: [[18.0]]), p2: s6(p0: [s2(p0: s1(p0: s0(p0: [[19.0]]), p1: s0(p0: [[20.0]])), p1: [[s1(p0: s0(p0: [[21.0]]), p1: s0(p0: [[22.0]]))], [s1(p0: s0(p0: [[23.0]]), p1: s0(p0: [[24.0]]))], [s1(p0: s0(p0: [[25.0]]), p1: s0(p0: [[26.0]]))]])]))
    let v3: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
