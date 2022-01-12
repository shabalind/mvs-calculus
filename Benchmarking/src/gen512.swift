  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s4 {
    var p0: [s1]
    var p1: s0
  }
  struct s5 {
    var p0: [s4]
    var p1: s4
  }
  struct s9 {
    var p0: s5
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v7: [Double] = [v1, v1, v1, v1, v1]
    let v8: Double = v7[3]
    var v16: [Double] = v7
    let v21: Double = v7[2]
    let v25: Double = v16[3]
    let v15: Double = v25 * v21
    let v17: Double = v25 / v25
    var v79: Double = v8
    v16[4] = v15
    v16[2] = v21
    v16[1] = v79
    return v17
  }
  func benchmark() {
    let v0: s9 = s9(p0: s5(p0: [s4(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])]), s1(p0: [s0(p0: [[2.0]], p1: [[3.0]])])], p1: s0(p0: [[4.0]], p1: [[5.0]])), s4(p0: [s1(p0: [s0(p0: [[6.0]], p1: [[7.0]])]), s1(p0: [s0(p0: [[8.0]], p1: [[9.0]])])], p1: s0(p0: [[10.0]], p1: [[11.0]]))], p1: s4(p0: [s1(p0: [s0(p0: [[12.0]], p1: [[13.0]])]), s1(p0: [s0(p0: [[14.0]], p1: [[15.0]])])], p1: s0(p0: [[16.0]], p1: [[17.0]]))), p1: [s1(p0: [s0(p0: [[18.0]], p1: [[19.0]])]), s1(p0: [s0(p0: [[20.0]], p1: [[21.0]])])])
    let v1: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
