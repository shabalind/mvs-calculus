  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s2], _ v2: Double) -> Double {
    let v24: s0 = v0.p0
    let v19: [[Double]] = v24.p1
    var v30: Double = v2
    let v42: [Double] = v19[0]
    var v47: [[Double]] = v19
    let v72: [Double] = v47[0]
    var v21: [Double] = v72
    v21[0] = v30
    v47[0] = v42
    let v45: [Double] = v19[0]
    v47[0] = v21
    let v55: Double = v72[0]
    let v78: Double = v45[0]
    let v135: Double = v2 * v55
    let v63: Double = v135 - v78
    return v63
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s2(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0]])))
    let v1: [s2] = [s2(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0]])), s2(p0: s0(p0: [[10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0]])), s2(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0]]))]
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
