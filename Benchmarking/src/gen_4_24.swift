  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v6: [[s0]] = v0.p0
    let v4: [s0] = v6[0]
    let v3: s0 = v4[0]
    let v8: [[Double]] = v3.p0
    let v11: [Double] = v8[1]
    var v23: Double = v1
    var v44: [Double] = v11
    let v38: Double = v44[0]
    v44[0] = v23
    var v99: Double = v38
    let v59: Double = v99 * v38
    return v59
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])]]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
