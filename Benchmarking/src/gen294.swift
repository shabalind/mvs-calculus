  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f25(_ v0: s0, _ v1: [s0], _ v2: s0) -> [s0] {
    let v10: s0 = v1[0]
    var v5: [s0] = v1
    v5[2] = v2
    var v13: [s0] = v5
    v5[1] = v10
    var v140: [s0] = v13
    let v111: [[s0]] = [v140]
    var v120: [[s0]] = v111
    let v184: [s0] = v120[0]
    return v184
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v24: [s0] = f25(v1, v0, v1)
    let v16: s0 = v24[2]
    let v73: [[Double]] = v16.p0
    let v61: [Double] = v73[0]
    let v46: Double = v61[0]
    var v129: Double = v46
    return v129
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])]
    let v1: s0 = s0(p0: [[6.0]], p1: [[7.0]])
    let v2: s0 = s0(p0: [[8.0]], p1: [[9.0]])
    let v3: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
