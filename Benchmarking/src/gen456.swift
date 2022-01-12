  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v6: [[Double]] = v1.p1
    let v3: [Double] = v6[0]
    let v11: Double = v3[0]
    let v10: [Double] = v6[0]
    var v27: Double = v11
    let v24: [Double] = v6[0]
    let v21: [[Double]] = [v10, v24, v10, v3, v10]
    let v75: [Double] = v21[1]
    let v117: Double = v75[0]
    let v148: Double = v117 * v27
    return v148
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])]
    let v1: s0 = s0(p0: [[6.0], [7.0]], p1: [[8.0]])
    let v2: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
