  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v7: Double = v1
    var v2: Double = v1
    let v26: [Double] = [v1, v1, v1, v7, v2, v7, v7]
    var v30: [Double] = v26
    var v29: [Double] = v26
    v29[6] = v1
    let v58: Double = v29[4]
    v29 = v30
    v30[5] = v7
    v30[6] = v2
    var v242: Double = v58
    var v198: Double = v242
    return v198
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: s1(p0: [[s0(p0: [[6.0], [7.0]], p1: [[8.0]])]], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
