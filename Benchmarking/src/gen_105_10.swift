  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: s2
    var p1: s1
  }
  struct s6 {
    var p0: s4
    var p1: s0
  }
  func f12(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    var v5: s0 = v0
    var v16: [[Double]] = v2
    v5.p1 = v16
    return v5
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v6: s6 = v0[0]
    let v2: s0 = v6.p1
    let v3: s0 = f12(v2)
    let v7: [[Double]] = v3.p1
    let v14: [Double] = v7[1]
    let v35: Double = v14[0]
    return v35
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s4(p0: s2(p0: [s1(p0: s0(p0: [0.0], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [4.0], p1: [[5.0], [6.0], [7.0]])]])], p1: s0(p0: [8.0], p1: [[9.0], [10.0], [11.0]])), p1: s1(p0: s0(p0: [12.0], p1: [[13.0], [14.0], [15.0]]), p1: [[s0(p0: [16.0], p1: [[17.0], [18.0], [19.0]])]])), p1: s0(p0: [20.0], p1: [[21.0], [22.0], [23.0]]))]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
