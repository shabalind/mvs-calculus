  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v2: s0 = v0[1]
    let v12: [[Double]] = v2.p1
    let v16: [[Double]] = v2.p0
    let v43: s0 = v0[1]
    var v20: s0 = v2
    let v54: [[Double]] = v2.p0
    let v34: [[Double]] = v2.p1
    v20.p0 = v16
    v20.p1 = v12
    let v40: [[Double]] = v20.p1
    v20.p1 = v34
    var v48: [[Double]] = v40
    v20.p0 = v54
    let v30: [[Double]] = v43.p1
    v20.p1 = v30
    let v64: [[Double]] = v43.p1
    let v42: [[Double]] = v20.p1
    v20.p1 = v42
    let v83: [Double] = v48[0]
    v20.p0 = v16
    v20.p1 = v64
    let v88: Double = v83[0]
    v20.p1 = v48
    return v88
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
