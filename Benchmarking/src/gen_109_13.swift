  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: [s0], _ v3: [s0], _ v4: Double) -> Double {
    var v11: s0 = v0
    let v10: s0 = v2[0]
    let v5: s0 = v3[1]
    let v21: [[Double]] = v11.p0
    let v29: [[Double]] = v10.p0
    let v45: [[Double]] = v5.p1
    var v55: [[Double]] = v21
    let v63: [Double] = v21[1]
    v11.p1 = v45
    v11.p0 = v55
    let v44: Double = v63[0]
    v11.p0 = v29
    return v44
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: s0 = s0(p0: [[3.0], [4.0]], p1: [[5.0]])
    let v2: [s0] = [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]
    let v3: [s0] = [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])]
    let v4: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
