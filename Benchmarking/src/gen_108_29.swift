  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s1, _ v2: Double) -> Double {
    var v6: [[s0]] = v0
    let v4: [s0] = v6[0]
    let v7: s0 = v4[0]
    let v3: s0 = v4[0]
    let v9: [[Double]] = v3.p0
    let v26: [s0] = v0[1]
    let v23: [Double] = v9[0]
    let v29: [[Double]] = v7.p0
    var v42: [[Double]] = v29
    let v27: [Double] = v42[0]
    var v46: [[Double]] = v42
    v6[2] = v4
    v46[2] = v23
    var v59: [Double] = v27
    v42[2] = v59
    let v78: [Double] = v29[2]
    v46[2] = v78
    let v93: [Double] = v29[0]
    v46[1] = v93
    let v178: [Double] = v46[1]
    v6[2] = v26
    let v183: Double = v178[0]
    v46[2] = v23
    return v183
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]])], [s0(p0: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]])]]
    let v1: s1 = s1(p0: s0(p0: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]]))
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
