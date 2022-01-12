  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f44(_ v0: [Double]) -> [Double] {
    var v5: [Double] = v0
    var v6: [Double] = v0
    let v2: [[Double]] = [v5]
    let v1: [Double] = v2[0]
    var v3: [Double] = v6
    var v13: [[Double]] = v2
    v13[0] = v5
    v13[0] = v1
    v13[0] = v1
    v13[0] = v3
    let v23: [Double] = v2[0]
    var v16: [Double] = v3
    v13[0] = v23
    let v21: Double = v16[0]
    let v12: [Double] = v13[0]
    v6[0] = v21
    return v12
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v6: Double = v2 / v2
    let v8: s0 = v1[0]
    let v10: s0 = v1[1]
    let v44: [[Double]] = v8.p1
    let v58: [Double] = v44[0]
    var v52: Double = v6
    let v62: [[Double]] = v10.p1
    let v66: [Double] = v62[0]
    let v107: Double = v66[0]
    let v57: [Double] = f44(v58)
    let v65: Double = v52 - v107
    let v100: Double = v57[0]
    let v138: Double = v100 / v65
    return v138
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: [s0] = [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
