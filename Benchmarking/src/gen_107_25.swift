  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: [[s0]] = v0.p1
    let v5: [s0] = v3[2]
    let v7: s0 = v5[0]
    let v9: [[Double]] = v7.p0
    let v15: [Double] = v9[0]
    let v14: [Double] = v9[0]
    let v24: Double = v15[0]
    let v19: Double = v14[0]
    let v35: Double = v1 / v19
    let v147: Double = v24 + v35
    return v147
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), p1: [[s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]])
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
